//1. 변수 선언은 수정해야함
//2. Account 클래스 만들어야함
package ch06.account;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        String accountNum; //계좌번호
        String myAccount; //계좌주
        String goMoney; //초기입금액
        String outMoney; //출금액
        String depositMoney; //예금액

        while(run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.println("----------");
                System.out.println("계좌생성");
                System.out.println("----------");
                System.out.println("계좌번호: ");
                accountNum = scanner.nextLine(); //계좌번호
                System.out.println("계좌주: ");
                myAccount = scanner.nextLine(); //계좌주
                System.out.println("초기입금액: ");
                goMoney = scanner.nextLine(); //초기입금액
                System.out.println("계좌가 생성되었습니다.");
            } else if(strNum.equals("2")) {
                System.out.println("----------");
                System.out.println("계좌목록");
                System.out.println("----------");
               //Account에서 가져와야함!!!
            } else if(strNum.equals("3")) {
                System.out.println("----------");
                System.out.println("예금");
                System.out.println("----------");
                System.out.println("계좌번호: ");
                accountNum = scanner.nextLine(); //계좌번호
                System.out.println("예금액: ");
                depositMoney = scanner.nextLine(); //예금액
            } else if(strNum.equals("4")) {
                System.out.println("----------");
                System.out.println("출금");
                System.out.println("----------");
                System.out.println("계좌번호: ");
                accountNum = scanner.nextLine(); //계좌번호
                System.out.println("출금액: ");
                outMoney = scanner.nextLine(); //출금액
                System.out.println("결과: 출금이 성공되었습니다.");
            } else if(strNum.equals("5")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");

    }
}
