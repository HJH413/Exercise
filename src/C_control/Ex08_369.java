package C_control;

/*
1~50까지의 숫자 중에서 3, 6, 9 포함되면
그 수만큼 "짝" 을 출력
3,6,9가 하나도 포함되지 않으면 해당 수를 추력
1
3 -> 짝
2
13 -> 짝
33 -> 짝짝
36 -> 짝짝

내가 몇번을 반복할지 애매하면 while 문사용
 */



public class Ex08_369 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {  // 1~50까지 반복해라
            int num = i;  // i를 num 저장
            boolean num369 = false; //369 짝을 위한 변수 생성

            //369판단 ex) num == 136
            while (num !=0) {  // num값이 0이아니라면 아래의 식을 반복해라
                int na = num % 10;  // 숫자를 하나씩 뽑아내는중 10을 나눠서 남은수 6 3 1
                if(na == 3 || na == 6|| na == 9) {  // 나누기 한 수가 3 6 9가 맞다면 아래의 sout 짝을 출력
                    System.out.print("짝");
                    num369 = true; // for문의 boolean을 true로 변경
                }
                num = num / 10; // 숫자를 하나씩 뽑아내는중  13 1 0
            }

            if(!num369){  // num369 !를 넣어서 false를 -> true로 변경
                System.out.println(i);
            }else{
                System.out.println();
            }

//            if(num369){
//                System.out.println();
//            }else{
//                System.out.println(i);
//            }

        } //end of for


    } // end of main
} // end of class
