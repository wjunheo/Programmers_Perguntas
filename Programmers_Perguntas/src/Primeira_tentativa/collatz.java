package Primeira_tentativa;

import java.util.Scanner;

class collatz {
    public int collatz(int n) {
        long num = n; // 오버플로우 방지를 위한 형변환
        int count = 0;
        
        while (num != 1) {
            /* 짝수일 경우 */
            if (num % 2 == 0) {
                num /= 2;
            /* 홀수일 경우 */
            } else {
                num = num * 3 + 1;
            }
            count++; // 카운트를 더하다가
            
            if (count > 500)
                return -1; // 카운트가 500이 넘으면 리턴하고
        }
        
        return count; //500 전까지는 계속 와일문 돌기
    }
}


        

