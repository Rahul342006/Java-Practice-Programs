//Nth term of Fibonacci Series

import java.util.Scanner;
public class P4{
    public static int Fibonacci(int index){
        if(index==0){
            return 0;
        }
        else if(index==1){
            return 1;
        }
        else{
            return Fibonacci(index-1)+Fibonacci(index-2); 
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth term of fibonacci series" );
        int index=sc.nextInt();
        int result=Fibonacci(index);
        System.out.println("Nth term is:"+result );
    } 
    
}
