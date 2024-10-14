// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class BoringSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public BoringSubsystem() {}

   private final CANSparkMax FL_SparkMax = new CANSparkMax(1, CANSparkLowLevel.MotorType.kBrushless);
   private final CANSparkMax FR_SparkMax = new CANSparkMax(2, CANSparkLowLevel.MotorType.kBrushless);
   private final CANSparkMax BL_SparkMax = new CANSparkMax(3, CANSparkLowLevel.MotorType.kBrushless);
   private final CANSparkMax BR_SparkMax = new CANSparkMax(4, CANSparkLowLevel.MotorType.kBrushless);

 
  

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
