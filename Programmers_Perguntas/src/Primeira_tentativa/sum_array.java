package Primeira_tentativa;

public class sum_array {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length;i++) {
        	for(int j =0; j<arr1[0].length;j++) {
        		answer[i][j]=arr1[i][j]+arr2[i][j];
        	}
        }
        return answer;
    }
}
public static void main(String[] args) {
    SumMatrix c = new SumMatrix();
    int[][] A = { { 1, 2 }, { 2, 3 } };
    int[][] B = { { 3, 4 }, { 5, 6 } };
    int[][] answer = c.sumMatrix(A, B);
    if (answer[0][0] == 4 && answer[0][1] == 6 && 
            answer[1][0] == 7 && answer[1][1] == 9) {
        System.out.println("맞았습니다. 제출을 눌러 보세요");
    } else {
        System.out.println("틀렸습니다. 수정하는게 좋겠어요");
    }
}
}


출처: https://aljjabaegi.tistory.com/391 [알짜배기 프로그래머]

