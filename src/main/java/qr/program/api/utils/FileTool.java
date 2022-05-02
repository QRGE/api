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
        String path = "/Users/qr/Downloads/排序算法";
        clearFolderFilePrefix(path, "【黑马】数据结构与算法之经典排序算法【配套源码+笔记】 - ");
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
        }
        System.out.println("重命名完成");
    }
}
