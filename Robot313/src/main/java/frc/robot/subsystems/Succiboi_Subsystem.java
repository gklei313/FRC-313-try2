/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;

public class Succiboi_Subsystem extends SubsystemBase {
  /**
   * Creates a new Succiboi_Subsystem.
   */
  private final TalonSRX succiTalonSRX = new TalonSRX(Constants.succiTalonSRX);
  private final DoubleSolenoid piston1 = 
    new DoubleSolenoid(Constants.piston1Forward, Constants.piston1Aft);  
  public void Move1(int direction){
    switch(direction){
      case 0:
      piston1.set(DoubleSolenoid.Value.kForward);
      break;
      case 1:
      piston1.set(DoubleSolenoid.Value.kReverse);
      
    }

  }
  public void pullout(){
    piston1.set(kReverse);
  }

  public Succiboi_Subsystem() {
    
  }
  public void runSucc(){
    succiTalonSRX.set(ControlMode.PercentOutput,.25);
  }
  public void stopSucc(){
    succiTalonSRX.set(ControlMode.PercentOutput,0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
