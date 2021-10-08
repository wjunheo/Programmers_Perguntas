package segunda_tentativa;

public class CreateOddLetter {
	public static void main(String[] args) {
		
	Solution sol = new Solution();
	
	String s ="ai tudobem?";
	System.out.println(sol.solution(s));
	
	}
	
	static class Solution {
		public String solution(String s) {
			String answer="";
			String[] str =s.split("");
			
			int idx=0;
			for(int i =0; i<str.length;i++) {
				if(str[i].equals(" ")) {
					idx=0;// ºóÄ­ÈÄ´Â »õ·Î¿î ¹®ÀÚ
				}else if(idx%2==0) {
					str[i]=str[i].toUpperCase();
					idx++;
				}else if(idx%2!=0) {
					str[i]=str[i].toLowerCase();
					idx++;
				}
				answer += str[i];
			}
			return answer;
		}
	}

}


/* class Solution{
 * public String solution(String s){
 * 	String answer="";
 * int cnt = 0;
 * String [] array = s.split("");
 * 
 * for(String ss: array) {
 * cnt = ss.contains(" ")?: cnt+1;
 * answer +=cnt%2==0? ss.toLowerCase(): ss.toUpperCase();
 * }
 * return answer;
 * }
 * }
 */
