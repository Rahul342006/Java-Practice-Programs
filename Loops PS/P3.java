//PROGRAM FOR TABLE
import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to know the table:");
        int num=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<11){
            sum=num*i;
            System.out.println(num + "X" + i + "=" + sum);
            i++;


        }
        
    }

    
}
