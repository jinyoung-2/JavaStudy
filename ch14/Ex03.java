package 자바의정석.ch14;

import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {

        //iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> integerStream = Stream.iterate(1,n->n+2);
        integerStream.limit(10).forEach(System.out::println);

        //generate(Supplier s) : 주기만 하는 것 입력x, 출력o
        Stream<Integer> oneStream = Stream.generate(()->1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
