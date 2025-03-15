// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ArcadeDrivecmd;
import frc.robot.subsystems.DriveSubsystem;



public class RobotContainer {

  //Creates A New DriveSubsystem
  private final DriveSubsystem drivesubsystem = new DriveSubsystem();

  //Creates A New PS4 Contoller
  private final PS4Controller controller = new PS4Controller(0);

  public RobotContainer() {

    //Gets The Controller Axis And Translates Them To *ArcadeDrivecmd*
    drivesubsystem.setDefaultCommand(
      new ArcadeDrivecmd(drivesubsystem, () -> controller.getRawAxis(0), () -> controller.getRawAxis(1))
    );
    configureBindings();
  }

  private void configureBindings() {

  }


  public Command getAutonomousCommand() {
    return null;
  }
}
