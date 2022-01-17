package C_control;

import java.util.Scanner;

public class Ex03_test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        System.out.println("입력하신 당신의 학번은 " + id);
        input.close();
        //1997111001
        String year = id.substring(0,4);  // 입학년도 1997
        char university = id.charAt(4); // 단과대 번호 1 공대
        String majorNo = id.substring(5,7); // 학과번호 11 컴퓨터학과

        String department = "(학과)";
        String major = "(단과대학)";

        if(university == '1') {
            department = "공대";
            switch (majorNo) {
                case "11":
                    major = "컴퓨터학과";
                    break;
                case "12":
                    major = "소프트웨어학과";
                    break;
                case "13":
                    major = "모바일학과";
                    break;
                case "22":
                    major = "자바학과";
                    break;
                case "33":
                    major = "서버학과";
                    break;
            }
        }  else if (university=='2') {
            department = "사회대";
            switch(majorNo) {
                case "11": major = "사회학과"; break;
                case "12": major = "경영학과"; break;
                case "13": major = "경제학과"; break;
            }
        }
        System.out.println(id + "는 " + year + "년도에 입학한 " + department +" "+ major + "학생입니다.");
    }

    //원본
//System.out.println("학번을 입력하세요.");
//Scanner input = new Scanner(System.in);
//String studentNo = input.next();
//System.out.println("입력한 당신의 학번은 " + studentNo);
//input.close();
//
//// "1997111001"
//String year = studentNo.substring(0, 4); // "1997"
//char departmentNo = studentNo.charAt(4); // '1' 공대
//String facultyNo = studentNo.substring(5, 7); // "11" 컴퓨터학과
//
//String department = "(학과)";
//String faculty = "(단과대학)";
//
//if (departmentNo == '1') {
//	department = "공대";
//	switch(facultyNo) {
//		case "11": faculty = "컴퓨터학과"; break;
//		case "12": faculty = "소프트웨어학과"; break;
//		case "13": faculty = "모바일학과"; break;
//		case "22": faculty = "자바학과"; break;
//		case "33": faculty = "서버학과"; break;
//	}
//} else if (departmentNo == '2') {
//	department = "사회대";
//	switch(facultyNo) {
//		case "11": faculty = "사회학과"; break;
//		case "12": faculty = "경영학과"; break;
//		case "13": faculty = "경제학과"; break;
//	}
//} // end of else if
//
//System.out.println(studentNo + "는 " + year + "년도에 입학한 " + department + " "
}
