import java.util.*;

public class powerof2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
          System.out.println("false");  
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if (n==1) {
                System.out.println("true");
            } else {
                System.out.println("false");
                
            }
         }
    }
}