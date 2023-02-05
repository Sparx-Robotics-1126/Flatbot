
package frc.robot.commands;

import frc.robot.Constants.DriveConstants;
import frc.robot.subsystem.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveForwardCmd extends CommandBase {
    private final DriveSubsystem _driveSubsystem;
    // private final double _distance;

    private static final double DISTANCE_kP = 0.03;
    private static final double DISTANCE_DEADBAND = 1; // 2 inches.

    private final double TARGET_DISTANCE;

    // private final double REQUESTED_SPEED;

    public DriveForwardCmd(DriveSubsystem driveSubsystem, double distance) {

        _driveSubsystem = driveSubsystem;

        TARGET_DISTANCE = _driveSubsystem.getAverageEncoderDistance() + distance;
        // _distance = driveSubsystem.getEncoderMeters() + distanceMeters;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        // System.out.println("DriveForwardCmd started!");
    }

    @Override
    public void execute() {

        double distanceError = TARGET_DISTANCE - _driveSubsystem.getAverageEncoderDistance();

        double leftSpeed, rightSpeed;

        leftSpeed = rightSpeed = distanceError * DISTANCE_kP * DriveConstants.kAutoDriveForwardSpeed;

        if (leftSpeed > -1) {
            leftSpeed = -1;
            rightSpeed = -1;
        }

        if (_driveSubsystem.getAverageEncoderDistance() > TARGET_DISTANCE - DISTANCE_DEADBAND) {
            _driveSubsystem.tankDrive(0, 0);
            end(true);
        }

        _driveSubsystem.tankDrive(leftSpeed, rightSpeed);
        // return new DrivesOutput(0, 0, true);

        // return new DrivesOutput(leftSpeed, rightSpeed);

        // // System.out.println("DriveForwardCmd executing!");
        // _driveSubsystem.setMotors(DriveConstants.kAutoDriveForwardSpeed,
        // DriveConstants.kAutoDriveForwardSpeed);
    }

    // @Override
    // public void end(boolean interrupted) {
    //     // System.out.println("DriveForwardCmd ended!");
    //     _driveSubsystem.tankDrive(0, 0);
    //     System.out.println("DriveForwardCmd ended!");
    // }

    // @Override
    // public boolean isFinished() {
    // // System.out.println("DriveForwardCmd finished!");
    // if (_driveSubsystem.getEncoderMeters() > _distance)
    // return true;
    // else
    // return false;
    // }
}
