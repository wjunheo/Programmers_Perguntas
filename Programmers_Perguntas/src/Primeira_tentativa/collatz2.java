package Primeira_tentativa;

class collatz2 {
    public int collatz(int num) {
    long n = (long)num;
    for(int i =0; i<500; i++){      
      if(n==1) return i;
      n = (n%2==0) ? n/2 : n*3+1;            
    }
    return -1;
  }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        collatz2 c = new collatz2();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}
 


        

