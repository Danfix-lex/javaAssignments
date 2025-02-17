package BikeFunction;

public class BikeFunction {
   private boolean isOn = false;
   private int speed = 0;
   private int currentGear = 1;

   public void turnOn() {
      this.isOn = true;
   }

   public void turnOff() {
      this.isOn = false;
      this.speed = 0;
      this.currentGear = 1;
   }

   public void accelerate() {
      if (this.isOn) {
         this.speed += this.currentGear;
         this.updateGear();
      }
   }

   public void decelerate() {
      if (this.isOn && this.speed > 0) {
         this.speed = Math.max(0, this.speed - this.currentGear);
         this.updateGear();
      }
   }

   public void updateGear() {
      if (this.speed <= 20) {
         this.currentGear = 1;
      } else if (this.speed <= 30) {
         this.currentGear = 2;
      } else if (this.speed <= 40) {
         this.currentGear = 3;
      } else {
         this.currentGear = 4;
      }

   }

   public boolean isOn() {
      return this.isOn;
   }

   public int getSpeed() {
      return this.speed;
   }

   public int getCurrentGear() {
      return this.currentGear;
   }
}
