// package frc.robot.commands;

// import frc.robot.sendables.PigeonStateSendable;

// // import frc.subsystem.ReportingSubsystem;

// import java.util.ArrayList;
// import java.util.List;

// import com.ctre.phoenix.sensors.WPI_Pigeon2;

// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj2.command.CommandBase;

// /** An example command that uses an example subsystem. */
// public class ReportingCommand extends CommandBase {
//   private List<WPI_Pigeon2> m_pigeons = new ArrayList<WPI_Pigeon2>();
//   private List<PigeonStateSendable> m_pigeonSendables = new ArrayList<PigeonStateSendable>();

//   /**
//    * Creates a new ExampleCommand.
//    *
//    * @param pigeon2subsystem The subsystem used by this command.
//    */
//   public ReportingCommand( WPI_Pigeon2 ... pigeonsubsystem) {
//     for(WPI_Pigeon2 system : pigeonsubsystem) {
//       m_pigeons.add(system);
//       // m_pigeonSendables.add(new PigeonStateSendable(system));
//       // addRequirements(system);
//     }
//     // Use addRequirements() here to declare subsystem dependencies.
//    // addRequirements(reportSubsystem);
//   }

//   @Override
//   public boolean runsWhenDisabled() {
//     return true;
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     /* Send Pigeon updates to the dashboard */
//     int iteration = 0;
//     for(PigeonStateSendable sendable : m_pigeonSendables){
//       SmartDashboard.putData("Pigeon " + iteration++, sendable);
//     }
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }