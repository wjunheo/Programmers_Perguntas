package segunda_tentativa;

public class hide_number_2 {
	public String solution(String phone_number) {
		System.out.println(phone_number);
		String answer =""; //엔써 변수를 스트링으로 객체 생성
		String[] a = phone_number.split("");
		//하나씩 잘라서 a 라는 문자열 배열 ㅈ장
		for(int i=0; i<a.length;i++) {
			//잘라 넣어 만든 문자열 배열 만큼 숫자를 뽑아냄
			if( i< (a.length-4)) {
				answer += "*";
				
			} else {
				answer += a[i];
			}
		}
		return answer;
	}

}
