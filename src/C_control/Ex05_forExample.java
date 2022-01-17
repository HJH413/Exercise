package C_control;

public class Ex05_forExample {
    public static void main(String[] args) {

//		for (int j = 0 ; j<26 ; j++) {
//
//			for( char ch = 'A'; ch <= 'A'+ ch; ch++ ) {    // 반복 횟수 조건문 오류
//				System.out.print(ch);
//			} // end of for char
//			System.out.println();
//		} // end of for i

        for (int i = 0 ; i<26; i++) {
            for (char ch = 'A'; ch <= 'A' + i ; ch++) {
                System.out.print(ch);
            }
            System.out.println("1번");
        }
        for (int i = 0 ; i<26; i++) {    // 26번 반복시켜라
            for (char b = 'A'; b <= 'Z'-i ; b++) {  // A부터 Z까지 시작해서 마지막에 A만 남기기
                System.out.print(b); // 출력하기
            }
            System.out.println("2번"); //줄 띄워쓰기
        }
        for (int i = 0 ; i<26; i++) {    // 26번 반복시켜라
            for (char b = (char)('A' + i); b <= 'Z'; b++) {  // A부터 Z까시 시작해서 맨마지막에 Z만 남기기
                System.out.print(b); // 출력하기
            }
            System.out.println("3번"); //줄 띄워쓰기
        }
        for (int i = 0 ; i<26; i++) {    // 26번 반복시켜라
            for (char b = 'Z'; b >= 'Z'-i; b--) {  //
                System.out.print(b); // 출력하기
            }
            System.out.println("4번"); //줄 띄워쓰기
        }
        // Z로 시작해서 마무리를 A로 끝내라
        //

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    } // end of main

} // end of class
