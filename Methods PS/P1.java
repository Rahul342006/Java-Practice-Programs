//JAVA METHOD FOR MULTIPLICATION OF TABLE

import java.util.Scanner;
public class P1 {
    static void Multiplication(int num){
        int sum=0;
        for(int i=0 ; i<11 ; i++){
            sum=num*i;
            System.out.println(num + "X" + i + "=" + sum);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which table u want to hear");
        int num=sc.nextInt();
        Multiplication(num);

    }
        

    
}
