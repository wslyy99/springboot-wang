package com.springboot.wang.common;/**
 * Created by wangshuai on 2017/6/23.
 */

import com.springboot.wang.SpringbootWangWebApplicationTests;
import org.junit.Test;

import java.net.Socket;

/**
 * @author wang
 * @date 2017-06-23-13:53
 */
public class GroorbySocketService extends SpringbootWangWebApplicationTests {

    /** Hardware id for test message */
    private static final String HARDWARE_ID = "aaa";

    /** Port that server socket listens on */
    public static final int SERVER_SOCKET_PORT = 8585;

    @Test
    public void doGroovySocketDecoderTest() throws Exception {
        Socket socket = new Socket("172.16.10.14", SERVER_SOCKET_PORT);
        String message = "LOC," + HARDWARE_ID + ",33.7550,-84.3900";
        byte[] encoded = message.getBytes();
        socket.getOutputStream().write(encoded);
        socket.getOutputStream().flush();
        socket.getOutputStream().close();
        socket.close();
    }
}
