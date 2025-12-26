// Inherit Cuboid from Rectangle

import java.util.Scanner;
class Rectangle{
    int l , b;
    public void setDimensions(int Length , int Breadth){
        this.l=Length;
        this.b=Breadth;
    }
    public int getArea(){
        return l*b;
    }
}
class Cuboid extends Rectangle{
    int h;
    public void setHeight(int height){
        this.h=height;
    }
    public int getVolume(){
        return l*b*h;
    }
}
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Cuboid obj=new Cuboid();
        System.out.println("Enter Length:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth:");
        int b=sc.nextInt();
        System.out.println("Enter Height:");
        int h=sc.nextInt();
        obj.setDimensions(l,b);
        obj.setHeight(h);
        System.out.println("Area of rectangle:"+ obj.getArea());
        System.out.println("Volume of rectangle:"+ obj.getVolume());

    }
}
