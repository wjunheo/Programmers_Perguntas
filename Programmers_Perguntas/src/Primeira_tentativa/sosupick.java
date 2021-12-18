package Primeira_tentativa;

public class sosupick { 
	public static void main(String[] args) {
		int n=10;
	        int []arr= new int[n];
	        int num=1;
	        int answer = 0;
	        for (int i=0; i<arr.length; i++) {
	        	arr[i]=num;
	        	num++;
	        	System.out.println(arr[i]);
	        	//2 3 5 7
	        if(arr[i]%i==0) {
	        	
	        	
	        }else {
	        	answer++;
	        }
	        }	
	        System.out.println(answer-1);
	        
	       
	}
}
//	static class Solution {
//		public int solution(int n) {
//        int []arr= new int[n];
//        int num=1;
//        for (int i=0; i<arr.length; i++) {
//        	arr[i]=num;
//        	num++;
//        	
//        }
//        int answer = 0;
//        return answer;
