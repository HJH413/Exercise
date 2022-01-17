package C_control;

import java.util.Scanner;

public class RSnumber {    //주민번호 입력받아서 인적사항 확인하기
    public static void main(String[] args) {
        System.out.println("주민번호 입력하세요.");
        System.out.println("@@@@@@-@@@@@@@");
        Scanner input = new Scanner(System.in);  // 입력 클래스?

        String rsn = input.nextLine(); // rsn 안에 입력값넣기
        String year = rsn.substring(0,2); // year = 94
        String month = rsn.substring(2,6); // month = 0413 2번째자리에서 6번째까지 출력
        char sex = rsn.charAt(7); // sex = 1 문자 몇번째 자리
        char from = rsn.charAt(8); // from = 2

        System.out.println(year+month); //주민번호 앞자리
        System.out.println("성별 및 사는 지역");
            switch (sex) {
                case '1':
                case '3':
                    System.out.println("남성");
                    break;
                case '2':
                default:
                    System.out.println("여성");
                    break;
            } //end of switch

        switch (from) {
            case '1':
                System.out.println("서울");
                break;
            case '2':
                System.out.println("경기도");
                break;
            case '3':
                System.out.println("광역시");
                break;
            default:
                System.out.println("지방");
                break;
        } //end of switch

    } // end of main
} // end of class
