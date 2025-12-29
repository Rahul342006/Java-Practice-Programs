//Create abstract class pen 

import java.util.Scanner;
abstract class Pen{
    abstract void Write(String Text);
    abstract void  Refill();
}
class PenMain extends Pen{
    public void Write(String Text){
        System.out.println(Text);
    }
    public void Refill(){
        System.out.println("Pen has been Refilled");
    }
}
public class P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Pen Ink=new PenMain();
        System.out.println("Write:");
        String t=sc.nextLine();
        Ink.Write(t);
        Ink.Refill();
    }

    
}
