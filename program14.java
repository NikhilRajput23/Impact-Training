import java.util.*;
public class program14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "#####";
        String previous =sc.nextLine();
        System.out.println(previous);
        String Current =sc.nextLine();
        while(!Current.equals(a)){
            if(previous.charAt(previous.length()-1)==Current.charAt(0)){
                System.out.println(Current);
                previous=Current;
                
            }
            else{
                break;
            }
            Current =sc.nextLine();

}
    }
}