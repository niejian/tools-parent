package io.git.nj.tools.pingpong.server;

import io.git.nj.tools.pingpong.utils.NetUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * server 端
 * @desc: io.git.nj.tools.pingpong.server.PingpongServer
 * @author: niejian9001@163.com
 * @date: 2020/12/16 16:29
 */
@Slf4j
public class PingpongServer {
    private Integer port;

    public PingpongServer(Integer port) {
        this.port = port;
    }

    /**
     * 服务启动
     * @param port 启动端口号
     */
    public void startServer(Integer port) {
        if (port <= 0) {
            port = NetUtils.getAvailablePort();
        }

    }
}
