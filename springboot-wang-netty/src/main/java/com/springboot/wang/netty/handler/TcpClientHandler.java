package com.springboot.wang.netty.handler;/**
 * Created by wangshuai on 2017/7/7.
 */

/**
 * @author wang
 * @date 2017-07-07-10:25
 */
import org.apache.log4j.Logger;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;


public class TcpClientHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = Logger.getLogger(TcpClientHandler.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        if(msg instanceof ByteBuf){
            ByteBuf buf = (ByteBuf)msg;
            byte[] dst = new byte[buf.capacity()];
            buf.readBytes(dst);
            logger.info("client接收到服务器返回的消息:"+new String(dst));
            ReferenceCountUtil.release(msg);
        }else{
            logger.warn("error object");
        }

    }


}