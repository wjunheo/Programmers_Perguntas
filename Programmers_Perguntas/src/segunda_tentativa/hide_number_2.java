package segunda_tentativa;

public class hide_number_2 {
	public String solution(String phone_number) {
		System.out.println(phone_number);
		String answer =""; //���� ������ ��Ʈ������ ��ü ����
		String[] a = phone_number.split("");
		//�ϳ��� �߶� a ��� ���ڿ� �迭 ����
		for(int i=0; i<a.length;i++) {
			//�߶� �־� ���� ���ڿ� �迭 ��ŭ ���ڸ� �̾Ƴ�
			if( i< (a.length-4)) {
				answer += "*";
				
			} else {
				answer += a[i];
			}
		}
		return answer;
	}

}
