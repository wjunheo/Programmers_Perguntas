package Primeira_tentativa;

import java.util.ArrayList;
import java.util.List;

public class smallnumberDelete {
	public int[] smallnumberDelete(int[] arr) {
		int[] answer= {};
		List<Integer>arr2= new ArrayList<Integer>();// �迭���� �ٷ� ������ �ȵ����� arraylist����
		//���Ұ� 1�� ���ϸ� ������ ���� ���� �� �̹Ƿ� ���ŵȴ� -> -1 �� ����
		if(arr.length<=1) {
			answer= new int[] {-1};
			return answer;
		}
		for(int i=0; i<arr.length; i++ ) {//�迭 ���Ҹ� arraylist�� �־���
			arr2.add(arr[i]);
		}
		int min=0;// ���� ���� ������ �ε���, ó�������� ������ ù���� �ε����� �۴ٰ� ����
		for(int i=1; i<arr.length;i++) {
			if(arr[min]>arr[i]) {
				min=i; //min�� ���� ���� ���� �ε����� �־���
			}
		}
		arr2.remove(min);// �ش� �ε����� ���� ���Ҹ� ����
		answer= new int[arr2.size()];
		for(int i=0; i<arr2.size();i++) {// �ٽ� �迭�� �־���
			answer[i]=arr2.get(i);
		}
		return answer;
	}

}

class AB extends smallnumberDelete {
	public static void main(String[] args) {

	}
}
