import java.util.Scanner;

public class newone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int nik=n ^(1 << i);
        System.out.println(nik);
    }
}