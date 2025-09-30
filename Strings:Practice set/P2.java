//'Replace free Space with underScore'
import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        String newstr=str.replace("" , "_");
        System.out.println("New string is:" + newstr);
    }
    
}
