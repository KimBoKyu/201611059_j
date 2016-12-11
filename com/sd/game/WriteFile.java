package com.sd.game;
import java.io.*;
import java.util.*;
public class WriteFile{
	static Scanner scan = new Scanner(System.in);
	public static void write(String name){
		try{
			FileWriter file = new FileWriter(name+".txt");
			BufferedWriter bf = new BufferedWriter(file);
			String str = scan.nextLine();
			bf.write(name);
			bf.write("\t");
			bf.write(str);
			bf.newLine();
			bf.close();} 
		catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}	
	}
}