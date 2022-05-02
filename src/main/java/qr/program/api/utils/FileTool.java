package qr.program.api.utils;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Assert;

import java.io.File;

/**
 * @Author qr
 * @Date 2022/5/2-16:51
 */
public class FileTool {


    public static void main(String[] args) {
        String path = "/Users/qr/Downloads/网络编程";
        clearFolderFilePrefix(path, "从通信协议到Netty RPC框架打造的Java网络编程课，全面又深入，学它就够了 - ");
    }

    public static void listFolderFiles(String path) {
        Assert.notBlank(path, "Path must not be blank");
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
        for (File f : files) {
            System.out.println(f);
        }
    }

    /**
     * 去除某个文件夹下所有文件的前缀
     * @param path 文件夹路径
     */
    public static void clearFolderFilePrefix(String path, String prefix) {
        Assert.notBlank(path, "Path must not be blank");
        Assert.notBlank(prefix, "Prefix must not be blank");
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
        for (File f : files) {
            String oldFilename = f.getName();
            String newFileName = oldFilename.replace(prefix, "");
            FileUtil.rename(f, newFileName, true);
            System.out.printf("File: %s rename to %s\n", oldFilename, newFileName);
        }
        System.out.println("重命名完成");
    }
}
