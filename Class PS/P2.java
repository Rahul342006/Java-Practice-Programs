//Class Square

import java.util.Scanner;
class Square{
    int side;
    int area;
    int perimeter;
    public void setSide(int Side){
        this.side=Side;
    }
    public void Area(){
        area=side*side;
    }
    public void Perimeter(){
        perimeter=4*side;
    }
    public int getArea(){
        return area;
    }
    public int getPerimeter(){
        return perimeter;
    }
}
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Square sq=new Square();
        System.out.println("Enter side:");
        int side=sc.nextInt();
        sq.setSide(side);
        sq.Area();
        sq.Perimeter();
        System.out.println("Area of square is:" + sq.getArea());
        System.out.println("Perimeter of square is:"+ sq.getPerimeter());
        
        


    }

    
}
