package Primeira_tentativa;

//public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("Numero").append("soma");
//	String str= sb.toString();
//	// string에 stringBuilder 그대로 넣을 수 없음
//	System.out.println(sb);
//	System.out.println(str);
// String Builder 연습


public class reversenumber {
public int [] solution(long n) {
	//long -> string
	String s = String.valueOf(n);
	//string 객체는 한번 생성되면 변경이 불가하기때문에 string builder 를생성해줌
	//stringbuilder 덕에 reverse 메소드 사용 가능
	StringBuilder sb = new StringBuilder(s);
	//reverse 로 문자열 뒤집기
	sb= sb.reverse();
	// String.split("")로 한 글자씩 잘라 배열에 담기
	String[] stringArr=sb.toString().split("");
	//문자열 길이 만큼 배열 길이 할당 -> for 문으로 배열 뽑아내서 자른 string 넣기
	int[] answer = new int[sb.length()];
	//string -> int -> int[]
	for(int i=0; i<sb.length();i++) {
		answer[i] = Integer.parseInt(stringArr[i]);
	}
	return answer;
}
	
	
}	



