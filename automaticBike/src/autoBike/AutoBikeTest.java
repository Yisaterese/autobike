package autoBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AutoBikeTest {
    @Test
    public void autoBikeIsOn_autoBikeIsOnTest(){
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
    }
    @Test
    public void autoBikeIsOff_autoBikeIsOffTest() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());

        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        autoBike.toggleSwitch();
        assertFalse(autoBike.isOn());
    }


      @Test
    public void autoBikeCanAccelerateAtGearOneSpeed15_autoBikeCanAccelerateAtGearOneSpeed16Test() {
          AutoBike autoBike = new AutoBike();
          assertFalse(autoBike.isOn());
          autoBike.toggleSwitch();
          assertTrue(autoBike.isOn());
          assertEquals(1,autoBike.getGear());

          for(int count = 1; count <= 15; count++){
              autoBike.accelerate();
          }

          assertEquals(1,autoBike.getGear());
          assertEquals(16,autoBike.getSpeed());
         // assertEquals(5,autoBike.getGear());
          //assertEquals(16,autoBike.getSpeed());



      }



}



