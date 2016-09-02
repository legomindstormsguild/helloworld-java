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
            mA.forward();
            Delay.msDelay(1000);
            mA.stop();
            mA.setSpeed(10);
            mA.backward();
            Delay.msDelay(1000);
            mA.stop();
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
            mB.forward();
            Delay.msDelay(1000);
            mB.stop();
            mB.setSpeed(10);
            mB.backward();
            Delay.msDelay(1000);
            mB.stop();
            System.out.println("JESZCZE JAK!");
        } catch (Exception e) {
            System.out.println("SMUTNA ZABA!!");
            e.printStackTrace();
        }

        System.out.println("NARA!!");
        System.exit(0);
    }
}