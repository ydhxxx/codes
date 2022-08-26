package com.yudh.util.stream;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author yudh
 * @date 2022-03-19 18:13
 */
public class CloseStream {

    /**
     * 关闭各类文件输入输出流
     *
     * @param closeable
     */
    public static void closed(Closeable closeable){
        if (closeable != null){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
