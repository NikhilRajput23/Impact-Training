import java.util.*;

public class hashmap{
    public static void main(String[] args) { 
        HashMap<Character ,Integer> ab=new HashMap<>();
//         a.put(1,"Nikhil");
//         a.put(2,"Mukesh");
//         a.put(3,"Pankaj");
//         System.out.println(a);
//         System.out.println(a.get(2));
//         System.out.println(a.remove(1));
//         System.out.println(a);
//         System.out.println(a.containsKey(2));
//         System.out.println(a);
//         for(int i:a.keySet()){
//             System.out.println(i);
            
//         }
//     }
// }



// int arr[]={1,3,4,5,6,7,8,9,9};
// for (int i=0;i<arr.length;i++)
// {
// if(a.containsKey(arr[i])){
//     int count =a.get(arr[i])+1;
//     a.put(arr[i],1);

// }else{
//     a.put(arr[i],1);
// }
// }

// System.out.println(a);
//     }
// }

  

    //     Scanner sc = new Scanner(System.in);
    //     String a = sc.nextLine().toLowerCase(); 
    //     String b = "aeiou";
    //     HashMap<Character, Integer> c = new HashMap<>();

    //     for (int i = 0; i < a.length(); i++) {
    //         char ch = a.charAt(i);
    //         if (b.indexOf(ch) != -1) {
    //             c.put(ch, c.getOrDefault(ch, 0) + 1); 
    //         }
    //     }

    //     System.out.println(c);
    // }
// }
Scanner sc=new Scanner(System.in);
double  a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
 double d=(a*b)/(b+c)+(a%c);
 System.out.printf("%.2f",d);
    }
}