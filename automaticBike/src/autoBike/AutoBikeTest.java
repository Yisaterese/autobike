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
    public void autoBikeCanAccelerate_autoBikeCanAccelerateTest() {
          AutoBike autoBike = new AutoBike();
          assertFalse(autoBike.isOn());
          autoBike.toggleSwitch();
          assertTrue(autoBike.isOn());
          autoBike.accelerate();
          assertEquals(1,autoBike.getSpeed());

          }
      }


//   @Test
//    public void autoBikeCanDeccelerate_autoBikeCanDeccelerateTest(){
//        AutoBike autoBike = new AutoBike();
//        assertFalse(autoBike.isOn());
//        autoBike.toggleSwitch();
//        assertTrue(autoBike.isOn());
//        autoBike.accelerate();
//        assertEquals(2, autoBike.accelerate());
//        autoBike.deccelerate();
//        assertEquals(0,autoBike.deccelerate());
//    }

