package Motor;

public class Motor {

    boolean ignition;

    void ignitionOn() {
        ignition = true;
    }

    void engineOff() {
        ignition = false;
    }

    void power() {
        if (ignition == true) {
            System.out.println("Engine on");
        } else {
            System.out.println("Engine off");
        }
    }

}
