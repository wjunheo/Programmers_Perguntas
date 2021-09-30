package Primeira_tentativa;

//public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("Numero").append("soma");
//	String str= sb.toString();
//	// string에 stringBuilder 그대로 넣을 수 없음
//	System.out.println(sb);
//	System.out.println(str);
// String Builder 연습


public class reversenumber2 {
public int [] solution(long n) {
	/* 1)문자열 + 숫자 = 문자열을 이용하여 long-> string으로 바꿔 할당하기
	 * 2) % 연산자 이용하여 나머지 값을 이용
	 * 3) /= 연산자를 이용하여 반복 한 것
	 * 4) 0.1이 0 으로 표시되는것을 활용하여 while 반복문을 사용
	 */
	//문자열 + 숫자 = 문자열
	String a = "" +n;
	//a 의 길이만큼 anwer 이라는 int 배열 생성
	int[] answer = new int[a.length()];
	
	int cnt = 0;
	while (n>0) {
		/* 12345 % 10 = 5
		 * 1234 % 10 =4
		 * 123 %10= 3
		 * 12% 10 =2
		 * 1%10 =1
		 */
		answer[cnt] =(int)(n%10);
		
		//12345 = 1234
		//1234 = 123
		//123=12
		//12=1
		//1=0(0.1) 인데 인트이므로 0
		n= n/10;
		cnt++;
	}
	return answer;
}
	
	
}	



