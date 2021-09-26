package 자바의정석.ch14;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();
//        Optional<String> opt = Optional.of("abc");  //value가 abc인 Optional 객체 생성
        System.out.println("opt="+opt);

        String str = "";
//        str = opt.orElse("");   //Optional에 저장된 값이 null이면 ""반환
//        str = opt.orElse("Empty");
//        str = opt.orElseGet(()->"Empty");
//        str = opt.orElseGet(()->new String);
        str = opt.orElseGet(String::new);
        System.out.println("str="+str);
    }
}
