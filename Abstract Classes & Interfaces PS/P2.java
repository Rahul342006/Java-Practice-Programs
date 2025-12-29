//Class monkey human class inherits it and implements basic animal interface

import java.util.Scanner;
class Monkey{
    public void Walk(){
        System.out.println("I can Walk");
    }
    public void Bite(){
        System.out.println("I can bite");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Humans extends Monkey implements BasicAnimal{
    public void Speak(String text){
        System.out.println("I can Speak:");
        System.out.println(text);
    }
    public void eat(){
        System.out.println("Food impotant guys");
    }
    public void sleep(){
        System.out.println("Sleep is necessary");
    }
}
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Humans obj=new Humans();
        System.out.println("Speak:");
        String text=sc.nextLine();
        obj.Speak(text);
        obj.eat();
        obj.sleep();
    }
    
}
