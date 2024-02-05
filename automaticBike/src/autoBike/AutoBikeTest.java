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
          autoBike.accelerate();
          for(int count = 1; count <= 15; count++){
              autoBike.accelerate();
          }
          assertEquals(16,autoBike.getSpeed());

      }
    @Test
    public void autoBikeCanAccelerateAtGearTwoSpeed20_autoBikeCanAccelerateAtGearTwoSpeed21Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        autoBike.accelerate();
        for (int count = 1; count <= 21; count++) {
            autoBike.accelerate();
        }
        assertEquals(23, autoBike.getSpeed());
    }
    @Test
    public void autoBikeCanAccelerateAtGearThreeSpeed35_autoBikeCanAccelerateAtGearThreeSpeed47Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        for (int count = 1; count <= 31; count++) {
            autoBike.accelerate();

        }
        assertEquals(47, autoBike.getSpeed());
    }

    @Test
    public void autoBikeCanAccelerateAtGearFourSpeed41_autoBikeCanAccelerateAtGearFourSpeed87Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        for (int count = 1; count <= 41; count++) {
            autoBike.accelerate();
        }
        assertEquals(87, autoBike.getSpeed());
    }

    @Test
    public void autoBikeCanDecelerateAtGearOneSpeed16_autoBikeCanDecelerateAtGearOneSpeed15Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        autoBike.accelerate();
        for(int count = 1; count <= 15; count++){
            autoBike.accelerate();
        }
        assertEquals(16,autoBike.getSpeed());

        autoBike.decelerate();
        assertEquals(15, autoBike.getSpeed());

    }

    @Test
    public void autoBikeCanDecelerateAtGearThreeSpeed47_autoBikeCanDecelerateAtGearThreeSpeed43Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        for(int count = 1; count <= 31; count++){
            autoBike.accelerate();
        }
        assertEquals(47,autoBike.getSpeed());

        autoBike.decelerate();
        assertEquals(43, autoBike.getSpeed());

    }

    @Test
    public void autoBikeCanDecelerateAtGearFourSpeed87_autoBikeCanDecelerateAtGearFourSpeed83Test() {
        AutoBike autoBike = new AutoBike();
        assertFalse(autoBike.isOn());
        autoBike.toggleSwitch();
        assertTrue(autoBike.isOn());
        for(int count = 1; count <= 41; count++){
            autoBike.accelerate();
        }
        assertEquals(87,autoBike.getSpeed());

        autoBike.decelerate();
        assertEquals(83, autoBike.getSpeed());

    }


}



