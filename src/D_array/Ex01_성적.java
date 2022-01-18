package D_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적 {

    public static void main(String[] args) {
//      int kor; 하나만저장
        int kor[] = new int[5]; // 배열 선언
        System.out.println("5명의 국어점수을 입력 ex : 85/55/12/67/77");
        Scanner input = new Scanner(System.in);
        String strKor = input.nextLine();
        StringTokenizer strTk = new StringTokenizer(strKor, "/");
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 5; i++) {  //5번 반복해라
            // kor[i] = st.nextToken(); // String(참조형) -> int(기본형) 참조형은 참조형끼리 기본형은 기본형끼리 형변환
            kor[i] = Integer.parseInt(strTk.nextToken()); //입력받은 문자열을 정수로변환
            System.out.println(kor[i]); //출력
        }

        // --------------------------------
        //총점 및 평균 구하기
        for (int i = 0; i < 5; i++) {
            sum = kor[i]+sum;
            avg = (double) sum/5;
        }
        System.out.println("sum : " + sum + " avg: " + avg); //출력
    }
}
