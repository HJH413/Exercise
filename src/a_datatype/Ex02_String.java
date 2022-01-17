package a_datatype;

public class Ex02_String {
    public static void main(String[] args) {
        String a = new String("홍길동"); // String 클래스에 홍길동이란 메모리값을 a에 저장
        String b = new String("홍길동");

        //new를 사용하면

        if(a==b) {
            System.out.println("동일");
        } else {
            System.out.println("다름");  // new 연산자로 객체를 사용해서 메모리 힙 영역에 따로 저장됨
        }

        if(a.equals(b)) {   // 함수 안에 있는 내용을 비교할려면 .equals 사용!
            System.out.println("동일"); //
        } else {
            System.out.println("다름");
        }
    }
}
