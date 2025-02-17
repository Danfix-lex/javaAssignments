package DSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetTest {
   @Test
   public void testFunction() {
      new SetFunction();
   }

   @Test
   public void testEmptySet() {
      SetFunction set = new SetFunction();
      Assertions.assertTrue(set.isEmpty());
   }

   @Test
   public void testAdd() {
      SetFunction set = new SetFunction();
      set.add("Hello");
      Assertions.assertEquals(1, set.size());
   }

   @Test
   public void testIsNotEmpty() {
      SetFunction set = new SetFunction();
      set.add("Hello");
      Assertions.assertTrue(set.isNotEmpty());
   }

   @Test
   public void testRemove() {
      SetFunction set = new SetFunction();
      set.add("Hello");
      set.add("World");
      Assertions.assertEquals(2, set.size());
      set.remove("World");
      Assertions.assertEquals(1, set.size());
   }

   @Test
   public void testContains() {
      SetFunction set = new SetFunction();
      set.add("Hello");
      set.add("World");
      Assertions.assertTrue(set.contains("World"));
   }

   @Test
   public void testClear() {
      SetFunction set = new SetFunction();
      set.add("Hello");
      set.add("World");
      set.clear();
      Assertions.assertTrue(set.isEmpty());
   }
}
