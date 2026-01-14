//Set to store duplicale elements and verify that only one instance is stored

import java.util.Scanner;
import java.util.*;
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<String> elements=new HashSet<>();
        System.out.println("Enter Number of elements to add:");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<num ; i++){
            System.out.println("Enter elements to add:");
            String ele=sc.nextLine();
            elements.add(ele);
        }
        int Size=elements.size();
        System.out.println("Size of elements:" + Size );
        for(String str : elements){
            System.out.println(str);
        }
    }
}
