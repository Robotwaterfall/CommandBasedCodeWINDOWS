// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AlgaeDismountConstants;

public class AlgaeDismountMotorSubsystem extends SubsystemBase {
  //Creates a new Motor
  private SparkMax AlgaeDismountMotor = new SparkMax(AlgaeDismountConstants.kAlgaeMotorPort, MotorType.kBrushless);

  //sets the motor's speed
  public void setMotors(double speed){
    AlgaeDismountMotor.set(speed);
  }

}
