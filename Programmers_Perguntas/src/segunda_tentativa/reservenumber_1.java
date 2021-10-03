package segunda_tentativa;

public class reservenumber_1 {
	public int[] solution(long n) {
		String s = String.valueOf(n);
		//String 을 String builder 로 넣어준다
		StringBuilder sb =new StringBuilder(s);
		sb= sb.reverse();
		String[] stringArr=sb.toString().split("");
		int[]answer = new int[sb.length()];
		for(int i=0; i<sb.length();i++) {
			answer [i]= Integer.parseInt(stringArr[i]);
		}
		return answer;
		}
	}

class test extends reservenumber_1 {
private void main() {
	// TODO Auto-generated method stub
	long n = 56789;
	System.out.println();
	
	

}
}
