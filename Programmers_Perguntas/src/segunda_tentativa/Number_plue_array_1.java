package segunda_tentativa;

import java.util.Scanner;

public class Number_plue_array_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int n= sc.nextInt();
		long[] answer= new long[n];
		
		for(int i=0; i<n; i++) {
			answer[i]=x*(1+i);
			
		}
		System.out.println(answer);
	}
}