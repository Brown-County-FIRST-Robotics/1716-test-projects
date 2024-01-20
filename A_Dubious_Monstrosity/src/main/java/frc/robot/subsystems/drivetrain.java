package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.MecanumDrive;


public class drivetrain extends SubsystemBase {
 
	private final CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushless);
	private final CANSparkMax motor2 = new CANSparkMax(0, MotorType.kBrushless);
	private final CANSparkMax motor3 = new CANSparkMax(0, MotorType.kBrushless);
	private final CANSparkMax motor4 = new CANSparkMax(0, MotorType.kBrushless); 
	private final MecanumDrive mecanumdrivetrain;
	
	public drivetrain() {

		motor1.setInverted(false);
		motor2.setInverted(true);
		motor3.setInverted(false);
		motor4.setInverted(true);
		
		mecanumdrivetrain = new MecanumDrive(motor1, motor3, motor2, motor4);
	}

	public void drive(double x,double y,double z) 
	{
		mecanumdrivetrain.driveCartesianIK(x, y, z);

	}
}
