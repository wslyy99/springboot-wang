package com.springboot.wang.netty.handler;/**
 * Created by wangshuai on 2017/7/7.
 */

/**
 * @author wang
 * @date 2017-07-07-10:24
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

import org.apache.log4j.Logger;



public class TcpServerHandler extends ChannelInboundHandlerAdapter{
    private static final Logger logger = Logger.getLogger(TcpServerHandler.class);

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        if (msg instanceof ByteBuf) {
            ByteBuf buf = (ByteBuf) msg;
            byte[] dst = new byte[buf.capacity()];
            buf.readBytes(dst);
            logger.info("SERVER接收到消息:" + new String(dst));

            byte[] dest = (new String(dst)+". yes, server is accepted you ,nice !").getBytes();
            ByteBuf destBuf = ctx.alloc().buffer(dest.length);
            destBuf.writeBytes(dest);
            //flush后关闭通道（短连接）
            ctx.channel().writeAndFlush(destBuf).addListener(ChannelFutureListener.CLOSE);

            ReferenceCountUtil.release(msg);
        } else {
            logger.warn("error object !");
        }
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
                                Throwable cause) throws Exception {
        logger.warn("Unexpected exception from downstream.", cause);
        ctx.close();
    }
}

