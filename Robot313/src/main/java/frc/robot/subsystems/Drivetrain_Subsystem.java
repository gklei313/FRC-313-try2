/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import frc.robot.Robot;
import frc.robot.commands.Drivetrain_Command;
import frc.robot.Constants; 


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain_Subsystem extends SubsystemBase {
  /** 
   * Creates a new Drivetrain_Subsystem.
   */
 
 private final SpeedControllerGroup m_leftMotors=
 new SpeedControllerGroup (new CANSparkMax(Constants.kleftMotor1, MotorType.kBrushless), 
                          new CANSparkMax(Constants.kleftMotor2, MotorType.kBrushless),
                          new CANSparkMax(Constants.kleftMotor3, MotorType.kBrushless)
                          );
  private final SpeedControllerGroup m_rightMotors=
  new SpeedControllerGroup (new CANSparkMax(Constants.krightMotor1, MotorType.kBrushless), 
                           new CANSparkMax(Constants.krightMotor2, MotorType.kBrushless),
                           new CANSparkMax(Constants.krightMotor3, MotorType.kBrushless)
                           );
  private final DifferentialDrive m_drive=new DifferentialDrive(m_leftMotors, m_rightMotors);
  public Drivetrain_Subsystem() {
    //encoder stuff l8r
  }
  public void Tankieboi(double LeftJoystick,double rightJoystick){
    m_drive.tankDrive (LeftJoystick, rightJoystick);
  }
  public void setMaxOutput(double maxOutput){
    m_drive.setMaxOutput(maxOutput);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setDefaultCommand(new Drivetrain_Command());
  }
}
