package com.yudh.util;

import com.yudh.util.file.FileUtils;
import com.yudh.util.file.ZipFileUtils;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;

/**
 * @author yudh
 * @date 2022-03-19 18:13
 */
public class Main {
    public static void main(String[] args) {
        // 创建文件
        File file = new File("G://demo//demo01/01.txt");
        FileUtils.createNewFile(file);
        // 写入文件数据
        FileUtils.writeTxt(file,"123\n456\n789\n", false);
        // 读取文件数据
        System.out.printf(FileUtils.readFile(file));

        File file2 = new File("G://demo//demo01/02.txt");
        FileUtils.createNewFile(file2);
        // 写入文件数据
        FileUtils.writeTxt(file2,"123456789\n",false);

        File zipFile = new File("G://demo//demo01.zip");
        try {
            ZipFileUtils.zipAll(zipFile,"G://demo//demo01");
            ZipFileUtils.unzipAll(zipFile,"G://demo//demo01unzip");
        } catch (ZipException e) {
            e.printStackTrace();
        }
        // 删除所有文件
        FileUtils.deleteAllFiles(new File("G://demo"));
    }
}
