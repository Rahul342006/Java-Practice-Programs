//REVERSE AN ARRAY

import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr;
        System.out.println("Enter arr size:");
        int size=sc.nextInt();
        arr= new int[size];
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter elements:");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length ; i++ ){
            System.out.print(arr[i]);
        }
        for(int i=0 ; i<arr.length/2 ; i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;

        }
        System.out.println();
        System.out.println("Reversed array:");
        for(int i=0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

}
    

