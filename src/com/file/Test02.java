package com.file;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
		//1.需求，打印出D:\zzw\file 目录下面的所有文件
		//2.需求，查找出D:\zzw\file文件下面的.java文件
		
		File file = new File("D:\\zzw\\file");

		
		test01(file);
	}

	private static void test01(File file) {

		//1.得到所有Files
		File[]  files = file.listFiles();
		//2.循环遍历
		for(File f:files){
			
			//判断文件是否是目录
			if(f.isDirectory()){
				//System.out.println("是目录"+f);
				//如果是目录，则再获取所有目录下面的所有Files
				test01(f);
			}else{
				//System.out.println("是文件打印"+f);
				
				//System.out.println(f.getName());
				if(f.getName().endsWith(".java")){
					System.out.println("后缀名为.java的为:"+f);
				}
			}
		}
		
	}
}
