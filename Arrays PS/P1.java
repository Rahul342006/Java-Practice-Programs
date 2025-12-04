//ARRAY OF 5 FLOATS & SUM

import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float [] Floats;
        Floats=new float[5];
        float sum=0;
        for(int i=0 ; i<Floats.length ; i++){
            System.out.println("Enter number to add into array");
            Floats[i]=sc.nextFloat();
        }
        for(int i=0 ; i< Floats.length ; i++){
            sum +=Floats[i];
        }
        System.out.println(sum);



    }

}

