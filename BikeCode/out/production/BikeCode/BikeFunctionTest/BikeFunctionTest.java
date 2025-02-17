package BikeFunctionTest;

import BikeFunction.BikeFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BikeFunctionTest {
   @Test
   public void testInitialState() {
      BikeFunction bike = new BikeFunction();
      Assertions.assertFalse(bike.isOn());
      Assertions.assertEquals(0, bike.getSpeed());
      Assertions.assertEquals(1, bike.getCurrentGear());
   }

   @Test
   public void testTurnOn() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();
      Assertions.assertTrue(bike.isOn());
   }

   @Test
   public void testTurnOff() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();
      bike.accelerate();
      bike.turnOff();
      Assertions.assertFalse(bike.isOn());
      Assertions.assertEquals(0, bike.getSpeed());
      Assertions.assertEquals(1, bike.getCurrentGear());
   }

   @Test
   public void testAccelerateInGearOne() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();
      bike.accelerate();
      Assertions.assertEquals(1, bike.getSpeed());
      Assertions.assertEquals(1, bike.getCurrentGear());
   }

   @Test
   public void testGearChangeOnAcceleration() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();

      for(int i = 0; i < 22; ++i) {
         bike.accelerate();
      }

      Assertions.assertEquals(23, bike.getSpeed());
      Assertions.assertEquals(2, bike.getCurrentGear());
   }

   @Test
   public void testDecelerateInGearThree() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();

      for(int i = 0; i < 35; ++i) {
         bike.accelerate();
      }

      bike.decelerate();
      Assertions.assertEquals(59, bike.getSpeed());
      Assertions.assertEquals(4, bike.getCurrentGear());
   }

   @Test
   public void testNoAccelerationWhenOff() {
      BikeFunction bike = new BikeFunction();
      bike.accelerate();
      Assertions.assertEquals(0, bike.getSpeed());
   }

   @Test
   public void testGearFourAcceleration() {
      BikeFunction bike = new BikeFunction();
      bike.turnOn();

      for(int i = 0; i < 42; ++i) {
         bike.accelerate();
      }

      Assertions.assertEquals(4, bike.getCurrentGear());
      bike.accelerate();
      Assertions.assertEquals(95, bike.getSpeed());
   }
}
