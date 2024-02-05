package autoBike;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AutoBike {
    private boolean isOn;
    private int currentGear = 1;
    private int speed;

    public boolean isOn() {
        return isOn;

    }
    public void toggleSwitch() {
        isOn = !isOn;
    }

    public int getSpeed(){
        return speed;
    }
    public void setGear(){
       if (speed >= 0 && speed <= 20) {
           currentGear = 1;
       }

           /*  = speed >= 21 && speed <=30;

            speed >= 31 && speed <= 40;
              speed >= 41;*/


    }
    public int getGear(){
        return currentGear;
    }
    public void accelerate() {

            if (currentGear == 1) {
                speed++;
            } else if (currentGear == 2) {
                speed += 2;
            } else if (currentGear == 3) {
                speed += 3;
            } else if (currentGear == 4) {
                speed += 4;
            }

            setGear();

    }
}