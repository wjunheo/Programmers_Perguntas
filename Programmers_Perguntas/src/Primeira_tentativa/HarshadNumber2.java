package Primeira_tentativa;


public class HarshadNumber2 {
    public boolean solution(int x) {
    	boolean answer =true;
    	
    	int num =x;
    	int sum =0;
    	
    	while(num!=0) {
    		sum+= num%10;
    		num= num/10; //�ڸ����� �ɰ��� ���� ���س���
    	}
    	if (x%sum !=0) {
    		answer =false;
    	}
    	return answer;
}
}

