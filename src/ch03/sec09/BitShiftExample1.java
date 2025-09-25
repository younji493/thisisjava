package ch03.sec09;

public class BitShiftExample1 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; //a x 2^b
        int result2 = num1 * (int) Math.pow(2, 3); //2의 3제곱 계산해서, double로 돌려주는 메소드
        System.out.println("result: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3; //a / 2^b
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
