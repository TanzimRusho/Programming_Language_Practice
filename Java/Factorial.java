import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            int  number = scanner.nextInt();
            int fact = 1;
            int count = 2;
            //your code goes here
            while (count <= number)
            {
                fact *= count;
                ++count;
            }
            
            System.out.println(fact);
    }
}
