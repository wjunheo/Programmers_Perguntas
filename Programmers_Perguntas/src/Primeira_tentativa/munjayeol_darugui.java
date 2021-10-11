package Primeira_tentativa;

public class munjayeol_darugui {
	public static void main(String[] args) {
		String str= "123456";
		
		if(str.length()==6||str.length()==4) {
			try {
				int x =Integer.parseInt(str);
				System.out.println(true);
			} catch(NumberFormatException e) {
				System.out.println(false);
				
			}
		}
		else {
			System.out.println(false);
		}
	}

}
