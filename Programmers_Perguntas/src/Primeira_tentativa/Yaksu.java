package Primeira_tentativa;

import java.util.Scanner;

public class Yaksu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int sum =0;
		for ( int i=1; i<=N;i++) {
			if(N%i==0) {
				System.out.println("¾à¼ö"+i);
				sum+=i;
				
			}
		}System.out.println(sum);
		
	}

}
