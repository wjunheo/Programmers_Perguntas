package Primeira_tentativa;

import java.util.ArrayList;
import java.util.List;

public class smallnumberDelete {
	public int[] smallnumberDelete(int[] arr) {
		int[] answer= {};
		List<Integer>arr2= new ArrayList<Integer>();// 배열에서 바로 삭제가 안됨으로 arraylist생성
		//원소가 1개 이하면 무조건 가장 작은 수 이므로 제거된다 -> -1 을 리턴
		if(arr.length<=1) {
			answer= new int[] {-1};
			return answer;
		}
		for(int i=0; i<arr.length; i++ ) {//배열 원소를 arraylist에 넣어줌
			arr2.add(arr[i]);
		}
		int min=0;// 가장 작은 원소의 인덱스, 처음ㅇ에는 무조건 첫번쨰 인덱스가 작다고 가정
		for(int i=1; i<arr.length;i++) {
			if(arr[min]>arr[i]) {
				min=i; //min에 가장 작은 값으 인덱스를 넣어줌
			}
		}
		arr2.remove(min);// 해당 인덱스를 가진 원소를 제거
		answer= new int[arr2.size()];
		for(int i=0; i<arr2.size();i++) {// 다시 배열에 넣어줌
			answer[i]=arr2.get(i);
		}
		return answer;
	}

}

class AB extends smallnumberDelete {
	public static void main(String[] args) {

	}
}
