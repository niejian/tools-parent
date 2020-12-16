package io.git.nj.tools.pingpong.utils;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;

/**
 * @desc: io.git.nj.tools.pingpong.utils.NetUtils
 * @author: niejian9001@163.com
 * @date: 2020/12/16 16:51
 */
public class NetUtils {

    private static final int RND_PORT_START = 30000;
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    private static final int RND_PORT_RANGE = 10000;


    /**
     * 获取随机端口
     * @return
     */
    public static int getAvailablePort() {
        ServerSocket ss = null;
        try {

            ss = new ServerSocket();
            ss.bind(null);
            return ss.getLocalPort();

        } catch (IOException e) {
            e.printStackTrace();
            return getRandomPort();
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static int getRandomPort() {
        return RND_PORT_START + RANDOM.nextInt(RND_PORT_RANGE);
    }
}
