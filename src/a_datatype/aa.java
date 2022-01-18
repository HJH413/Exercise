package a_datatype;

public class aa {
    public static void main(String[] args) {

        int  x = 1;

        while(  x++ < 3 )

            System.out.println(x);

        int i = 0, j = 0;

        for( i = 0 ; i < 5 ; i++ ) {

            for( j = 0 ; j < 4 ; j++ ) {

                if( i == 2 && j == 1 ) break;
                //break문을 사용해서 아래의 continue조건을 무시하고 바로 끝 숫자임 5 4가 출력됨
                if( i == 3 && j == 2 ) continue;

            }

        }

        System.out.println("i = " + i + " , j = " +  j );

        int q = 2, e = 0;

        switch( q ) {

            case 0 : e+= 0;

            case 2 : e+= 2;

            case 4 : e+= 4;

            default : e += 6;

        }

        System.out.println( e );

    }
}
