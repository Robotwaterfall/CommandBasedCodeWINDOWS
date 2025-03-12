// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveTrainConstants;

public class DriveTrainSubsystem extends SubsystemBase {
  //creates the motors
  public TalonSRX leftmastermotor1 = new TalonSRX(DriveTrainConstants.kLeftmotorport1);
  public TalonSRX leftmastermotor2 = new TalonSRX(DriveTrainConstants.kLeftmotorport2);
  public TalonSRX rightmastermotor1 = new TalonSRX(DriveTrainConstants.kRightmotorport1);
  public TalonSRX rightmastermotor2 = new TalonSRX(DriveTrainConstants.kRightmotorport2);

  public DriveTrainSubsystem() {}

  //sets the motors speed (LEFT AND RIGHT)
  public void setMotor(double rightspeed, double leftspeed){
    leftmastermotor1.set(ControlMode.PercentOutput, leftspeed);
    leftmastermotor2.set(ControlMode.PercentOutput, leftspeed);
    rightmastermotor1.set(ControlMode.PercentOutput, rightspeed);
    rightmastermotor2.set(ControlMode.PercentOutput, rightspeed);
  }

  @Override
  public void periodic() {
  }
}
