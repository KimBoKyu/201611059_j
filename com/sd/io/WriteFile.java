package com.sd.io;
import java.io.*;

public class WriteFile{
	public static void main(String[] args){
		try{
			FileWriter file = new FileWriter("test.txt");
			BufferedWriter bf = new BufferedWriter(file);
			String str = "buffer test file";
			bf.write(str);
			bf.newLine();
			bf.close();} 
		catch(IOException e){
			System.out.println(e);
			System.out.println("위와같은 에러");
			System.exit(1);
		}		
	}
}