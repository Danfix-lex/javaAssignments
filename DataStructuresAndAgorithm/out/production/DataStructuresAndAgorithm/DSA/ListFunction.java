package DSA;

import java.util.ArrayList;
import java.util.List;

public class ListFunction {
   private List<String> items = new ArrayList();
   private int size = 0;

   public boolean isEmpty() {
      return this.items.isEmpty();
   }

   public boolean isNotEmpty() {
      return !this.items.isEmpty();
   }

   public int size() {
      return this.items.size();
   }

   public void add(String element) {
      this.items.add(element);
      ++this.size;
   }

   public void remove(String element) {
      this.items.remove(element);
      --this.size;
   }

   public int index(String element) {
      return this.items.indexOf(element);
   }
}
