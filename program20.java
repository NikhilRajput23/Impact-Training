// import java.util.Scanner;

// public class program20 {

//     public static int reverse(int n) {
//         int rev = 0;
//         while (n > 0) {
//             rev = rev * 10 + (n % 10);
//             n /= 10;
//         }
//         return rev;
//     }

//     public static boolean isAdamNumber(int n) {
//         int square = n * n;
//         int reversed = reverse(n);
//         int reversedSquare = reversed * reversed;
//         int reversedSquareOfN = reverse(square);
//         return reversedSquare == reversedSquareOfN;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num = sc.nextInt();
//         if (isAdamNumber(num)) {
//             System.out.println(num + " is an Adam number.");
//         } else {
//             System.out.println(num + " is not an Adam number.");
//         }
//     }
// }

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
        int number = sc.nextInt();
     int min = 9;
        int max = 0;
        int a = number;

        if (number == 0) {
            min = max = 0;
        } else {
            while (a > 0) {
                int digit = a % 10;

                if (digit < min) {
                    min = digit;
                }

                if (digit > max) {
                    max = digit;
                }

                a/= 10;
            }
        }

        System.out.println( min);
        System.out.println( max);

    }
}
