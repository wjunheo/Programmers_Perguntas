package Primeira_tentativa;

import java.util.Scanner;

class collatz {
    public int collatz(int n) {
        long num = n; // �����÷ο� ������ ���� ����ȯ
        int count = 0;
        
        while (num != 1) {
            /* ¦���� ��� */
            if (num % 2 == 0) {
                num /= 2;
            /* Ȧ���� ��� */
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


        

