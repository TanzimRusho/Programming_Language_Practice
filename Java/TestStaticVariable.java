class Counter {
    public static int COUNT = 0;
    
    Counter() { 
        ++COUNT;
    }
}

public class TestStaticVariable {
    public static void main(String args[]) {
        Counter x1 = new Counter();
        Counter x2 = new Counter();
        
        System.out.println(Counter.COUNT);
    }
}

// Output: 2
