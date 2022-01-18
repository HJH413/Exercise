package E_method;

public class Ex01_인자 {
    public static void main(String[] args) {

        //데이타
        String name = "홍길동";
        int age = 33;
        double height = 150.99;
        method(name, age, height); // method (인자)
    }
    static void method(String name, int age, double height) {  // static void method (파라미터)
        // main 함수 안에 있는 데이터를 여기서 출력
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}
