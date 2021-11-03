package Primeira_tentativa;

import java.util.Scanner;

public class hide_number extends Solution {
public static void main(String[] args) {
	Solution A= new Solution();
	String answer = A.solution("010-1111-1111");
	System.out.println(answer);
}
	
}
	/*
	 * 뒤 4자리를 제외한 모든 숫자를 별로
	 */
	
//	public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int a= sc.nextInt();
//	String phone_number;
//	String[] a = phone_number.split("");
//		for(int i=0; i<a
//	}
//}

class Solution {
    public String solution(String phone_number) {
    	System.out.println(phone_number);
        String answer = ""; //앤써 변수를 스트링으로 객체 생성
        String[] a = phone_number.split("");
        // 하나씩 잘라서 a 라는 문자열 배열에 저장
        for(int i=0; i<a.length;i++) {
        	//잘라 넣어 만든 문자열 배열 만큼 숫자를 뽑아냄
        	if( i<(a.length-4)) {
        		answer +="*";
        	}else {
        		answer +=a[i];
        	}
        }
        return answer;
    }
}
