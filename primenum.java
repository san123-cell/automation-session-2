package session2;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        boolean s = false;
        if (num >=1) {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    s = true;
                    break;
                }
            }

            if (!s)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}
