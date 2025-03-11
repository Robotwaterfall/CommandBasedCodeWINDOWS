// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.ArcadeDrivecmd;
import frc.robot.subsystems.DriveTrianSubsystem;


public class RobotContainer {
  private final DriveTrianSubsystem drivetrainsub = new DriveTrianSubsystem();
  private final XboxController controller = new XboxController(OIConstants.kDriverControllerPort);

  public RobotContainer() {
    drivetrainsub.setDefaultCommand(
        new ArcadeDrivecmd(drivetrainsub, () -> controller.getRawAxis(1), () -> controller.getRawAxis(0)) // y-axis is 1, x-axis is 0
         );
    configureBindings();

  }



  private void configureBindings() {}


  public Command getAutonomousCommand() {
    return null;
  }

}


