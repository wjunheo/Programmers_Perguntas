package Primeira_tentativa;

import java.util.Scanner;

public class HarshadNumber {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int n= sc.nextInt();
//	if(n%(n/10+n%10)==0) {
//		System.out.println("true");
//		
//	}else System.out.println("false");
//	 public boolean solution(int x) {
//	        boolean answer = true;
//	        int sum=0;
//	        int n =x;
//	        while(x!=0) {
	 int num =301;
	 int sum=0;
			 
	while(num!=0) {
		sum+= num%10;
		System.out.println(sum);
		num = num/10;
		System.out.println("a"+num);
	}
	if(13%sum !=0) {
		System.out.println(13%sum+"false");
	} 
		System.out.println("true");
	
}

}
