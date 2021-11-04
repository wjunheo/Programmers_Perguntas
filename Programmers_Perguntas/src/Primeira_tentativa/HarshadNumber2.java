package Primeira_tentativa;


public class HarshadNumber2 {
    public boolean solution(int x) {
    	boolean answer =true;
    	
    	int num =x;
    	int sum =0;
    	
    	while(num!=0) {
    		sum+= num%10;
    		num= num/10; //자릿수를 쪼개서 합을 구해나감
    	}
    	if (x%sum !=0) {
    		answer =false;
    	}
    	return answer;
}
}

