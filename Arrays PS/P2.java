//TO CHECK AN ELEMENT IN ARRAY

import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr;
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        arr=new int[size];
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter elements into the array");
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter element to check:");
        int check=sc.nextInt();
        boolean found=false;
        for(int i=0 ; i<arr.length ; i++ ){
            if(arr[i]==check){
                found=true;
            }
        }
        if(found==true){
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found!");
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
