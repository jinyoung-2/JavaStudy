package 자바의정석.ch14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx05 {
    public static void main(String[] args) {
        Student1[] stuArr = {
                new Student1("이자바",3,300),
                new Student1("김자바",1,200),
                new Student1("안자바",2,100),
                new Student1("박자바",2,150),
        };

        // 스트림 생성하여 => Stream.of()
        // 학생 이름만 뽑아서 => map()
        // 스트림을 List<String>에 저장 => collect(Collectors.toList())
//        List<String> names = Stream.of(stuArr).map(Student1::getName).collect(Collectors.toList());
//        System.out.println(names);


        //스트림을 배열로 변환
//        Student1[] stuArr2 = Stream.of(stuArr).toArray(Student1::new);
//
//        for(Student1 s : stuArr2){
//            System.out.println(s);
//        }


        //스트림을 Map<String,Student>로 변환. 학생 이름이 key
//        Map<String,Student1> stuMap = Stream.of(stuArr)
//                .collect(Collectors.toMap(s->s.getName(),p->p));
//        for(String name:stuMap.keySet()){
//            System.out.println(name+"-"+stuMap.get(name));
//        }


        //collect 이용하여 count, 총 totalScore 구하기
//        long count = Stream.of(stuArr).collect(Collectors.counting());
//        long totalScore = Stream.of(stuArr)
//                .collect(Collectors.summingInt(Student1::getTotalScore));
//        System.out.println("count="+count);
//        System.out.println("totalScore="+totalScore);


        //reducing에서 매개변수3개인 경우 => map과 reduce를 하나로 합쳐놓은 것과 동일
//        long totalScore = Stream.of(stuArr)
//                .collect(Collectors.reducing(0,Student1::getTotalScore,Integer::sum));
//        System.out.println("totalScore="+totalScore);


        //maxBy()이용하여 총점이 가장 높은 학생 출력
//        Optional<Student1> topStudent = Stream.of(stuArr)
//                .collect(Collectors.maxBy(Comparator.comparingInt(Student1::getTotalScore)));
//        System.out.println("topStudent="+topStudent);


        //해당 Stream의 모든 정보 출력 => summarizingInt 이용
//        IntSummaryStatistics stat = Stream.of(stuArr)
//                .collect(Collectors.summarizingInt(Student1::getTotalScore));
//        System.out.println(stat);


        //학생들 이름 모두 출력
//        String stuNames = Stream.of(stuArr)
//                .map(Student1::getName)
//                .collect(Collectors.joining(",","{","}"));
//        System.out.println(stuNames);


    }
}

class Student1 implements Comparable<Student1>{
    String name;
    int ban;
    int totalScore;

    Student1(String name, int ban, int totalScore){
        this.name=name;
        this.ban=ban;
        this.totalScore=totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]",name,ban,totalScore).toString();
    }

    String getName(){
        return name;
    }
    int getBan(){
        return ban;
    }
    int getTotalScore(){
        return totalScore;
    }

    //총점을 기준으로 내림차순으로 정렬
    public int compareTo(Student1 s){
        return s.totalScore - this.totalScore;
    }
}
