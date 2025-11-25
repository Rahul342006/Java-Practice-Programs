//ADD FIRST 10 EVEN NUMBERS 
import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num till you want sum of even numbers");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0 ; i<=num ; i++ ){
            if(i%2==0){
                sum+=i;
            }
            
         }
         System.out.print(sum);
         
    }
    
}
