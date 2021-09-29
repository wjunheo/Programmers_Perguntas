package segunda_tentativa;

public class deletelastandsmallNumber {
	public int[] deletelastandsmallNumber(int[] arr) {
		int[] answer = {};
		int index=0; 
		int min = arr[0];
		
		if(arr.length==1) {
			answer = new int[1];
			answer[0]=1;
		} else {
			answer = new int [arr.length-1];
			//아닐 경우 최소값이 사라지므로 길이 -1
			for(int i=1; i<arr.length; i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			for(int j=0; j<answer.length; j++) {
				if(arr[j]==min) {
					answer[j]= arr[++index];
					//answer[0]=arr[1]
					index++;
				}else {
					answer[j]=arr[index];
					index++;
				}
			}
		}
	}

}
