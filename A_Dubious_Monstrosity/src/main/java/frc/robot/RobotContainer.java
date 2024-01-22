



package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
  
  private final Drivetrain five = new Drivetrain();

  
  private final CommandXboxController controller = new CommandXboxController(0);

  
  public RobotContainer() {

   five.setDefaultCommand(new DriveCommand(five, controller::getRightX , controller::getLeftX , controller::getLeftY));    
   
    configureBindings();
  }

  
  private void configureBindings() {
    
   

    
    
    
  }

 
   
}
