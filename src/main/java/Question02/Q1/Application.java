package Question02.Q1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //  어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다.
        
        //  Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자.

        //  예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.

        //  두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);
        number nu = new number();
        System.out.println("입력한 X값, Y값 뒤집어서 더하기");
        nu.reverseXYPlus();

        // void 안쓰고 변수이용 습관들이기
        System.out.println("X 값 입력");
        int X = sc.nextInt();
        System.out.println("Y 값 입력");
        int Y = sc.nextInt();
        System.out.println(nu.reverseXYPlus2(X, Y));
    }
}
