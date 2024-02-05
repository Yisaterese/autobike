package autoBike;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AutoBike {
    private boolean isOn;
    private int currentGear;
    private int speed;

    public boolean isOn() {
        return isOn;

    }
    public void toggleSwitch() {
        isOn = !isOn;
    }
    public void accelerate() {
       speed++;
    }
    public int getSpeed(){
        return speed;
    }

    public void setGear(){
        switch (currentGear) {
            case 1:
                boolean gearOne  = speed >= 0 && speed <= 20;
            case 2:
                boolean gearTwo = speed >= 21 && speed <=30;
            case 3:
                boolean gearThree = speed >= 31 && speed <= 40;
            case 4:
                boolean gearFour = speed >= 41;
        }

    }
    public void getGear() {

        int gearRange = 4;
        for (currentGear = 1; currentGear <= gearRange; currentGear++) {
            if (currentGear == 1) {
                speed++;
            } else if (currentGear == 2) {
                speed += 2;
            } else if (currentGear == 3) {
                speed += 3;
            } else if (currentGear == 4) {
                speed += 4;
            }
        }
        // return speed();
//    }
//  public void decelerate(){
//    accelerate--;
//
//}
//
//
//    public int speed(){
//        speed++;
//        return speed;
//    }
    }
}