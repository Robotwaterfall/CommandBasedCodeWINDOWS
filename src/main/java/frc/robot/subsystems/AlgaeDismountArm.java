// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AlgaeDismountConstants;

public class AlgaeDismountArm extends SubsystemBase {
  //Creates a new Motor that moves the dismount arm up and down
  public SparkMax AlgaeDismountArm = new SparkMax(AlgaeDismountConstants.kAlgaeArmMotorport, MotorType.kBrushless);
  public SparkMaxConfig AlgaeDismountArmconfig = new SparkMaxConfig();

  private boolean isholdposition;

  private PIDController dismountarmController = new PIDController(
    AlgaeDismountConstants.kAlgaePidControllerKp,
    AlgaeDismountConstants.kAlgaePidControllerKi,
    AlgaeDismountConstants.kAlgaePidControllerKd
  );

  private double setpoint_Degress;
  
  public AlgaeDismountArm() {
    dismountarmController.enableContinuousInput(0,360);

    AlgaeDismountArmconfig.absoluteEncoder.positionConversionFactor(360);

    AlgaeDismountArm.configure(AlgaeDismountArmconfig,ResetMode.kResetSafeParameters,PersistMode.kNoPersistParameters);
  }

  public SparkMax getAlgaeDismountArm(){
    return AlgaeDismountArm;
  }

  public PIDController dismountarmController(){
    return dismountarmController;
  }

  public boolean getisholdposition(){
    return isholdposition;
  }

  public void setisholdposition(boolean state){
    isholdposition = state;
  }

  public double getSetpoint(){
    return setpoint_Degress;
  }

  public void setSetpoint(double newSetpoint_Degrees){
    setpoint_Degress = newSetpoint_Degrees;
}

}
