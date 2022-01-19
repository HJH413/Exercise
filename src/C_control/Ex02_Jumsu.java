package C_control;

import java.util.Scanner;

public class Ex02_Jumsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하세요. =>");

        score = sc.nextInt();

        System.out.println("내 점수는 : " + score );

        switch(score/10) {
            case 10:
                System.out.println("A+학점");
                break;
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
                break;
        }

        sc.close();

    }
}
