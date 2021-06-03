package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流 输入 读取数据
 */
public class filereader {


    public static void main(String[] args) throws IOException {
        read();
    }

    private static void read() throws IOException {
            //1.创建 字符流 输入流  读取数据
            FileReader fr = new FileReader("D:\\JAVA\\FileIO\\file\\a.txt");
            // fr.read()////每次读到一个字符 不可能这样，一次读一个

            int len;//定义长度
            char c [] = new char[1024];
            //2.循环遍历
            while ((len=fr.read(c))!=-1){
                //System.out.print((char)len); 如果每次读取多个，输出 就不能把值赋值到char
                System.out.println(new String(c,0,len));
            }

            //3.释放资源

            fr.close();

    }


}
