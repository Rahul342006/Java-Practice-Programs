//Calculate cgpa of three subjects
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject 1 marks:");
        float a=sc.nextFloat();
        System.out.println("Enter Subject 2 marks:");
        float b=sc.nextFloat();
        System.out.println("Enter Subject 3 marks:");
        float c=sc.nextFloat();
        float cgpa=(a+b+c) / 3.0f;
        System.out.println("Your cgpa is:"+cgpa );
     }
    
}
