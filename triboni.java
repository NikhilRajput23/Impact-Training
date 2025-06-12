import java.util.Scanner;

public class triboni {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0, b = 1, c = 1;
        for (int i = 1; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        triboni sol = new triboni();
        System.out.println("Tribonacci(" + n + ") = " + sol.tribonacci(n));

    }
}
