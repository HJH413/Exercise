package C_control;

/*
break : block 을 벗어나는 거
continue : block 의 끝으로
 */


public class Ex09_break_continue {
    public static void main(String[] args) {


        END: //label 눈에 뛰라고 일반적으로 대문자 사용   label 을 이용해서 for문을 끝냄
        for (int i = 0; i < 2; i++) {        // 2회반복 안쪽의 for 문을 반복 후 다시 반복문 실행
            for (int j = 0; j < 3; j++) {

                if(j==1) break END;// continue  ex break 0   continue 0 2  출력

//          System.out.println("<"+j+">");
                System.out.printf("< %d , %d> \n", i, j); // %d 정수 숫자  \n 개행하는것       //  break 0 0 1 0 continue 0 0  0 2    1 0 1 2
            }
        }

    }
}
