 class Grand{
    public void  Grand(){
  System.out.println("100 acres ");
    }
    }
    class father extends Grand{

    public void father(){
        System.out.println(" 100 cars");
}

{
    System.out.println("Tcs");
}
static{
System.out.println("tech");
}
    }

public class inheritance {
    public static void main(String[] args) {
        Grand gc=new Grand();
        father fc=new father();
        gc.Grand();
        fc.father();

    }
}
