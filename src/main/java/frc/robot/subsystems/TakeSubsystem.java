// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class TakeSubsystem extends SubsystemBase {
  //CommandXboxController m_XboxController = new CommandXboxController(0);

  TalonFX m_Motor1;
  TalonFX m_Motor2;

  /** Creates a new intakeSubsystem. */
  public TakeSubsystem() {
    m_Motor1 = new TalonFX(1);
    m_Motor2 = new TalonFX(2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void outtake(double speed) {
    m_Motor1.set(speed);
    m_Motor2.set(speed);
  }

  public Command intake() {
    return runOnce(() -> m_Motor1.set(2));
  }
}
