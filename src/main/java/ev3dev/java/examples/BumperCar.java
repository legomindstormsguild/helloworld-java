package ev3dev.java.examples;

import ev3dev.hardware.motor.EV3LargeRegulatedMotor;
import ev3dev.hardware.port.MotorPort;
import lejos.utility.Delay;

public class BumperCar {
    
    //Robot Definition
    private static EV3LargeRegulatedMotor mA = null;
    private static EV3LargeRegulatedMotor mB = null;

    public static void main(String[] args) {

        System.out.println("ELO SPORTOWY SWIRZE!");
        try {
            System.out.println("SPRAWDZAM MOTUR A!");
            mA = new EV3LargeRegulatedMotor(MotorPort.A);
            System.out.println("MAMY TO!");
            System.out.println("OBRACAM!");
            mA.setSpeed(10);
            mA.rotate(90);
            Delay.msDelay(1000);
            mA.setSpeed(-10);
            mA.rotate(90);
            Delay.msDelay(1000);
            System.out.println("JESZCZE JAK!");
        } catch (Exception e) {
            System.out.println("SMUTNA ZABA!!");
            e.printStackTrace();
        }
        try {
            System.out.println("SPRAWDZAM MOTUR B!");
            mB = new EV3LargeRegulatedMotor(MotorPort.B);
            System.out.println("MAMY TO!");
            System.out.println("OBRACAM!");
            mB.setSpeed(10);
            mB.rotate(90);
            Delay.msDelay(1000);
            mB.setSpeed(-10);
            mB.rotate(90);
            Delay.msDelay(1000);
            System.out.println("JESZCZE JAK!");
        } catch (Exception e) {
            System.out.println("SMUTNA ZABA!!");
            e.printStackTrace();
        }

        System.out.println("NARA!!");
        System.exit(0);
    }
}