package segunda_tentativa;

public class Number_English_2 {



    public int solution(String s) {
    	String[] arr= {
    			"zero","one","two","three",
    			"four","five","six","seven",
    			"eight","nine"}; // ����ε� ���ڸ� �迭�� �־���
    	for(int i =0; i<arr.length; i++) { // ���ڸ�  0 ���� 9���� ����
    		// ���� ���ڰ� arr[i]���� �����ڿ� ��ġ�ϸ�  ���ڷ� �ٲ���
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
