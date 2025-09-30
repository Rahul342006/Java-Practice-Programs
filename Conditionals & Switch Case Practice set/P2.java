//Calculate Income tax of employe stats are given
import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");
        double Sal=sc.nextDouble();
        double Tax=0;
        if(Sal>250000){
            double SlabTax=((Math.min(Sal,500000)-250000)*0.05);
            Tax+=SlabTax;
        }
        if(Sal>500000){
            double SlabTax=((Math.min(Sal,1000000)-500000)*0.20);
            Tax+=SlabTax;
        }
        if(Sal>1000000){
            double SlabTax=(Sal-1000000)*0.30;
            Tax+=SlabTax;

        }
        if(Sal<250000){
            System.out.println("No tax to be paid");
        }
        else{
            System.out.println("Total tax you are paying is "+Tax);
        }
        
    

    }
    
}
