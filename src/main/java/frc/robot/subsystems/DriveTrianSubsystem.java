// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveTrianSubsystem extends SubsystemBase {

  public TalonSRX LeftMasterMotor1 = new TalonSRX (DriveConstants.kLeftMasterMotor1port);
  public TalonSRX LeftMasterMotor2 = new TalonSRX (DriveConstants.kLeftMasterMotor2port);
  public TalonSRX RightMasterMotor1 = new TalonSRX (DriveConstants.kRightMasterMotor1port);
  public TalonSRX RightMasterMotor2 = new TalonSRX (DriveConstants.kRightMasterMotor2port);
  /** Creates a new ArcadeDriveSubsystem. */
  public DriveTrianSubsystem() {
     
  }

  @Override
  public void periodic() {}

  public void setMotors(double Leftspeed, double Rightspeed){ {
    LeftMasterMotor1.set(ControlMode.PercentOutput, Leftspeed);
    LeftMasterMotor2.set(ControlMode.PercentOutput, Leftspeed);
    RightMasterMotor1.set(ControlMode.PercentOutput, Rightspeed);
    RightMasterMotor2.set(ControlMode.PercentOutput, Rightspeed);
  }
}
}
