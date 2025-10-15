package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) { //점3개 > (구성)편집 > 프로그램 인수에 숫자들만 넣기
        if (args.length != 2) {
            System.out.println("프로그램 입력 값이 부족");
            System.exit(0);
        }

        String strNum1 = args[0]; //첫번째 데이터 얻기
        String strNum2 = args[1]; //두번째 데이터 얻기

        int num1 = Integer.parseInt(strNum1); //문자열 정수로 변환
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
    }
}
