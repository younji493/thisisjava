package ch06.sec07.exam02;

public class Korean {
    //필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    //생성자 선언 (Bad)
//    public Korean(String n, String s) {
//        name = n;
//        ssn = s;
//    }

    //생성자 선언 (Good)
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
