// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrianSubsystem;

public class ArcadeDrivecmd extends Command {

  public final DriveTrianSubsystem drivetriansubsystem;
  public final Supplier<Double> speedFunction, turnFunction;

  public ArcadeDrivecmd(DriveTrianSubsystem drivetriansubsystem, Supplier<Double> speedFunction, Supplier<Double> turnFunction) {
    this.drivetriansubsystem = drivetriansubsystem;
    this.speedFunction = speedFunction;
    this.turnFunction = turnFunction;
  }


  @Override
  public void initialize() {
    System.out.println("ArcadeDrive Activated");
  }


  @Override
  public void execute() {
    double realtimeSpeed = speedFunction.get();
    double realtimeTurn = turnFunction.get();

    double Leftspeed = realtimeSpeed + realtimeTurn;
    double Rightspeed = realtimeSpeed - realtimeTurn;

    drivetriansubsystem.setMotors(Leftspeed, Rightspeed);
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("ArcadeDrive deactiviated");
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}
