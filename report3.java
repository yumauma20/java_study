import java.util.Collections;
import java.util.ArrayList;

public class report3 {
  public static void main(String[] args) {
    ArrayList<Integer> data = new ArrayList<Integer>();
      for(int i = 1 ; i <= 10 ; i++) {
        data.add(i);
      }
      Collections.shuffle(data);
      System.out.println(data);
  }
}