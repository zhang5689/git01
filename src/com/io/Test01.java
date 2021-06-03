package com.io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
       // out();
        // out2();
        //out3();
        //out4();
        out5();

    }
    public static void  out() throws IOException {
        //1.创建字节输出流对象  写
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        //2.写 write(int b) 将指定字节写入此文件输出流
        fos.write(97);//a
        fos.write(98);//b
        fos.write(99);//c
        fos.write(100);//d
        //3.关闭流
        fos.close();
    }
    public static void  out2() throws IOException {
        //1.创建字节输出流对象  写
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        //2.把字符串转为字节数组
        byte[] b = "我要学java".getBytes();
        fos.write(b);
        //3.关闭流
        fos.close();
    }
    public static void  out3() throws IOException {
        //1.创建字节输出流对象  写
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        //2.把字符串转为字节数组
        byte[] b = "abcdefg".getBytes();
        fos.write(b,2,2);
        //3.关闭流
        fos.close();
    }
    public static void  out4() throws IOException {
        //1.创建字节输出流对象  写       加一个true 每次值不覆盖
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\a.txt",true);
        //2.把字符串转为字节数组
        byte[] b = "abcdefg".getBytes();
        fos.write(b,2,2);
        fos.write(b,0,b.length);
        //3.关闭流
        fos.close();
    }
    //写入数据并换行
    public static void  out5() throws IOException {
        //1.创建字节输出流对象  写       加一个true 每次值不覆盖
        FileOutputStream fos = new FileOutputStream("D:\\JAVA\\FileIO\\file\\a.txt",true);
        //2.把字符串转为字节数组
        byte[] b = {97,98,99};
        for(int i =0;i<b.length;i++){
            fos.write(b[i]);
            fos.write("\r".getBytes());
        }
        //3.关闭流
        fos.close();
    }
}
