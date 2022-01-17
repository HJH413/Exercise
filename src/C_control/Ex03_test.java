package C_control;

import java.util.Scanner;

public class Ex03_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 시스템입력
        System.out.println("정확한 학번 10자리를 입력하세요.");

        String id = input.nextLine();
        String year = id.substring(0,4);  // 입학년도
        char university = id.charAt(4); // 단과대 번호
        String major = id.substring(5,7); // 학과번호

        System.out.print(year + "년도에 입학한 ");

        if (university=='1') {
            System.out.print("공대");
            switch(major) {
                case "11":
                    System.out.println(" 컴퓨터학과 학생입니다.");
                    break;
                case "12":
                    System.out.println(" 소프트웨어학과 학생입니다.");
                    break;
                case "13":
                    System.out.println(" 모바일학과 학생입니다.");
                    break;
                case "22":
                    System.out.println(" 자바학과  학생입니다.");
                    break;
                case "33":
                    System.out.println(" 서버학과 학생입니다.");
                    break;
            }
        } else if (university =='2') {
            System.out.print("사회대");
            switch(major) {
                case "11":
                    System.out.println(" 사회학과 학생입니다.");
                    break;
                case "12":
                    System.out.println(" 경역학과 학생입니다.");
                    break;
                case "13":
                    System.out.println(" 경제학과 학생입니다.");
                    break;
            }
        }
    }
}


//switch (year) {
//case "2017" :
//	System.out.println("2017년도에 입학한 ");
//	break;
//case "2018" :
//	System.out.println("2018년도에 입학한 ");
//	break;
//case "2019" :
//	System.out.println("2019년도에 입학한 ");
//	break;
//default:
//	System.out.println("올바른 학번을 입력하세요.");
//	break;
//}
//switch (university) {
//case "1":
//	System.out.println("공대");
//	break;
//case "2":
//	System.out.println("사회대");
//	break;
//default:
//	System.out.println("올바른 학번을 입력하세요.");
//	break;
//}

//
//if(year) {
//	System.out.println("2017년도에 입학한 ");
//} else if (year == "2018" ) {
//	System.out.println("2018년도에 입학한 ");
//} else if (year == "2019") {
//	System.out.println("2018년도에 입학한 ");
//} else {
//	System.out.println("잘못 입력했습니다.");