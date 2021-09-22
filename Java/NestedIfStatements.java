import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       boolean isSuspended = read.nextBoolean();
       int ourScore = read.nextInt();
       int theirScore = read.nextInt();
       
       // your code goes here
       if (isSuspended) 
           System.out.println("Suspended");
       else {
           if (ourScore > theirScore)
               System.out.println("Won");
           else if (ourScore == theirScore)
               System.out.println("Draw");
           else
               System.out.println("Lost");               
       }
   }
}
