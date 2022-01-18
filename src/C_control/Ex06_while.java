package C_control;

public class Ex06_while {
    public static void main(String[] args) {

        int sum = 0; //합을 구하기 위한 변수 생성
        int i = 1;

        do {
            sum = sum+i;
            i++;
        } while (i<=3) ;

//      for ( ; i <= 3; ) {  // 1~5까지
//        while (i<=3) { //for 문에서 조건문만 남아있는 상태
//            sum = sum+i;  // sum 변수안에 i의 값들을 더함
//            i++;
//        }
        System.out.println("sum = " + sum);
    }
}
/*
    - for : 반복의 횟수가 정해져 있을때
    - while : 반복의 횟수가 정해져 있지 않는 경우

    - while : 조건문이 앞에 있는 경우 조건이 true 이여야만 실행됨
    - do while : 조건문이 뒤에 있는 경우 단 한번이라도 수행할 때
 */