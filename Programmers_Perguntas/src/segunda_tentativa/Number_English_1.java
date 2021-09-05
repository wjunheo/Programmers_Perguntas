package segunda_tentativa;

public class Number_English_1 {

}
class Solution {
    public int solution(String s) {
    	String [] arr= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		for(int i =0; i<arr.length; i++) {
			s= s.replace(arr[i], String.valueOf(i));
		}
    	
    	
    	return Integer.parseInt(s);
  
    
    
    }
}