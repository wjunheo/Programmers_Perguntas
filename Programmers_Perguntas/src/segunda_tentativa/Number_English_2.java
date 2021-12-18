package segunda_tentativa;

public class Number_English_2 {



    public int solution(String s) {
    	String[] arr= {
    			"zero","one","two","three",
    			"four","five","six","seven",
    			"eight","nine"}; // 영어로된 숫자를 배열에 넣어줌
    	for(int i =0; i<arr.length; i++) { // 숫자를  0 부터 9까지 뽑음
    		// 뽑은 숫자가 arr[i]값의 영문자와 일치하면  숫자로 바꿔줌
    		s= s.replace(arr[i], String.valueOf(i));
    	}
    
     return Integer.parseInt(s);
    }
}
//	public static void main(String[] args) {
//		for(int i =0; i<10; i++) {
//			System.out.println(i);
//		}
//	}
//}
