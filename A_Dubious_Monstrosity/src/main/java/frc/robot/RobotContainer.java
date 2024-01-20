



package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
  
  private final drivetrain five = new drivetrain();

  
  private final CommandXboxController controller = new CommandXboxController(0);

  
  public RobotContainer() {
    
    configureBindings();
  }

  
  private void configureBindings() {
    
   

    
    
    
  }

 
   
}
