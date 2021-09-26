package 자바의정석.ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx2 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
//        Optional<Integer> optInt = optStr.map(String::length);
        Optional<Integer> optInt = optStr.map(s->s.length());
        System.out.println("optStr="+optStr.get());
        System.out.println("optInt="+optInt.get());

        int result1 = Optional.of("123")
                .filter(x->x.length()>0)
                .map(Integer::parseInt).get();
        int result2 = Optional.of("")
                .filter(x->x.length()>0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x-> System.out.printf("result3=%d%n",x));

        OptionalInt optInt1 = OptionalInt.of(0);    //0을 저장
        OptionalInt optInt2 = OptionalInt.empty();  //빈 객체 생성

        System.out.println(optInt1.isPresent());    //true
        System.out.println(optInt2.isPresent());    //false

        System.out.println(optInt1.getAsInt());     //0
//        System.out.println(optInt2.getAsInt());

        //Optional객체의 경우 null을 저장하면, 비어있는것과 동일하게 취급
        Optional<String> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.empty();
        System.out.println(opt1.equals(opt2));  //true
    }
}
