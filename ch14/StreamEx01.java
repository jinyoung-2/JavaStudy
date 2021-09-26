package 자바의정석.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        //Stream 만들기
        //Stream<T> Collection.stream()
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan))
//                        .thenComparing(Student::getTotalScore)
//                        .thenComparing(Student::getName)
//                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student implements Comparator<Student>{
    String name;
    int ban;
    int totalScore;
    Student(String name, int ban, int totalScore){
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

    //총점 내림차순을 기본 정렬로 한다.   = ???
    public int compareTo(Student s){
        return s.totalScore-this.totalScore;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}