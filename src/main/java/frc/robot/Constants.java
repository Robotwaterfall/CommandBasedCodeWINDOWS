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
  // Elevator Motor Ports
  public static final int kElevatorMotorPort = 13;
  //Elevator Buttons
  public static final int kElevatorUpButton = 1;
  public static final int kElevatorDownButton = 2;
  public static final int kElevatorPIDUpButton = 3;
  public static final int kElevatorPIDDownButton = 4;
  // Elevator speed (arcade drive)
  public static final double kElevatorSpeedup = 0.5; // 0.5 is the speed
  public static final double kElevatorSpeeddown = -0.5; // -0.5 is the speed

  // Elevator PID Constants 
  public static final double kElevatorSetpointreturn = 0; // the setpoint for the elevator to return to (0 meters)
  public static final double kElevatorSetpointgoto = 1.2; // the setpoint for the elevator to go to (1.2 meters)
  }
  public static final class OIconstants{
    public static final int kControllerPort = 0; //makes the controller port 0 
  }
}
