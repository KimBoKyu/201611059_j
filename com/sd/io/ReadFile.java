package com.sd.io;
import java.util.*;
import java.io.*;

public class ReadFile{
	public static void main(String args[]) throws Exception {
		try{
			FileReader fr = new FileReader("/Users/KimBoKyu/Documents/text.txt"); 
			BufferedReader br = new BufferedReader(fr); 
			String s;
			while((s = br.readLine()) != null) { 
			    System.out.println(s); 
			} 
			fr.close();
		} catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");
		} finally{
			System.out.println("프로그램 종료");
		}		
    }
}