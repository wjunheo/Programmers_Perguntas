package Primeira_tentativa;

//public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("Numero").append("soma");
//	String str= sb.toString();
//	// string�� stringBuilder �״�� ���� �� ����
//	System.out.println(sb);
//	System.out.println(str);
// String Builder ����


public class reversenumber {
public int [] solution(long n) {
	//long -> string
	String s = String.valueOf(n);
	//string ��ü�� �ѹ� �����Ǹ� ������ �Ұ��ϱ⶧���� string builder ����������
	//stringbuilder ���� reverse �޼ҵ� ��� ����
	StringBuilder sb = new StringBuilder(s);
	//reverse �� ���ڿ� ������
	sb= sb.reverse();
	// String.split("")�� �� ���ھ� �߶� �迭�� ���
	String[] stringArr=sb.toString().split("");
	//���ڿ� ���� ��ŭ �迭 ���� �Ҵ� -> for ������ �迭 �̾Ƴ��� �ڸ� string �ֱ�
	int[] answer = new int[sb.length()];
	//string -> int -> int[]
	for(int i=0; i<sb.length();i++) {
		answer[i] = Integer.parseInt(stringArr[i]);
	}
	return answer;
}
	
	
}	



