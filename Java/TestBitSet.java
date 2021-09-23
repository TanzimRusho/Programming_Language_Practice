/*
    Output:
    true
    true
    true
    true
    true
    false
*/

import java.util.BitSet;

public class TestBitSet {
    public static void main(String args[]) {
        BitSet obj = new BitSet(5);
      
        for(int i=0; i < 5; ++i)
            obj.set(i);
        
        for(int i=0; i < 6; ++i)
            System.out.println(obj.get(i));
    }
}
