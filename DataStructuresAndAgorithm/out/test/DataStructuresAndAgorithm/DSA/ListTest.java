package DSA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListTest {
   @Test
   public void testIsEmpty() {
      ListFunction list = new ListFunction();
      Assertions.assertTrue(list.isEmpty());
   }

   @Test
   public void testSize() {
      ListFunction list = new ListFunction();
      Assertions.assertEquals(0, list.size());
   }

   @Test
   public void testIsNotEmpty() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      Assertions.assertTrue(list.isNotEmpty());
   }

   @Test
   public void testElementAdd() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      Assertions.assertEquals(1, list.size());
   }

   @Test
   public void testElementRemove() {
      ListFunction list = new ListFunction();
      list.remove("Hello");
      Assertions.assertEquals(0, list.size());
   }

   @Test
   public void testMultipleElementAdd() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      list.add("World");
      list.add("MY");
      list.add("Name");
      list.add("Is");
      list.add("Danfix");
      Assertions.assertEquals(6, list.size());
   }

   @Test
   public void testMultipleElementRemove() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      list.add("World");
      list.add("MY");
      list.add("Name");
      list.add("Is");
      list.add("Danfix");
      list.remove("Danfix");
      list.remove("World");
      list.remove("MY");
      list.remove("Name");
      Assertions.assertEquals(2, list.size());
   }

   @Test
   public void testIndexOfList() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      list.add("World");
      list.add("MY");
      list.add("Name");
      list.add("Is");
      list.add("Danfix");
      Assertions.assertEquals(3, list.index("Name"));
   }

   @Test
   public void testRemoveIndexOfList() {
      ListFunction list = new ListFunction();
      list.add("Hello");
      list.add("World");
      list.add("MY");
      list.add("Name");
      list.add("Is");
      list.add("Danfix");
      Assertions.assertEquals(5, list.index("Danfix"));
   }
}
