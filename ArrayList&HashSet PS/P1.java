//Create Array list to get students print using for each loop

import java.util.Scanner;
import java.util.*;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Students=new ArrayList<String>();
        System.out.println("Enter number of students to add:");
        int num=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            System.out.println("Enter name of students:");
            String name=sc.nextLine();
            Students.add(name);
        }
        for(String str : Students){
            System.out.println(str);
        }
    }
}
