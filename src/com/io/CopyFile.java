package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile  {
    public static void main(String[] args) throws IOException {
        copy();
    }

    private static void copy() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\copya.txt");
        int len;
        byte[] b= new byte[1024];
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
