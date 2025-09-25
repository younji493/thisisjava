package ch03.sec05;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while(run) {
            System.out.println("---------------------------");
            System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
            System.out.println("---------------------------");
            System.out.print("선택> ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.print("예금액을 입력해주세요: ");
                int number1 = scanner.nextInt();
                scanner.nextLine();
                /* nextInt()는 숫자만 읽고 엔터는 버퍼에 남겨서 다음 루프에서 nextLine()이 그 남은 엔터를 그대로 읽어버려
                strNum이 빈 문자열이 되기 때문에, 메뉴가 한 번 더 훅 지나가는 것을 막기 위해 남은 개행 소비 */
                money += number1;
                System.out.println("예금액> " + money);
            } else if(strNum.equals("2")) {
                System.out.print("출금액을 입력해주세요: ");
                money = scanner.nextInt();
                scanner.nextLine();
                System.out.println("출금액> " + money);
            } else if(strNum.equals("3")) {
                System.out.print("잔고를 입력해주세요: ");
                money = scanner.nextInt();
                scanner.nextLine();
                System.out.println("잔고> " + money);
            } else if(strNum.equals("4")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
