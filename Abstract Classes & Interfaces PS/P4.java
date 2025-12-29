//Interface tv remote inherits interface Smart tv remote polymorphisim included

import java.util.Scanner;
interface TVremote{
    public void changeChannels(int ch);
    public void increaseVolume();
}
interface SmartTVremote extends TVremote{
    public void accessOtt();
}
class TV implements SmartTVremote{
    public void changeChannels(int ch){
        if(ch==1){
            System.out.println("Changing channels using remote");
        }
        else{
            System.out.println("Changing channels based on voice");
        }
    }
    public void accessOtt(){
        System.out.println("Accessing OTT");
    }
    public void increaseVolume(){
        System.out.println("Incresing or Decreasing ");
    }
}
public class P4 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    TV obj=new TV();
    System.out.println("Enter choice: 1 for remote 2 for voice");
    int ch=sc.nextInt();
    obj.changeChannels(ch);
    System.out.println();
    obj.accessOtt();

    }
    
}
