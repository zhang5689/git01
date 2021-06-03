package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * InputStream 输入流 读
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //in1();
        in2();
    }

    private static void in1() throws IOException {
        //1.创建输入流对象 读
        FileInputStream fis = new FileInputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        //2.读取数据
        int read = fis.read();//每次读一个字节
        System.out.println((char)read);

        //3.释放资源，关闭流
        fis.close();

    }
    private static void in2() throws IOException {
        //1.创建输入流对象 读
        FileInputStream fis = new FileInputStream("D:\\JAVA\\FileIO\\file\\a.txt");
        //2.读取数据
        int b ;
        while((b = fis.read())!=-1){
            System.out.print((char)b);
        }

        //3.释放资源，关闭流
        fis.close();

    }


}
