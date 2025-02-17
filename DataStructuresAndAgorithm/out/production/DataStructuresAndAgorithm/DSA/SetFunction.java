package DSA;

import java.util.HashSet;
import java.util.Set;

public class SetFunction {
   private Set<String> elements = new HashSet();

   public boolean isEmpty() {
      return this.elements.isEmpty();
   }

   public void add(String message) {
      this.elements.add(message);
   }

   public int size() {
      return this.elements.size();
   }

   public boolean isNotEmpty() {
      return !this.elements.isEmpty();
   }

   public void remove(String message) {
      this.elements.remove(message);
   }

   public boolean contains(String message) {
      return this.elements.contains(message);
   }

   public void clear() {
      this.elements.clear();
   }
}
