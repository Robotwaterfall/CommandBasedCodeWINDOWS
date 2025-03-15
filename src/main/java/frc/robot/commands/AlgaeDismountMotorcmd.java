// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AlgaeDismountMotorSubsystem;


public class AlgaeDismountMotorcmd extends Command {

  private final AlgaeDismountMotorSubsystem Algaedismountsub;
  private double speed;

  
  public AlgaeDismountMotorcmd(AlgaeDismountMotorSubsystem Algaedismountsub, double speed) {
    this.Algaedismountsub = Algaedismountsub;
    this.speed = speed;
    addRequirements(Algaedismountsub);
  }

  
  @Override
  public void initialize() {
    System.out.println("AlgaeDismountMotor Initialized");
  }

  
  @Override
  public void execute() {
    Algaedismountsub.setMotors(speed);
  }

  
  @Override
  public void end(boolean interrupted) {
    Algaedismountsub.setMotors(0);
    System.out.println("AlgaeDismountMotor Terminated");
  }


  @Override
  public boolean isFinished() {
    return false;
  }
}
