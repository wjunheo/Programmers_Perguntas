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
	 * �� 4�ڸ��� ������ ��� ���ڸ� ����
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
        String answer = ""; //�ؽ� ������ ��Ʈ������ ��ü ����
        String[] a = phone_number.split("");
        // �ϳ��� �߶� a ��� ���ڿ� �迭�� ����
        for(int i=0; i<a.length;i++) {
        	//�߶� �־� ���� ���ڿ� �迭 ��ŭ ���ڸ� �̾Ƴ�
        	if( i<(a.length-4)) {
        		answer +="*";
        	}else {
        		answer +=a[i];
        	}
        }
        return answer;
    }
}
