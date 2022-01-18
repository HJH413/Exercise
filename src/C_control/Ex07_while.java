package C_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while {
    public static void main(String[] args) {

        System.out.println("문장을 입력 =>");

        Scanner input = new Scanner(System.in);  // 사용자에게 입력받는 클래스
        String msg = input.nextLine(); // next() 스페이스와 엔터로 기준 //nextLine() 엔터로 하나의 문장을 구분함

        StringTokenizer st = new StringTokenizer(msg, "/"); //공백을 기준으로 알아서 쪼개주는 클래스, 구분자를 넣어서 공백 기준을 줄 수 있음 ex : "/"
//        while(st.hasMoreTokens()){//단어는 토큰으로 부름
//            String word = st.nextToken();
//            System.out.println(word);
//        }
        int cnt = st.countTokens();
        for (int i = 0; i < cnt; i++) {
            String word = st.nextToken();
            System.out.println(word);
        }
        int n = 1;
        int sum = 0;
        while( true ){
            sum += n;
            if ( n++   >=  10 ) break;  // >= or ==      크거나같다 or 같다
        }
        System.out.println("SUM = " + sum );


    }
}
