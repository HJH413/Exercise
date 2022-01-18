package D_array;

public class Ex04_lotto {
    public static void main(String[] args) {

        //1)배열변수선언 + 객체생성(new ....)
        int lotto [][] = new int[5][6]; //

        //2) 값 지정
        for (int i = 0; i < lotto.length; i++) {

            for (int j = 0; j < lotto[i].length; j++) { // lotto[i].length i배열안에 j배열의 갯수
                lotto[i][j] = (int)(Math.random()*45) + 1;
                System.out.print(lotto[i][j] + "/");
            }
            System.out.println();
        }
    }
}
//  [3][5] 1 번에 5까지  2번에 5까지 3번에 5까지

// heap 메모리에다가 객체생성한 얘들은 자동초기화