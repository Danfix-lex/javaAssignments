package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFunction {
   private final Queue<String> elements = new LinkedList();

   public boolean isEmpty() {
      return this.elements.isEmpty();
   }

   public void enqueue(String name) {
      this.elements.add(name);
   }

   public int size() {
      return this.elements.size();
   }

   public void dequeue(String name) {
      this.elements.remove(name);
   }

   public String peek() {
      return (String)this.elements.peek();
   }
}
