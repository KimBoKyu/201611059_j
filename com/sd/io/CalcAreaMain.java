package com.sd.io;
import java.util.*;

public class CalcAreaMain{
	public static void main(String[] args){
		String radious;
		double area; 
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		double r = sc.nextDouble();
		area = (Math.PI)*(Math.pow(r,2));
		System.out.printf("반지름 : %.1f, 넓이 : %.1f"+"\n",r,area);
	}
}
