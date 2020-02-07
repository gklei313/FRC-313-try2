/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import java.util.function.DoubleSupplier;

//import edu.wpi.first.hal.sim.mockdata.DIODataJNI;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain_Subsystem;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class Drivetrain_Command extends CommandBase {
  /**
   * Creates a new Drivetrain_Command.
   */
  private final Drivetrain_Subsystem m_drive;
  private  double m_left;
  private  double m_right;

  public Drivetrain_Command(){//Drivetrain_Subsystem subsystem, Double right, Double left){
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.DrivetrainSubsystem);
    m_drive=Robot.DrivetrainSubsystem;
    m_left = RobotContainer.stick.getRawAxis(Constants.leftDriverstick);
    m_right = -RobotContainer.stick.getRawAxis(Constants.rightDriverstick);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_left = -RobotContainer.stick.getRawAxis(Constants.leftDriverstick);
    m_right = -RobotContainer.stick.getRawAxis(Constants.rightDriverstick);
    m_drive.Tankieboi(m_left, m_right);
  }

// Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
