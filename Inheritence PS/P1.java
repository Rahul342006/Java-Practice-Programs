// From Class Circle Inherit Cylinder class

import java.util.Scanner;
class circle{
    Double radius;
    circle(Double r){
        this.radius=r;
    }
    public Double Area(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle{
    Double height;
    cylinder(Double h , Double r){
        super(r);
        this.height=h;
    }
    public Double Area(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
}

public class P1 {
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        Double r=sc.nextDouble();
        System.out.println("Enter Height");
        Double h=sc.nextDouble();
        circle obj=new circle(r);
        cylinder obj1=new cylinder(r,h);
        System.out.println("Area of a circle is:" + obj.Area());
        System.out.println("Area of cylinder is:" + obj2.Area());
    }
    
}
