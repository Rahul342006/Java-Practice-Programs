//Recursive Function to Calculate N natural numbers

import java.util.Scanner;
public class P3 {
    public static int Natural(int num){
        if(num==0){
            return 0;
        }
        else{
            return num + Natural(num-1); 
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num to stop:");
        int num=sc.nextInt();
        int result=Natural(num);
        System.out.println("Sum is :" + result);

    }
    
}
