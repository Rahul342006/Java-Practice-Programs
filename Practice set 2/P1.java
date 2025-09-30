//write a java program to encrypt a grade by adding 8 and decrypt it
import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter grade:");
        char grade=sc.next().charAt(0);
        int encryptedgrade=(grade+8);
        System.out.println("Encrypted grade is:"+ encryptedgrade);
        char decryptgrade=(char)(encryptedgrade-8);
        System.out.println(" Decrypted grade is:" + decryptgrade);



    }
    
}
