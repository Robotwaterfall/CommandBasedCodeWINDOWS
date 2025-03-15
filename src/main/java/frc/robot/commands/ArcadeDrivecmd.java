// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;


public class ArcadeDrivecmd extends Command {
  
  private DriveSubsystem drivesub;
  private Supplier <Double> speedFunction, turnFunction;

  public ArcadeDrivecmd(DriveSubsystem drivesub, Supplier <Double> speedFunction, Supplier <Double> turnFunction) {
    this.drivesub = drivesub;
    this.speedFunction = speedFunction;
    this.turnFunction = turnFunction;
  
  }

  
  @Override
  public void initialize() {
    System.out.println("ArcadeDrive has been initialized");
  }

  
  @Override
  public void execute() {
    double realtimeturn = turnFunction.get();
    double realtimespeed = speedFunction.get();

    double leftspeed = realtimespeed + realtimeturn;
    double rightspeed = realtimespeed - realtimeturn;

    drivesub.setMotor(leftspeed, rightspeed);
  }

  
  @Override
  public void end(boolean interrupted) {
    System.out.println("ArcadeDrive has been terminated");
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
