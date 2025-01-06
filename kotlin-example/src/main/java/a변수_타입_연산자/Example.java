package a변수_타입_연산자;

/**
 * Java 에서의 변수를 다루는 방법
 */
public class Example {

    // 1. 일반 변수
    long number1 = 10L;

    // 2. 불변 변수
    final long number2 = 20L;

    // 3. primitive 타입
    Long number3 = 1_000L;

    // 4. nullable 변수
    Long nullableNum = null;

    // 5. 객체 인스턴스화 => New 연산자 이용
    Student student = new Student();
}

class Student {
    private Integer age = 10;
}
