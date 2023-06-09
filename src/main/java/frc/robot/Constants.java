package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    /**
     * The ideal voltage that the motors should attempt to match.
     */
    //
    public static final double NOMINAL_VOLTAGE = 12;
    public static final int MAX_CURRENT = 80;
    public static final double DEAD_BAND = .5;
    public static final int Pigeon2ID = 4;
    public static final int XBOX_DRIVER_CONTROLLER_PORT = 0;
    public static final int XBOX_OPERATOR_CONTROLLER_PORT = 1;
    public static double UPDATE_PERIOD = 0.010; // seconds


    
    public static final class DriveConstants {
        // MOTORS
        public static final int DRIVES_RIGHT_MOTOR_1 = 25;
        public static final int DRIVES_RIGHT_MOTOR_2 = 27;
        public static final int DRIVES_LEFT_MOTOR_1 = 24;
        public static final int DRIVES_LEFT_MOTOR_2 = 26;

        public static final double MAX_DRIVE_SPEED = 0.5; //1
        public static final double MAX_LEFT_TRIGGER_SPEED = 0.25;
        public static final double MAX_RIGHT_TRIGGER_SPEED = 1; //.1
        public static final double kTurnFriction = 0.3;

        public static final int kEncoderCPR = 1024;
        public static final double kGearRatio = 10.71;// 10.75; // 8.45;// 10.71;
        public static final double kWheelDiameterInches = 6;
        public static final double kWheelDiameterMeters = Units.inchesToMeters(kWheelDiameterInches);
        public static final double kEncoderDistanceConversionFactor = ((Math.PI * kWheelDiameterMeters) / (kGearRatio));
        public static double kTrackWidthMeters = 0.86;// 0.66; // m

        public static final double kStabilizationP = 1;
        public static final double kStabilizationI = 0.5;
        public static final double kStabilizationD = 0;

        // velocity PID (for closed loop, profiling, and trajectory)
        public static int DRIVE_VEL_SLOT = 0;
        public static double DRIVE_VEL_LEFT_P = 0.25;
        public static double DRIVE_VEL_LEFT_F = 0.25;
        public static double DRIVE_VEL_RIGHT_P = 0.25;
        public static double DRIVE_VEL_RIGHT_F = 0.25;

        // linear position PID
        public static double[] DRIVE_DIST_PID = { 3.50, 0.0, 0.0 };
        public static double DRIVE_DIST_ANGLE_P = 0.1;
        public static double DRIVE_DIST_TOLERANCE = 0.01;
        public static double DRIVE_DIST_MAX_OUTPUT = 0.6;

          // angular position PID works for test bot
          public static double[] DRIVE_ANGLE_PID = { 0.075, 0.005, 0.005 };
          public static double DRIVE_ANGLE_TOLERANCE = 0.5;
          public static double DRIVE_ANGLE_MAX_OUTPUT = 0.5;

          // closed loop driving
        public static double DRIVE_CLOSED_MAX_VEL = 4.0; // m/s
        public static double DRIVE_CLOSED_MAX_ROT_TELEOP = 360.00; //
        public static double DRIVE_CLOSED_MAX_ROT_AUTO = 100.0; // deg/s
        public static double DRIVE_CLOSED_MAX_ACC = 1.5; // m/s^2

        public static final double kTurnP = .00422125;
        public static final double kTurnI = 0;
        public static final double kTurnD = 0;

        public static final double kMaxTurnRateDegPerS = 100;
        public static final double kMaxTurnAccelerationDegPerSSquared = 300;

        public static final double kTurnToleranceDeg = 5;
        public static final double kTurnRateToleranceDegPerS = 5; // degrees per second

        public static final double kAutoDriveForwardSpeed = 0.15;

        public static final double ENCODER_MULTIPLIER = 1.105;

        public static final double kEncoderTick2Meter = 1.0 / 4096.0 * 0.1 * Math.PI;

        public static final double ksVolts = 0.198; // 0.169
        public static final double kvVoltSecondsPerMeter = 2.86; // 2.24
        public static final double kaVoltSecondsSquaredPerMeter = 0.365; // 0.0435
        public static final double kPDriveVel = 2.24; // 2.4

        public static final boolean kGyroReversed = false;

        public static final int EndGameSeconds = 30;
        public static final int StopRumble = 28;
        public static final double kRelTurnP = .001;
        public static final double kRelTurnI = 0;
        public static final double kRelTurnD = 0;
        public static final double kRelTurnFriction = 0.8;

        public static final double kMaxRelTurnRateDegPerS = 20;
        public static final double kMaxRelTurnAccelerationDegPerSSquared = 300;

        public static final double kRelTurnToleranceDeg = 1;
        public static final double kRelTurnRateToleranceDegPerS = 3; // degrees per second

        public static final boolean BRAKE_ON_DISABLE = false;
    }

    public static final class AcquisitionConstants {
        public static final int X_MOTOR = 7;
        public static final int Y_MOTOR = 11;

        public static final int COMPRESSOR = 0;
        public static final int SOLENOID = 0;

        public static final int X_LIMIT = 9;
        public static final int Y_LIMIT = 8;

        public static final int X_ENCODER_A = 23;
        public static final int X_ENCODER_B = 22;

        public static  double X_MOTOR_P = 0.3;
        public static  double X_MOTOR_I = 0.3;
        public static  double X_MOTOR_D = 0;

        public static  double Y_MOTOR_P = 0.8;
        public static  double Y_MOTOR_I = 0.2;
        public static  double Y_MOTOR_D = 0;

        public static  double X_MAX = 1.47;
        public static  double Y_MAX = 1.08;
        public static final double POSITION_EPSILON_METERS = 0.01;

        public static final double RETURN_HOME_POWER = 1;
        public static final double X_TENSION_POWER = 0.2;

        public static  double X_MAX_MOTOR_POWER = 0.9;
        public static  double Y_MAX_MOTOR_POWER = 0.6; //Elevations power
        public static  double X_FEEDFORWARD = 0.12;
        public static  double Y_FEEDFORWARD = 0.03;

        public static final double X_METERS_PER_PULSE = 0.7 / 436.5;
        public static final double Y_METERS_PER_PULSE = 0.6 / 21.38085174560547;

        public static final double MANUAL_DEADBAND = 0.1;
    }

    /**
     * All values are in meters.
     */
    public static final class FieldConstants {
        private static final double computeXOffset(double distance) {
            return distance + EXTENSION_FRONT + X_OFFSET;
        }

        private static final double computeYOffset(double height) {
            return height - REACH_HEIGHT + Y_OFFSET;
        }

        private static final double SHELF_HEIGHT = 0.9;
        private static final double SHELF_DISTANCE = 0.165;

        private static final double HIGH_CONE_HEIGHT = 1.17;
        private static final double HIGH_CONE_DISTANCE = 1.01;

        private static final double MID_CONE_HEIGHT = 0.87;
        private static final double MID_CONE_DISTANCE = 0.58;

        private static final double HIGH_CUBE_HEIGHT = 1.1;
        private static final double HIGH_CUBE_DISTANCE = 1.5;

        private static final double MID_CUBE_HEIGHT = 0.65;
        private static final double MID_CUBE_DISTANCE = 0.58;

        /**
         * The distance from the floor to the center of the grabber at elevations' lowest position.
         */
        private static final double REACH_HEIGHT = 0.34;
        /**
         * The distance from the minimum extension of reach to the front of the robot.
         */
        private static final double EXTENSION_FRONT = 0;

        /**
         * The distance added to all y values.
         */
        private static final double Y_OFFSET = 0.22;
        /**
         * The distance added to all x values.
         */
        private static final double X_OFFSET = 0.33;

        public static final double SHELF_Y = computeYOffset(SHELF_HEIGHT);
        public static final double SHELF_X = computeXOffset(SHELF_DISTANCE);

        public static final double HIGH_CONE_Y = computeYOffset(HIGH_CONE_HEIGHT);
        public static final double HIGH_CONE_X = computeXOffset(HIGH_CONE_DISTANCE);

        public static final double MID_CONE_Y = computeYOffset(MID_CONE_HEIGHT);
        public static final double MID_CONE_X = computeXOffset(MID_CONE_DISTANCE);

        public static final double HIGH_CUBE_Y = computeYOffset(HIGH_CUBE_HEIGHT);
        public static final double HIGH_CUBE_X = computeXOffset(HIGH_CUBE_DISTANCE);

        public static final double MID_CUBE_Y = computeYOffset(MID_CUBE_HEIGHT);
        public static final double MID_CUBE_X = computeXOffset(MID_CUBE_DISTANCE);
    }

    public static final class LimelightConstants {
        public static final boolean USE_FOR_TARGETING = true;
        public static final boolean LED_ON_DEFAULT = false;
        public static final double CAMERA_MIN_FLOOR_HEIGHT = 0;
        public static final double CAMERA_INITIAL_PITCH = 0;
    }

    public static final class ChooserOptions{
        static final String kAutoShort = "Short";
        static final String kAutoLong = "Long";
        static final String kDriveMeasure = "Drive Measure";
        static final String kScoreCommunity = "Score and Leave Community";
        static final String kDoNothing = "";
    }

    public static final class AutoConstants {

        public static final int kPitchTimeoutSeconds = 5;

        public static final class BalanceAuto {
            public static final double DRIVE_SPEED = 0.75; 
            public static final double FINAL_ANGLE = 10;
            public static final double TIMEOUT_SECONDS = 4.5;

            public static final boolean REVERSED = false;
            public static final double SPEED_TO_CLOSER_CENTER = 0.6;
            public static final double DISTANCE_TO_CLOSER_CENTER = 0.4;
            public static final double GET_CLOSER_TO_CENTER_TIMEOUT = 2;

            public static final double MAX_SPEED = 0.4;


            public static final double KP = 0.029;
            public static final double KI = 0;
            public static final double KD = 0.003;

            public static final double POSITION_TOLERANCE = 1.5;
            public static final double VELOCITY_TOLERANCE = 0.2;
        }
    }
}