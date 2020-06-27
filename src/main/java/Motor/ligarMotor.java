package Motor;

import java.util.Scanner;

public class ligarMotor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Motor motor = new Motor();
        byte option = 0;
        boolean exit = false;

        while (!exit){

            System.out.println("Options: \n1 - turn on Motor \n2 - Turn off \n0 - Exit");

            try {
                System.out.println("Type options: ");
                option = sc.nextByte();
            } catch (Exception exception) {
                sc.next();
                System.out.println("Just type numbers!");
                continue;

            }

            if (option == 1) {
                motor.ignitionOn();
                motor.power();
            } else if (option == 2) {
                if (motor.ignition) {
                    motor.engineOff();
                    motor.power();
                } else {
                    System.out.println("Engine is not starting");
                }
            } else if (option == 0) {
                exit = true;

            } else {
                System.out.println("Invalid option");
            }

        }

    }
}
