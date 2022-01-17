package C_control;

public class Ex04_for {
    public static void main(String[] args) {

        /*		1	    2  5 8	4 7 10
         *  for (초기치; 조건문; 증가치){
         *  	반복문 3 6 9
         *  }   조건문이 false날때까지 반복
         *
         */
        for(int i = 0; i < 5; i++) {  // int i가 숫자 5미만이 될때까지 반복
            System.out.print("*");
        }

        System.out.println();
        for(int i = 0; i < 5; i++) {  // int i가 숫자 5미만이 될때까지 반복
            System.out.print(i);
        }

        System.out.println();
        for(char i = 'A'; i <= 'Z';i++) {
            System.out.print(i);
        }

        System.out.println();
        for(char i = 'A'; i <= 'Z';i+=2) {
            System.out.print(i);
        }
        System.out.println();
        for(char i = 'Z'; i >= 'A';i--) {
            System.out.print(i);
        }

        for(int i = 0; i<4; i++ ) {
            System.out.println();
            for(int j = 0; j < 5; j++) {  // int i가 숫자 5미만이 될때까지 반복
                System.out.print("*");
            }
        }
    }
}
