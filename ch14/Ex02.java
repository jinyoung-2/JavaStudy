package 자바의정석.ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints();  //무한스트림
        intStream
                .limit(10)  //10개만 자르기 : 무한스트림->유한스트림으로 변경
                .forEach(System.out::println);
    }
}
