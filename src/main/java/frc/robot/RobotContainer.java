// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OIconstants;
import frc.robot.Constants.driveconstants;
import frc.robot.commands.ArcadeDrivecmd;
import frc.robot.subsystems.AlgaeDismountMotorSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.commands.AlgaeDismountMotorcmd;



public class RobotContainer {

  //Creates A New DriveSubsystem
  private final DriveSubsystem drivesubsystem = new DriveSubsystem();

  //Creates A New AlgaeDismountMotorSubsystem
  private final AlgaeDismountMotorSubsystem AlgaemotorSubsystem = new AlgaeDismountMotorSubsystem();

  //Creates A New PS4 Contoller
  private final PS4Controller controller = new PS4Controller(OIconstants.kControllerPort);

  public RobotContainer() {

    //Gets The Controller Axis And Translates Them To *ArcadeDrivecmd*
    drivesubsystem.setDefaultCommand(
      new ArcadeDrivecmd(drivesubsystem, () -> controller.getRawAxis(driveconstants.kXControllerport), 
      () -> controller.getRawAxis(driveconstants.kYControllerport))
    );
    configureButtonBindings();
  }

  private void configureButtonBindings() {

    //button that Spins the algae dismount motor
    new JoystickButton(controller, OIconstants.kControllerButtonAlgaeDismountMotor).whileTrue
    (new AlgaeDismountMotorcmd(AlgaemotorSubsystem, OIconstants.kAlgaeDismountMotorSpeed));
  }


  public Command getAutonomousCommand() {
    return null;
  }
}
