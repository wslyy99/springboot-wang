package com.springboot.wang.common;/**
 * Created by wangshuai on 2017/6/23.
 */

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author wang
 * @date 2017-06-23-15:26
 */
public class ComplexSocketProcessingService {

    /** Port that server socket listens on */
    public static final int SERVER_SOCKET_PORT = 8585;

    @Test
    public void doComplexSocketProcessingTest() throws Exception {
        Socket socket = new Socket("172.16.10.14", SERVER_SOCKET_PORT);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Send identity messages.
        socket.getOutputStream().write("$AVSYS,99999999,V1.17,SN0000103,32768*16\n".getBytes());
        socket.getOutputStream().flush();

        socket.getOutputStream().write(
                "$EAVSYS,99999999,12345678901234567890,7775551212,Test,V1.17,*0B\n".getBytes());
        socket.getOutputStream().flush();

        socket.getOutputStream().write("$ECHK,99999999,1*0B\n".getBytes());
        socket.getOutputStream().flush();

        // Read handshake message.
        String echk = input.readLine();
        Assert.assertTrue(echk.startsWith("$ECHK"));

        // Send location message with no ack desired.
        socket.getOutputStream().write(
                "$AVRMC,99999999,144811,A,4351.3789,N,07923.4712,W,0.00,153.45,091107,0,123,161,1,1,1500,1700*64\n".getBytes());
        socket.getOutputStream().flush();

        // Send location message with ack desired.
        socket.getOutputStream().write(
                "$AVRMC,99999999,144811,a,4351.3789,N,07923.4712,W,0.00,153.45,091107,0,123,161,1,1,1500,1700*64\n".getBytes());
        socket.getOutputStream().flush();

        // Read location ack message.
        String eavack = input.readLine();
        Assert.assertTrue(eavack.startsWith("$EAVACK"));

        socket.getOutputStream().close();
        socket.close();
    }
}
