package b_opearator;

public class Ex01_review {
    public static void main(String[] args) {

        // short circuit logic : 자바에서 일반논리 연산자(&&, ||)에 적용되는 특성
        // 일반논리 && || :  true, false를 처리함
        // 이진논리 & | ^ : 각 비트의 값(0, 1)


        int a=3;
        // false (3) & true (4)
        if( a > 3 & ++a>3 ){  // a > 3 a는 3이기에 불만족함, ++a(4) > 3도 만족함
            //앞에 갚이 먼저 false여서 뒤에 값 안봄
            System.out.println("and조건만족"); //둘다 그 값이 만족되어야함 그런데 왼쪽 값이 불만족해서 false
            System.out.println("1 "+a);
        } else {
            System.out.println("and불만족");
            System.out.println("2 "+a);
        }

        System.out.println("A=" + a ); //불만족

        // true (4) | false (5)
        if( a > 1 | ++a > 10 ){  // 또는 3(a) > 1 만족 or ++a(4)>3

            System.out.println("or 조건만족");  // 둘중에 하나가 값이 만족되어야함
            System.out.println("3 "+a);
        }

        System.out.println("A=" + a );  // 최종 a의 값  5

    }
}


//(++a > 10  || a > 1)
//( a > 1 || ++a > 10 )
