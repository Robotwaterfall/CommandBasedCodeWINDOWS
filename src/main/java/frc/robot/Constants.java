// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static class OIconstants{

        //sets the controller port
        public final static int kControllerPort = 0;

        //sets the button for the algaedismountmotor
        public final static int kControllerButtonAlgaeDismountMotor = 1;
        //speed of the motor
        public final static double kAlgaeDismountMotorSpeed = 1;

        
    }

    public final static class driveconstants{
        //Motor Ports
        public final static int kLeftMasterMotor1port = 1;
        public final static int kLeftMasterMotor2port = 2;
        public final static int kRightMasterMotor1port = 3;
        public final static int kRightMasterMotor2port = 4;

        //X and Y
        public final static int kXControllerport = 0;
        public final static int kYControllerport = 1;
    }

    public final static class AlgaeDismountConstants{
        //Motor Ports
        public final static int kAlgaeArmMotorport = 0; //*yet to be choosen (ARMMOTOR)*/
        public final static int kAlgaeMotorPort = 5; //*yet to be choosen (SPINMOTOR)*/

        //Kp, Ki, and Kd
        public final static double kAlgaePidControllerKp = 0;
        public final static double kAlgaePidControllerKi = 0;
        public final static double kAlgaePidControllerKd = 0;
    }

}
