import java.util.*;

public class slidingwindow {
    public static void main(String[] args) {
        int[] n = {5, 7, 2, 3, 4};
        Arrays.sort(n); 
        
        int k = 0;
        int r=0;
        int l=0;

        for (int i = 1; i < n.length; i++) {
            if (n[i] == n[i - 1] + 1) {
                k++;
            }
        }
        System.out.println( k);
    }
}
