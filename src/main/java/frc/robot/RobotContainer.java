// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.ArcadeDrivecmd;
import frc.robot.commands.Intakecmd;
import frc.robot.subsystems.DriveTrianSubsystem;
import frc.robot.subsystems.IntakeSubsystem;


public class RobotContainer {
  private final DriveTrianSubsystem drivetrainsub = new DriveTrianSubsystem(); //creates a new instance of the drivetrain subsystem

  private final XboxController controller = new XboxController(OIConstants.kDriverControllerPort); //creates a new instance of the xbox controller

  private final IntakeSubsystem intakesub = new IntakeSubsystem(); //creates a new instance of the intake subsystem

  public RobotContainer() {
    drivetrainsub.setDefaultCommand(
        new ArcadeDrivecmd(drivetrainsub, () -> controller.getRawAxis(1), () -> controller.getRawAxis(0)) // y-axis is 1, x-axis is 0
         );
    configureBindings();
    configureButtonBindings();

  }



  private void configureBindings() {}

  private void configureButtonBindings() {
    new JoystickButton(controller, IntakeConstants.kintakeButton).whileTrue(new Intakecmd(intakesub, IntakeConstants.kIntakeSpeed));
    new JoystickButton(controller, IntakeConstants.kouttakeButton).whileTrue(new Intakecmd(intakesub, IntakeConstants.kOuttakeSpeed));
  }


  public Command getAutonomousCommand() {
    return null;
  }

}


