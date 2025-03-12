// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.subsystems.ElevatorSubsystem;


public class PIDElevatorcmd extends Command {

  private ElevatorSubsystem elevatorsubsystem;
  private PIDController pidcontroller;

  public PIDElevatorcmd(ElevatorSubsystem elevatorsubsystem, PIDController pidcontroller, double setpoint) {
    this.elevatorsubsystem = elevatorsubsystem;
    this.pidcontroller = new PIDController(ElevatorConstants.kElevatorKp, ElevatorConstants.kElevatorKi, ElevatorConstants.kElevatorKd);
    pidcontroller.setSetpoint(setpoint);
    addRequirements(elevatorsubsystem);
  }


  @Override
  public void initialize() {
    pidcontroller.reset();
  }

  
  @Override
  public void execute() {
    System.out.println("Elevator PID executed");
    double speed = pidcontroller.calculate(elevatorsubsystem.getEncoderMeters());
    elevatorsubsystem.setElevatorSpeed(speed);
  }

  
  @Override
  public void end(boolean interrupted) {
    System.out.println("Elevator PID ended");
    elevatorsubsystem.setElevatorSpeed(0);
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}
