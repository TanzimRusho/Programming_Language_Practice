import java.util.*;

public class ArrayListTest {
    public static void main(String args[]) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      list.add(4);
      list.add(2);
      list.add(3);
      list.remove(2);
      
      Collections.sort(list);
      
      System.out.println(list);
      System.out.println(list.get(0)*list.size());
    }
}
