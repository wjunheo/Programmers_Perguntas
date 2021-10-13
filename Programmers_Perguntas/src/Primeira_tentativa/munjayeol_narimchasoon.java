package Primeira_tentativa;

import java.util.Arrays;
import java.util.Collections;

public class munjayeol_narimchasoon extends Sol {
	public static void main(String[] args) {
		String s= "alfjaljfkl";
Sol answer = new Sol();
System.out.println(answer.solution(s));
	}

}

class Sol{
	public String solution(String s) {
		String [] str = s.split("");
		Arrays.sort(str);
		Collections.reverse(Arrays.asList(str));
		
		return String.join("", str);
	}
}
