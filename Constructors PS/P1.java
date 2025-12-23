//Using Constructor Calculate surface Area Volume of Cylinder

import java.util.Scanner;
class Cylinder{
    double Height , Radius;
    Cylinder(double h , double r){
        this.Height=h;
        this.Radius=r;
    }
    public double Area(){
        return 2*Math.PI*Radius*Height+2*Math.PI*Radius*Radius; 
    }
    public double Volume(){
        return Math.PI*Radius*Radius*Height;
    }
}
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double radius=sc.nextInt();
        System.out.println("Enter Height");
        double height=sc.nextInt();
        Cylinder cy=new Cylinder(radius , height);
        System.out.println("Area of cylinder is" + cy.Area());
        System.out.println("Volume of cylinder is:" + cy.Volume());
    }
}
