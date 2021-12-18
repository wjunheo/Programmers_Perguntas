package Primeira_tentativa;

public class yaksusomaoumenos {
	public static void main(String[] args) {
		 int left = 13;
		 int right= 17;
		 int answer= 0;
    	for(int i= left; i<right+1; i++) {
    		int count=0;
    		for(int y=1; y<=i; y++) {
    			if(i%y==0) {
    				count++;
    			}
    		}     		 
        	if(count%2==0) {
        		answer += i;
        	} else {
        		answer -= i;
        	}
    	}
    	System.out.println(answer);
    }
}


