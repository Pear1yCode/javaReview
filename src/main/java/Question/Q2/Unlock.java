package Question.Q2;

import java.util.Scanner;

public class Unlock {
    private int lockNumber;

    Scanner sc = new Scanner(System.in);

    public void unlocker() {
        lockNumber = 0;
        String unlock = "";
        numberOne();
        numberTwo();
        numberThree();
        if(lockNumber == 3) {
            System.out.println("올바른 비밀번호입니다.");
        } else {
            System.out.println("비밀번호가 올바르지 않습니다. 다시 입력해주세요.");
            unlocker();
        }
    }

    public void numberOne() {
        System.out.println("비밀번호를 입력해주세요.");
        int number = sc.nextInt();
        if (number == 7) {
            System.out.println("다음 비밀번호를 입력해주세요.");
            lockNumber +=1;
        } else {
            System.out.println("다음 비밀번호를 입력해주세요.");
        }
    }

    public void numberTwo() {
        System.out.println("비밀번호를 입력해주세요.");
        int number = sc.nextInt();
        if (number == 5) {
            System.out.println("다음 비밀번호를 입력해주세요.");
            lockNumber +=1;
        } else {
            System.out.println("다음 비밀번호를 입력해주세요.");
        }
    }

    public void numberThree() {
        System.out.println("비밀번호를 입력해주세요.");
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("다음 비밀번호를 입력해주세요.");
            lockNumber +=1;
        } else {
            System.out.println("다음 비밀번호를 입력해주세요.");
        }
    }
}
