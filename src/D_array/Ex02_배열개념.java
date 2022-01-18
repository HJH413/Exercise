package D_array;

public class Ex02_배열개념 {
    public static void main(String[] args) {

        //배열변수 선언 Java 는 반드시 무슨 자료형인지 알고서 선언
        int a[]; // int [] a; 변수는 메모리 stack 에 저장

        //배열은 new 통해서 객체 생성
        a = new int[4]; // int a[] = new int[4]; // 객체는 메모리 heap 에 저장한것을 Instance 칭함
        //배열을 사용할때 for 문을 사용하면 좋음

        a[2] = 100;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();

        for (int temp : a) {
            System.out.println(temp);
        }
    }
}
