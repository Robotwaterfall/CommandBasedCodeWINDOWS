// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;


public class Intakecmd extends Command {

  private final IntakeSubsystem intakesubsystem;
  private final double speed;

  public Intakecmd(IntakeSubsystem intakesubsystem, double speed) {
    this.intakesubsystem = intakesubsystem;
    this.speed = speed;
    addRequirements(intakesubsystem);
  }

  @Override
  public void initialize() {
    System.out.println("IntakeCMD initialized");
  }

  @Override
  public void execute() {
    intakesubsystem.setIntakeSpeed(speed);
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("IntakeCMD ended");
    intakesubsystem.setIntakeSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
