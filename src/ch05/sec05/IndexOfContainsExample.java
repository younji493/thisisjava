package ch05.sec05;

public class IndexOfContainsExample {
    static void main() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍"); //프 인덱스 = 3
        System.out.println(location);
        String subString = subject.substring(location); //subject.substring(3)
        System.out.println(subString); //3부터 끝까지 출력. 프로그래밍

        location = subject.indexOf("자바"); //인덱스 0
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
