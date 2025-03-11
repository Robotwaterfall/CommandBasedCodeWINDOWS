// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.Constants.OIconstants;
import frc.robot.commands.TeleopElevatorcmd;
import frc.robot.subsystems.ElevatorSubsystem;



public class RobotContainer {

  //Creates a new Elevatorsubsystem.
  private final ElevatorSubsystem elevatorsub = new ElevatorSubsystem(); 

  //**creates a new PS4 controller. I will be using a PS5 and will also change this to a xbox controller
  //in the feature**
  private final PS4Controller controller = new PS4Controller(OIconstants.kControllerPort);

  public RobotContainer() {
    
    configureBindings();
    configureButtonBindings();
  }

  private void configureBindings() {}

  private void configureButtonBindings() {
    //makes the elevator go up with the button *SQUARE*
    new JoystickButton(controller, ElevatorConstants.kElevatorUpButton).whileTrue(new TeleopElevatorcmd(elevatorsub, ElevatorConstants.kElevatorSpeedUp));
    //makes the elevator go down with the button *X*
    new JoystickButton(controller, ElevatorConstants.kElevatorDownButton).whileTrue(new TeleopElevatorcmd(elevatorsub, ElevatorConstants.kElevatorSpeedDown));
  }


  public Command getAutonomousCommand() {
    return null;
  }
}
