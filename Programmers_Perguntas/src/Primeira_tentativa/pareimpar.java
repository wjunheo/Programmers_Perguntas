package Primeira_tentativa;

import java.util.Scanner;

public class pareimpar {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	
	if(num%2==0) {
		System.out.println("Even");
	} else {
		System.out.println("Odd");
	}
	
}
}
