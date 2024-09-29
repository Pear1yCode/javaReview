package Qurestion03.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxin {

        public static void array() {
            while (true) {
                System.out.println("배열의 크기를 정할 1 이상의 정수를 입력해주세요.");
                Scanner sc = new Scanner(System.in);
                int arraySizeAnswer = sc.nextInt();
                if (arraySizeAnswer > 0) {
                    ArrayList<Integer> Array = new ArrayList<>(arraySizeAnswer);
                    for (int i = 0; i < arraySizeAnswer; i++) {
                        System.out.println("배열에 넣을 정수를 입력하세요.");
                        int in = sc.nextInt();
                        Array.add(in);
                    }

                    int min = Integer.MAX_VALUE; // 가장 큰 값 할당
                    int max = Integer.MIN_VALUE; // 가장 작은 값 할당

                    for (int i :Array) {
                        min = Math.min(min, i); // min에 넣은 가장 큰 값과 Array의 i들 비교 => Math.min로 인한 min 값 반환
                        max = Math.max(max, i); // max에 넣은 가장 작은 값과 Array의 i들 비교 => Math.max로 인한 max 값 반환
                        Array.indexOf(min);
                        Array.indexOf(max);
                    }

                    System.out.println("배열 : " + Array);
                    System.out.println("배열 사이즈 : " + Array.size());
                    System.out.println("최대값 : " + max + " | 위치 : " + (Array.indexOf(max)+1)); // 다 구해놓은 값에 indexOf를 사용하여 min과 max의 인덱스 번호를 찾아주면 해결
                    System.out.println("최소값 : " + min + " | 위치 : " + (Array.indexOf(min)+1)); // 위치 : +1은 인덱스 0을 제거하고 사용자가 확인하기 더 편리하게 설정해보았다.
                    break;
                } else {
                    System.out.println("1 이상의 정수를 입력하세요.");
                    continue;
                }
            }
        }

}
