package Question02.Q1;

import java.util.Scanner;

public class number {
    Scanner sc= new Scanner(System.in);
    int reverse = 0;

//    public void reverseX() {
//        System.out.println("X 값 입력");
//        int x = sc.nextInt();
//        while (x != 0) {
//            int reverse = x % 10;
//        }
//        System.out.println(reverse);// 숫자 뒤집기 알고리즘 : 10을 나눈 나머지 값을 더해주는 방식
//    }

    public int reverseX(int x) {
        int reverse = 0;

        while (x != 0) {
                reverse = reverse * 10 + x%10; // 10을 곱한 값에 대답한 값에 10을 나눈 나머지를 계속 더해주면 뒤집어짐
                x/=10;
        }
        return reverse;
    }

    // 똑같은 Y에 대한 뒤집는 메소드 생성
    public int reverseY(int y) {
        int reverse = 0;

        while (y != 0) {
            reverse = reverse * 10 + y%10; // 끝에서부터 하나씩 잘라내고 잘려진 숫자를 맨 앞에 위치
            y/=10;    // y를 10으로 나누겠다.// 10으로 나누는 것 자체가 자릿수를 나누는 것으로 유용해보였다.
        }
        /*이해를 위해서 작성
        * y에 201을 넣었을때 201%10 = 1 거기에 reverse = 0이고 0x10 = 0 0+1 = reverse
        * y/=10;
        * 대충 파악은 가지만 자세하게 이해가 안갔다.
        */
        return reverse;
    }

    public void reverseXYPlus() {
        System.out.println("X 값 입력");
        int X = sc.nextInt();
        System.out.println("Y 값 입력");
        int Y = sc.nextInt();
        System.out.println(reverseX(X) + reverseY(Y));
    }

    public int reverseXYPlus2(int x, int y) {
        return ((reverseX(x)) + reverseY(y));
    }
}
