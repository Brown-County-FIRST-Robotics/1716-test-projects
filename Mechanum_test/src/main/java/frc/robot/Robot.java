// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  CANSparkMax motor0;
  CANSparkMax motor1;
  CANSparkMax motor2;
  CANSparkMax frontRightMotor;
  MecanumDrive drive;
  XboxController controller;
  double max_speed = 0.3;

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro

   */
  @Override
  public void autonomousInit() {
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    }
  

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    motor0 = new CANSparkMax(1, MotorType.kBrushless);
    motor1 = new CANSparkMax(2, MotorType.kBrushless);
    motor2 = new CANSparkMax(3, MotorType.kBrushless);
    motor3 = new CANSparkMax(4, MotorType.kBrushed);
    motor0.setInverted(true);
    motor1.setInverted(true);
    motor0.setInverted(false);
    motor0.setInverted(false);

    drive = new MecanumDrive(motor0, motor1, motor2, motor3);
    controller = new XboxController(0);
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    
    drive.driveCartesian(-controller.getLeftY() * max_speed, controller.getLeftX() * max_speed, (controller.getRightTriggerAxis() - controller.getLeftTriggerAxis()) * max_speed);
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
