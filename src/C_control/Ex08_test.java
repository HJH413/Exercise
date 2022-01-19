package C_control;

/*1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

        8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.

        (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)

        결과 : 4000*/


import java.util.Scanner;

public class Ex08_test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            int num = i;
            while (num != 0) {
                if (num%10 == 8) {
                    count++;
                }
                num = num/10;
            }
        }
        System.out.println(count);
    }
}

/*
System.out.println("자연수를 입력하면 1~ n 사이의 8의 갯수를 셉니다.");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i < n ; i++) {
        int num = i;
        while (num != 0) {
        if(num%10==8){
        count++;
        }
        num = num/10;
        }
        }
        System.out.println("1~n 사이의 8의 갯수 : " + count);
*/


    /*int count = 0;  // 1~10000중 8이 나오면 저장할 곳
        for (int i = 0; i < 10000 ; i++) { // 범위 설정
        int num = i; // 계산할 숫자 설정
        while (num!=0) { // num이 0이 아니면 조건문 반복
        if(num%10 == 8) { // 숫자를 10으로 나누고 남은 값이 8이면 더하기
        count++;
        }
        num = num/10; // 숫자를 10으로 나눈 몫을 다시 num에 저장
        }
        }
        System.out.println(count + "<- 1~10000중 8의 갯수");*/

    /*int count = 0;  // 카운트 변수선언
        for (int i = 1; i <= 10000 ; i++) {  // 범위 선언
        /* int count=0; // 8의 갯수를 카운팅
        for (int i = 0; i < 10000; i++) { //범위설정
        int num = i; // i의 값을 num에 저장
        while (num!=0) { // num값이 0이 아니면 반복
        if(num%10==8){ // num의 값을 나누었을때 남은 값이 8이면
        count++; // if만족시 count에 1씩 추가
        }
        num = num/10; // 숫자 10으로 나눈 몫을 다시 num에 저장 ex 1018
        }
        }   */