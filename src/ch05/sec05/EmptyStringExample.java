package ch05.sec05;

public class EmptyStringExample {
    static void main() {
        String hobby = "";
        if(hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈문자열");
        }
    }
}
