



package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.DoubleSupplier;



public class DriveCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivetrain drivetrain;
  private DoubleSupplier Rx;
  private DoubleSupplier Y;
  private DoubleSupplier Lx;

  public DriveCommand(Drivetrain subsystem, DoubleSupplier Rsx, DoubleSupplier Rsy, DoubleSupplier Lsx) {
    drivetrain = subsystem;

    Rx = Rsx;
    Y = Rsy;
    Lx = Lsx;
    
    addRequirements(subsystem);
  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {

  drivetrain.drive(Rx.getAsDouble(), Y.getAsDouble(), Lx.getAsDouble());

  }

  
  @Override
  public void end(boolean interrupted) {}


}
