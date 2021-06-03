package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        write();
    }

    private static void write() throws IOException {
        FileWriter fw = new FileWriter("D:\\JAVA\\FileIO\\file\\write.txt");
        FileReader fr = new FileReader("D:\\JAVA\\FileIO\\file\\a.txt");
        int len;//定义长度
        char c [] = new char[1024];
        //2.循环遍历
        while ((len=fr.read(c))!=-1){
            //System.out.print((char)len); 如果每次读取多个，输出 就不能把值赋值到char
            //System.out.println(new String(c,0,len));
            fw.write(new String(c,0,len));
        }
        fw.close();
        fr.close();


    }
}
