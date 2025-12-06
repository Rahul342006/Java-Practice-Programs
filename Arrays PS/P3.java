//ARRAY TO CALCULATE AVERAGE MARKS
import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float[] Physics;
        System.out.println("Enter size:");
        int size=sc.nextInt();
        Physics=new float [size];
        float sum=0;
        for(int i=0 ; i<Physics.length ; i++){
            System.out.println("Enter Marks");
            Physics[i]=sc.nextFloat();

        }
        for(int i=0 ; i<Physics.length ; i++){
            sum +=Physics[i];
        }
        System.out.println(sum);
        float average=sum / size;
        System.out.println(average);
    }

    
}
