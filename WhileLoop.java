import java.util.Scanner;

public class WhileLoop {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int number = read.nextInt();

       //your code goes here
       int i = 1;
       
       while(i <= number)
       {
           if (i%3==0 || i%10==3)
               System.out.println(i);
           ++i;
       }
   }
}
