

package frc.robot.commands;

import frc.robot.Constants.DriveConstants;
import frc.robot.subsystem.DriveSubsystem;
// import frc.robot.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveForwardCmd extends CommandBase {
    private final DriveSubsystem _driveSubsystem;
    private final double _distance;

    public DriveForwardCmd(DriveSubsystem driveSubsystem, double distanceMeters) {
        _driveSubsystem = driveSubsystem;
        _distance = driveSubsystem.getEncoderMeters() + distanceMeters;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        System.out.println("DriveForwardCmd started!");
    }

    @Override
    public void execute() {
       // System.out.println("DriveForwardCmd executing!");
       _driveSubsystem.setMotors(DriveConstants.kAutoDriveForwardSpeed, DriveConstants.kAutoDriveForwardSpeed);
    }

    @Override
    public void end(boolean interrupted) {
       // System.out.println("DriveForwardCmd ended!");
       _driveSubsystem.setMotors(0, 0);
        System.out.println("DriveForwardCmd ended!");
    }

    @Override
    public boolean isFinished() {
      //  System.out.println("DriveForwardCmd finished!");
        if (_driveSubsystem.getEncoderMeters() > _distance)
            return true;
        else
            return false;
    }
}
