package ch04.sec05;

public class SumForm1To10Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + "합 : " + sum);
    }
}
