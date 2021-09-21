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
            count++;
            
            if (count > 500)
                return -1;
        }
        
        return count;
    }
}


        

