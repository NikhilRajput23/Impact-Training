// import java.util.*;

// public class program16 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine(); 

//         int sum = 0;
//         int num = 0;

//         for (char c : s.toCharArray()) {
//             if (Character.isDigit(c))
//                 num = num * 10 + (c - '0');
//             else {
//                 sum += num;
//                 num = 0;
//             }
//         }

//         sum += num; 
//         System.out.println(sum);
//     }
// }


// import java.util.Scanner;

// public class program16 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         String b = sc.next();

//         for (char c : a.toCharArray()) {
//             b = b.replace(String.valueOf(c)," ");
//         }

//         System.out.println(b);
//     }
// }
// import java.util.Scanner;

// public class program16 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] matrix = new int[n][n];

//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 matrix[i][j] = sc.nextInt();
//         sc.close();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++)
//                 System.out.print(matrix[i][j] + " ");
//             System.out.println();
//         }

//         System.out.println("Transpose matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++)
//                 System.out.print(matrix[j][i] + " ");
//             System.out.println();
//         }
//     }
// }
// import java.util.*;

// public class program16{

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int row=sc.nextInt();
//     int c=1;
//     int a[][]=new int[row][row];
//     for(int i=0;i<row;i++){
//         for(int j=0;j<row;j++){
//             a[i][j]=sc.nextInt();
//         }
//     }
//     for(int i=1;i<row;i++){
//         for(int j=0;j<i;j++){
//             if(a[i][j]!=0){
//                 c=0;
//                 break;
//             }
//         }
//     }
//     if(c==1){
//         System.out.println("Upper triangular matrix");
//     }
//     else{
//         System.out.println("Not an Upper triangular matrix");
//     }
// }
//  }


// import java.util.*;

// public class program16 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt(); 
//         int m = sc.nextInt(); 
        
//         int[][] arr = new int[n][m];
//                 for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//          for (int j = 0; j < m; j++) {
//             int max = arr[0][j]; 
//             for (int i = 1; i < n; i++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];  
//                 }
//             }
//             System.out.println(max);
//         }
        
        
//     }
// }

import java.util.*;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();
        int sum = 0;
        for(int j = 0; j < m; j++)
            sum += mat[0][j];
          for(int i = 1; i < n - 1; i++)
            sum += mat[i][m / 2];
        for(int j = 0; j < m; j++) 
            sum += mat[n - 1][j];

        System.out.println("Sum of Zig-Zag pattern is "+ sum);
    }
}
