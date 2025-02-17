package DSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
   @Test
   public void testFunction() {
      new QueueFunction();
   }

   @Test
   public void isEmpty() {
      QueueFunction queue = new QueueFunction();
      Assertions.assertTrue(queue.isEmpty());
   }

   @Test
   public void addToQueue() {
      QueueFunction queue = new QueueFunction();
      queue.enqueue("Danfix");
      Assertions.assertFalse(queue.isEmpty());
      Assertions.assertEquals(1, queue.size());
   }

   @Test
   public void removeFromQueue() {
      QueueFunction queue = new QueueFunction();
      queue.dequeue("Danfix");
      Assertions.assertTrue(queue.isEmpty());
      Assertions.assertEquals(0, queue.size());
   }

   @Test
   public void addMultipleElementsToQueue() {
      QueueFunction queue = new QueueFunction();
      queue.enqueue("Danfix");
      queue.enqueue("Oj Skillz");
      queue.enqueue("Glo");
      queue.enqueue("Agbo Doctor");
      queue.enqueue("Sensie");
      queue.enqueue("Boss");
      Assertions.assertFalse(queue.isEmpty());
      Assertions.assertEquals(6, queue.size());
   }

   @Test
   public void removeMultipleElementsFromQueue() {
      QueueFunction queue = new QueueFunction();
      queue.enqueue("Danfix");
      queue.enqueue("Oj Skillz");
      queue.enqueue("Glo");
      Assertions.assertEquals("Danfix", queue.peek());
      Assertions.assertEquals(3, queue.size());
   }
}
