package qr.program.api.utils;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * @Author qr
 * @Date 2022/5/2-16:51
 */
public class FileTool {

    public static void main(String[] args) {
        clearFolderFilePrefix("/Users/qr/Downloads/排序算法");
    }

    /**
     * 去除某个文件夹下所有文件的前缀
     * @param path 文件夹路径
     */
    public static void clearFolderFilePrefix(String path) {
        File file = FileUtil.file(path);
        if (file == null || file.isFile()) {
            System.out.println("Invalid Folder");
            return;
        }
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Empty Folder");
            return;
        }
        for (File listFile : files) {

        }
    }
}
