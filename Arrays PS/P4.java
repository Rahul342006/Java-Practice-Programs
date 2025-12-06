//ADDITION OF MATRIX
import java.util.Scanner;
public class P4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] Matrix1;
        System.out.println("Enter Matrix Rows:");
        int Rows=sc.nextInt();
        System.out.println("Enter Matrix Coloumns: ");
        int Coloumns=sc.nextInt();
        Matrix1= new int[Rows][Coloumns];
        for(int i=0 ; i<Rows; i++ ){
            for(int j=0 ; j<Coloumns ; j++){
                System.out.println("Enter numbers for Matrix1");
            Matrix1[i][j]=sc.nextInt();
            }
        }
        int[][] Matrix2;
        System.out.println("Enter Matrix2 Rows:");
        int Rows2=sc.nextInt();
        System.out.println("Enter Matrix2 Coloumns: ");
        int Coloumns2=sc.nextInt();
        Matrix2= new int[Rows2][Coloumns2];
       for(int i=0 ; i<Rows2 ; i++ ){
            for(int j=0 ; j<Coloumns2 ; j++){
                System.out.println("Enter numbers for Matrix2:");
                Matrix2[i][j]=sc.nextInt();
            }
        }
        int [][] sum=new int[Rows][Coloumns];
        for(int i=0 ; i<Rows ; i++){
            for(int j=0 ; j<Coloumns; j++){
                sum[i][j]=Matrix1[i][j] + Matrix2[i][j];
            }
        }
        for(int i=0 ; i<Rows ; i++ ){
            for(int j=0 ; j<Coloumns ; j++){
                System.out.print(sum[i][j] + "");
            }
            System.out.println();
        }
        
        

    }
}

