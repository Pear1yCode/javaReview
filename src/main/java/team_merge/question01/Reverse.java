package team_merge.question01;

import java.util.Scanner;

public class Reverse {
    Scanner sc = new Scanner(System.in);

    public int reverseA(int a) {

        int reverse = 0;

        while (a != 0) {
            reverse = reverse * 10 + a%10;
            a/=10;
        }
        return reverse;
    }

    public int reverseB(int b) {

        int reverse = 0;

        while (b != 0) {
            reverse = reverse * 10 + b%10;
            b/=10;
        }
        return reverse;
    }

    public void reverseAns() {
        System.out.print("첫 번째 수를 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 수를 입력해주세요 : ");
        int b = sc.nextInt();
        System.out.println(reverseA(a) + reverseB(b));
    }
}
