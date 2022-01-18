package D_array;

import java.util.Calendar;

public class Ex03_배열초기화 {
    // 날짜 Date / Calender
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("년: "+cal.get(Calendar.YEAR)); // get 얻어오다  달력 클래스의 연도를
        System.out.println("월: "+cal.get(Calendar.MONTH) + 1); //0부터 시작하니까 우리가 보는 월로 표현 할려면 + 1 하기
        System.out.println("일: "+cal.get(Calendar.DATE));

        String weeks[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"}; //배열의 초기화
        System.out.println(weeks[cal.get(Calendar.DAY_OF_WEEK)-1]);

    }
}
