// import java.util.Scanner;

// public class programday13 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String n = sc.nextLine().replace(" ", "").toLowerCase(); 

//         boolean isPalindrome = true;

//         for (int i = 0; i < n.length() / 2; i++) {
//             if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
//                 isPalindrome = false;
//                 break;
//             }
//         }

//         if (isPalindrome) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }

//     }
// }

// import java.util.Scanner;

// public class programday13 {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String a=sc.nextLine();
//         System.out.println(a.concat("parul"));

//   StringBuilder n = new StringBuilder(a);
//         n.append('g');
//     System.out.println(n);
//             System.out.println(n.delete(0,3));

//    }
// }


// import java.util.Scanner;

// public class programday13 {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int count=0;
//     String a=sc.nextLine();
    
//     for(int i=0;i<a.length();i++){
//         char b=a.charAt(i);
//         if(b=='a'||b=='e'||b=='i'||b=='0'||b=='u'||b=='A'||b=='I'||b=='O'||b=='U'){

// count++;
// }

//     }
//     System.out.print(count);
//    }
   
// }
import java.util.Scanner;

public class programday13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (char i = 'a'; i <= 'z'; i++) {
            if (n.indexOf(i) == -1) {
                System.out.print(i); 
                break;
            }
        }
    }
}

    
   

