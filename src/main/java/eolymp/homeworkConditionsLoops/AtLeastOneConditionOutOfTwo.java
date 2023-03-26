package eolymp.homeworkConditionsLoops;

import java.util.Scanner;
public class AtLeastOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0 ||  (n >99 && n <1000)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
