package ev3dev.java.examples;

import ev3dev.hardware.motor.EV3LargeRegulatedMotor;
import ev3dev.hardware.motor.EV3MediumRegulatedMotor;
import ev3dev.hardware.port.MotorPort;
import lejos.utility.Delay;

public class BumperCar {
    
    //Robot Definition
    private static EV3LargeRegulatedMotor mA = null;
    private static EV3LargeRegulatedMotor mB = null;
    private static EV3MediumRegulatedMotor mC = null;

    public static void main(String[] args) {

        System.out.println("ELO SPORTOWY SWIRZE!");
        try {
            System.out.println("SPRAWDZAM MOTUR A!");
            mA = new EV3LargeRegulatedMotor(MotorPort.A);
            System.out.println("MAMY TO!");
            System.out.println("OBRACAM!");
            mA.setSpeed(500);
            mA.forward();
            for (int i = 0; i < 100; i++) {
                System.out.println("ROTACJA " + mA.getPosition() +
                        " RYCHLOSC " + mA.getSpeed() +
                        " RYCHLOSC KATOWA " + mA.getRotationSpeed());
                Delay.msDelay(100);
            }
//            Delay.msDelay(1000);
//            mA.stop();
//            mA.setSpeed(10);
//            mA.backward();
//            Delay.msDelay(1000);
//            mA.stop();
            mA.stop();
            mA.close();
            System.out.println("JESZCZE JAK!");
        } catch (Exception e) {
            System.out.println("SMUTNA ZABA!!");
            e.printStackTrace();
        }
//        try {
//            System.out.println("SPRAWDZAM MOTUR B!");
//            mB = new EV3LargeRegulatedMotor(MotorPort.B);
//            System.out.println("MAMY TO!");
//            System.out.println("OBRACAM!");
//            mB.setSpeed(500);
//            mB.forward();
////            Delay.msDelay(1000);
////            mB.stop();
////            mB.setSpeed(10);
////            mB.backward();
////            Delay.msDelay(1000);
////            mB.stop();
//            System.out.println("JESZCZE JAK!");
//        } catch (Exception e) {
//            System.out.println("SMUTNA ZABA!!");
//            e.printStackTrace();
//        }
//        try {
//            System.out.println("SPRAWDZAM MOTUR C!");
//            mC = new EV3MediumRegulatedMotor(MotorPort.C);
//            System.out.println("MAMY TO!");
//            System.out.println("OBRACAM!");
//            mC.setSpeed(500);
//            mC.forward();
////            Delay.msDelay(1000);
////            mC.stop();
////            mB.setSpeed(10);
////            mB.backward();
////            Delay.msDelay(1000);
////            mB.stop();
//            System.out.println("JESZCZE JAK!");
//        } catch (Exception e) {
//            System.out.println("SMUTNA ZABA!!");
//            e.printStackTrace();
//        }


        System.out.println("NARA!!");
        System.exit(0);
    }
}