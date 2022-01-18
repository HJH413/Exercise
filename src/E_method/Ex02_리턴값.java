package E_method;

public class Ex02_리턴값 {
    public static void main(String[] args) {

        Object[] result = method();
        for (Object o : result) {
            System.out.println(o);
        }
        System.out.println("============");
        //위아래 둘다 같은 값 표현방식의 다름
        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
    }

    static Object[] method()
    {
        String name = "홍길동";
        int age = 33;
        double height = 150.99;

        Object[] obj = new Object[3];
        obj[0] = name;
        obj[1] = new Integer(age);  // obj[1] (클래스형) = age;(기본형)
        obj[2] = new Double(height);

        return obj;
    }
    //******** return 할 때 리턴값은 단 하나여야만 함!! only one
    //동일한 데이터끼리 쓰는것이 배열
}
