package Primeira_tentativa;

//public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder();
//	sb.append("Numero").append("soma");
//	String str= sb.toString();
//	// string�� stringBuilder �״�� ���� �� ����
//	System.out.println(sb);
//	System.out.println(str);
// String Builder ����


public class reversenumber2 {
public int [] solution(long n) {
	/* 1)���ڿ� + ���� = ���ڿ��� �̿��Ͽ� long-> string���� �ٲ� �Ҵ��ϱ�
	 * 2) % ������ �̿��Ͽ� ������ ���� �̿�
	 * 3) /= �����ڸ� �̿��Ͽ� �ݺ� �� ��
	 * 4) 0.1�� 0 ���� ǥ�õǴ°��� Ȱ���Ͽ� while �ݺ����� ���
	 */
	//���ڿ� + ���� = ���ڿ�
	String a = "" +n;
	//a �� ���̸�ŭ anwer �̶�� int �迭 ����
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
		//1=0(0.1) �ε� ��Ʈ�̹Ƿ� 0
		n= n/10;
		cnt++;
	}
	return answer;
}
	
	
}	



