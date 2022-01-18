package C_control;

public class Ex08_test {
    public static void main(String[] args) {
        int count = 0;  // 카운트 변수선언
        for (int i = 1; i <= 10000 ; i++) {  // 범위 선언
            int num = i;  //
            while(num!=0) {
                int na = num%10;
                if(na == 8) {
                    count++;
                }
                num = num/10;
            }

            if(count == 4000) {
                System.out.println("4000입니다.");
            }

        }

    }
}
