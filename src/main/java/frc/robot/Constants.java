// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {

  public final class DriveConstants{
    //ports for the motors
    public static final int kLeftMasterMotor1port = 18;
    public static final int kLeftMasterMotor2port = 3;
    public static final int kRightMasterMotor1port = 4;
    public static final int kRightMasterMotor2port = 1;
  }

  public final class OIConstants{
    //port for xbox controller is *0*
    public static final int kDriverControllerPort = 0; 
  }

  public final class IntakeConstants{
    public static final int kIntakeMotorPort = 0; //*yet to be decided*

    public static final int kIntakeSpeed = 1; //sets the intake speed to 100%
    public static final int kOuttakeSpeed = -1; //sets the outtake speed to 100%

    public static final int kintakeButton = 1; //sets the button to be pressed to activate the intake
    public static final int kouttakeButton = 2; //sets the button to be pressed to activate the outtake
  }

  }
