package C_control;

import java.util.Scanner;

// https://cafe.naver.com/javassem/7160
public class ForTest {
    public static void main(String[] args) {
        System.out.println("자연수를 입력하세요.");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        int y,z =0;
        for (int j = 1; j <= i; j++) { //j초기값 정수1 선언, j는  i보다 작거나같다 j++ 증가
            for (y = 0; y < i-j ; y++) {
                System.out.print(" ");
            }
            for (z = 1;  z<=j ; z++) {
                System.out.print(z);
            }
            System.out.println();
        }

        int num = 1;
        for(int x = 0; x<i; x++) //라인 수
        {
            for(int d = 0; d<x; d++) {
                System.out.print(" ");
            }
            for(int w = x; w<i; w++,num++) {
                System.out.print(num+" ");

            }
            System.out.println();
        }

        int number=0;
        char chr = 'A';
        for(int x = 0; x<i; x++) {
            for(int q = x; q<i; q++, chr++)
                System.out.print(chr+" ");
            for(int e = i; e>i-x; e--, number++)
            {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}

//어렵다..ㅠㅠ