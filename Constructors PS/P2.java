//Overload a constructor of length 4 breadth 4 for area

import java.util.Scanner;
class Rectangle{
    int l , b;
    Rectangle(int length , int breadth){
        this.l=length;
        this.b=breadth;
    }
    Rectangle(){
        l=4;
        b=4;
    }
    public int Area(){
        return l*b;
    }
}
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        int len=sc.nextInt();
        System.out.println("Enter breadth:");
        int bre=sc.nextInt();
        Rectangle R1=new Rectangle(len , bre);
        Rectangle R2=new Rectangle();
        System.out.println("Area of Default rectangle:" + R2.Area());
        System.out.println("Area of user entered Rectangle:" + R1.Area());
    }
    
}
