package frc.robot.commands.Drive;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.DriveSubsystem;

public class DriveTimed extends CommandBase {
  private final DriveSubsystem m_drive;
  

  /**
   * Creates a new DriveToWall.
   */
  public DriveTimed(DriveSubsystem subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drive = subsystem;

    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drive.arcadeDrive(-0.4,0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  
  /** 
   * @param interrupted
   */
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drive.arcadeDrive(0,0);

  }

  
  /** 
   * @return boolean
   */
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
     return false;
  }
}
