// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.driveconstants;

public class DriveSubsystem extends SubsystemBase {

  //creates the motors
  public final TalonSRX leftmastermotor1 = new TalonSRX(driveconstants.kLeftMasterMotor1port);
  public final TalonSRX leftmastermotor2 = new TalonSRX(driveconstants.kLeftMasterMotor2port);
  public final TalonSRX rightmastermotor1 = new TalonSRX(driveconstants.kRightMasterMotor1port);
  public final TalonSRX rightmastermotor2 = new TalonSRX(driveconstants.kRightMasterMotor2port);

  public DriveSubsystem() { 
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotor(double leftspeed, double rightspeed){
    leftmastermotor1.set(ControlMode.PercentOutput, leftspeed);
    leftmastermotor2.set(ControlMode.PercentOutput, leftspeed);
    rightmastermotor1.set(ControlMode.PercentOutput, rightspeed);
    rightmastermotor2.set(ControlMode.PercentOutput, rightspeed);
  }
}
