// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ElevatorSubsystem;


public class TeleopElevatorcmd extends Command {

  private final ElevatorSubsystem elevatorsubsystem;
  private final double speed;

 
  public TeleopElevatorcmd(ElevatorSubsystem elevatorsubsystem, double speed) {
    this.elevatorsubsystem = elevatorsubsystem;
    this.speed = speed;
    addRequirements(elevatorsubsystem);
    
  }

 
  @Override
  public void initialize() {
    System.out.println("TeleopElevatorcmd activiated");
  }

 
  @Override
  public void execute() {
    elevatorsubsystem.setElevatorSpeed(speed);
  }

  
  @Override
  public void end(boolean interrupted) {
    elevatorsubsystem.setElevatorSpeed(0);
    System.out.println("TeleopElevatorcmd ended");
  }

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
