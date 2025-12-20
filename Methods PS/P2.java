//Function for pattern
//*
//**
//***  

import java.util.Scanner;
public class P2 {
    static void Pattern(int num , char Sym){
        for(int i=1 ; i<=num ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(Sym);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pattern Symbol:");
        char Sym=sc.next().charAt(0);
        System.out.println("index:");
        int num=sc.nextInt();
        Pattern(num , Sym);

    }
    
}
