//Find if the student is pass or fail assume 3 subjects take masks as input from user
import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        Double SUB1=sc.nextDouble();
        System.out.println("Enter subject 2 marks:");
        Double SUB2=sc.nextDouble();
        System.out.println("Enter subject 3 marks:");
        Double SUB3=sc.nextDouble();
        Double TotalMarks=((SUB1+SUB2+SUB3)/300)*100;
        if(TotalMarks>40 && SUB1>33 && SUB2>33 && SUB3>33 ){
            System.out.println("All Clear");
        }
        else{
            System.out.println("Arrear");
        }



    }
    
}
