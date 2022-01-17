package C_control;

public class Ex01_Jumin {
    public static void main(String[] args) {
        //프로그래밍언어에서 숫자는 0부터시작함
        String id = "940413-1244657";
        char sung = id.charAt(7);
        System.out.println(sung);

        if(sung == '1' || sung == '3') {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }

        char chul = id.charAt(8);
        System.out.println(chul);
        // 0 -서울
        // 1 -광역시
        // 2 -경기
        // 3 -지방
        // 9 -제주도
        switch (chul) { // 문자, 정수, 스트링 변수
            case '0':
                System.out.println("서울");
                break;
            case '1':
                System.out.println("광역시");
                break;
            case '2':
                System.out.println("경기");
                break;
            case '3':
                System.out.println("지방");
                break;
            case '9':
                System.out.println("제주도");
                break;
            default:
                System.out.println("알수없음");
                break;
        }
        int i =1, j=0;

        switch ( i ) {
            case 2 : j += 6;
            case 4 : j += 1;
            default : j += 2;
            case 0 : j += 4;
        }
        System.out.println( "break의 중요성 : "+j ); // switch문의 break의 중요성 원래라면 2가나와야 하지만 break가 없어서 그아래 case 0도 실행이되어 6이됨

    }
}
