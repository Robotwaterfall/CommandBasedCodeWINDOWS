// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;


public class TeleopDrivecmd extends Command {
  private final DriveTrainSubsystem drivetrainsub;
  private final Supplier <Double> speedFunction, turnFunction;
 
  public TeleopDrivecmd(DriveTrainSubsystem drivetrainsub, Supplier <Double> speedFunction, Supplier <Double> turnFunction) {
    this.drivetrainsub = drivetrainsub;
    this.speedFunction = speedFunction;
    this.turnFunction = turnFunction;
    
  }

  
  @Override
  public void initialize() {
    System.out.println("TeleoperatedDrivecmd Initialized");
  }

  
  @Override
  public void execute() {
    double realtimespeed = speedFunction.get();
    double realtimeturn = turnFunction.get();

    double Leftspeed = realtimespeed + realtimeturn;
    double Rightspeed = realtimespeed - realtimeturn;

    drivetrainsub.setMotor(Rightspeed, Leftspeed);
  }

  
  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
