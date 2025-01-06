package io.dongvelop.a변수_타입_연산자

/**
 * Kotlin 에서의 변수를 다루는 방법
 */
fun main() {

    // 1. 일반 변수
    var number1 = 10L;

    // 2. 불변 변수
    val number2 = 10L;

    /*
     * 3. primitive 타입 : 코틀린은 내부적으로 primitive 타입으로 바꿔서 계산
     * 프로그래머가 박싱/언박싱을 고려하지 않아도 됨.
     */
    var number3 = 1_000L;

    /*
     * 4. nullable 변수 : 코틀린은 기본적으로 모든 변수에 null 이 들어갈 수 없다.
     * "?" 를 통해 nullable 임을 명시해야 null 할당 가능.
     */
    var nullableNum: Long? = 1_000;
    nullableNum = null;

    // 5. 객체 인스턴스화 => new 연산자를 사용하지 않음.
    var student = Student();
}

class Student {
    var age: Int? = 10;
}