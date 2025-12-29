//Demonstrate Polymorphisim

class Monkey{
    public void walking(){
        System.out.println("I walk with 4 legs");
    }
    public void speak(){
        System.out.println("I cannot speak");
    }
}
class Humans extends Monkey{
    public void walking(){
        System.out.println("I walk with 2 legs");
    }
    public void speak(){
        System.out.println("I can Speak");
    }
}
public class P3 {
    public static void main(String[] args){
        Monkey obj=new Humans();
        obj.walking();
        System.out.println();
        obj.walking();
    }
    
}
