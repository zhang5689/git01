package com.file;

import java.io.File;

public class Test01 {


    public static void listAllFiles(File dir) {
        //是否空值，是否存在
        if (dir == null || !dir.exists()) {
            return;
        }
        //是否是标准文件
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\FileIO\\file");

        Test01.listAllFiles(file);
    }
}
