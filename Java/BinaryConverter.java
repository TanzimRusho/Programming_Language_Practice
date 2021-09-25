import java.util.Scanner;

class Converter {
    static String binary = "";

    static String toBinary(int x)
    {      
        while(x > 0)
        {
            binary = x%2 + binary;
            x /= 2;
        }
        
        return binary;
    }
}

public class BinaryConverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}

