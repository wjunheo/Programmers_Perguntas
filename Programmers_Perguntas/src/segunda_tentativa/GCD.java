package segunda_tentativa;

public class GCD {
	private void mian() {
		// TODO Auto-generated method stub
		int n=36;
		int m=42;
		int[] answer = new int[2];
		if(n<m) {
			for (int i=1; i<m; i++) {
				if(n%1 ==0 && m%i==0) {
					answer[0]=i;
					answer[1]=(m*n)/i;
				}
			}
		}else {
			for(int i=1; i<n; i++) {
				if(n%1==0 && m%i==0) {
					answer[0]=i;
					answer[1]=(m*n)/i;
				}
			}
		}System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
