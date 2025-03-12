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
  public static final class ElevatorConstants {
    public static final int kElevatorMotorPort = 0; //Motor port
    public static final double kElevatorSpeedUp = 0.5; //Motor speed going up
    public static final double kElevatorSpeedDown = -0.5; //Motor speed going down
    public static final int kElevatorUpButton = 1; //button that makes the elevator go up
    public static final int kElevatorDownButton = 2; //button that makes the elevator go down

    public static final double kElevatorKp = 0.0;
    public static final double kElevatorKi = 0.0;
    public static final double kElevatorKd = 0.0;

    public static final int kElevatorPIDUpButton = 3; //button that starts the PID to go up
    public static final int kElevatorPIDDownButton = 4; //button that starts the PID to go down
    public static final double kElevatorPIDsetpointgoto = 1.3; //Sets the PID motor to 1.3 meters
    public static final double kElevatorPIDsetpointreturn = 0; //resets the PID motor back to 0 making the elevator go down
  }
  public static final class OIconstants{
    public static final int kControllerPort = 0; //makes the controller port 0 
  }
}
