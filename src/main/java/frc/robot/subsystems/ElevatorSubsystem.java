// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorSubsystem extends SubsystemBase {

  private SparkMax elevatorMotor = new SparkMax(ElevatorConstants.kElevatorMotorPort, MotorType.kBrushless); // Creates a new SparkMax object for the elevator motor 
  private final double kEncoderTick2Meter = 1.0/4096.0 * 0.1 * Math.PI;
  
  //gets the postition of the elevator motor
  private double getElevatorHeight() {
    return elevatorMotor.getEncoder().getPosition() * kEncoderTick2Meter;
  }

  //gets the position of the encoder
  private double getEncoderPosition() {
    return elevatorMotor.getEncoder().getPosition();
  }

  

  public ElevatorSubsystem() {}

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Elevator Height", getElevatorHeight());
    SmartDashboard.putNumber("Elevator Encoder Position", getEncoderPosition());
  }

  public void setElevatorSpeed(double speed) {
    elevatorMotor.set(speed);
  }
}
