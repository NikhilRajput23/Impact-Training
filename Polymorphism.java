class Animal{
     public void sound(String b){
         
        System.out.println(b);
    }
}
class K extends Animal{
    public void sound(){
        
        System.out.println("Cow Sound");
    }
}
public class Polymorphism{
public static void main(String args[]){
    K a=new K();
    a.sound();
    a.sound("Dog sound");
}
}