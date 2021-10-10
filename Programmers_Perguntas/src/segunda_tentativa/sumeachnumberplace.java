package segunda_tentativa;

public class sumeachnumberplace  {
	public static void main(String[] args) {
		System.out.println();
	}

}
 static class Solution {
    public int solution(int n) {
    	String[] strarr = String.valueOf(n).split("");
    	int answer=0;
    	for( String str:strarr) {
    		answer+=Integer.valueOf(str);
    	}
    	System.out.println(answer);
    	return answer;
    }
}