//print two words continuosly on screen with delay of 200ms with thread

import java.util.Scanner;
class MyThread implements Runnable{
    String sentence;
    MyThread(String Sentence){
        this.sentence=Sentence;
    }
    public void run(){
        while(true){
            System.out.println(sentence);
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println("Thread intrupted");
            }

        }
    }
}
public class P1{
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s1=sc.nextLine();
        System.out.println("Enter sentence:");
        String s2=sc.nextLine();
        MyThread task1=new MyThread(s1);
        MyThread task2=new MyThread(s2);
        Thread obj1=new Thread(task1);
        Thread obj2=new Thread(task2);
        obj1.start();
        obj2.start();
    }
}