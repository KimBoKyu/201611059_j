package com.sd.io;
import java.util.*;
import java.io.*;

public class PrintFile{
	public static void main(String[] args){
		try{
			File f = new File("noname.txt");
			FileReader fr = new FileReader(f);
		} catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다");
		} finally{
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	}
}

