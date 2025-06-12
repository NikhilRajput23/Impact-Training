import java.util.Scanner;

public class newone12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int a = x;
        int b = 0;

        while (a > 0) {
            int d = a % 10;
            b = b * 10 + d;
            a = a / 10;
        }

        if (b == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
