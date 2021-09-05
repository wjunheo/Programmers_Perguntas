package Primeira_tentativa;

import java.util.Scanner;

public class Number_English {
//s 가 매개 변수 s가 의미하는 원래 숫자 return
	//if 문
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println();
	
	}
	
	public static int solution(String s) {
		
	
	String []arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
	
	for(int i=0; i<arr.length;i++) {
		s=s.replace(arr[i],String.valueOf(i)); // Interger.tostring 도가능
		
	}
	return Integer.parseInt(s);
	
}
}

