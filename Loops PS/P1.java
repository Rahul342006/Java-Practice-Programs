//PROGRAM TO PRINT PATTERN
//****
//***
//** 

import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pattern symbol");
        char Sym=sc.next().charAt(0);
        System.out.println("Enter a num for pattern");
        int num=sc.nextInt();
        for(int i=num ; i!=0; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(Sym);
            }
            System.out.println();
        }



    }


}
