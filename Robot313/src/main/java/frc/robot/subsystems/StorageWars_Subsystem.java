/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class StorageWars_Subsystem extends SubsystemBase {
  /**
   * Creates a new StorageWars_Subsystem.
   */
  private final TalonSRX storageSRX1=new TalonSRX(Constants.storageSRX1);
  private final TalonSRX storageSRX2=new TalonSRX(Constants.storageSRX2);
 
  public StorageWars_Subsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
