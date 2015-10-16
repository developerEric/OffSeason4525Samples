package org.usfirst.frc.team4525.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// SYSTEM CONTROL SETTINGS ------------------>
	// DRIVE SETTINGS
	
	public final static int driveForwardBackward = XboxController.Axis.LeftY.get();
	public final static int driveLeftRight = XboxController.Axis.RightX.get();
	
	// Xbox Controller Sensitivity
	public final static double controllerDeadband = 0.05,
					robotRotationDeadband = 0.025;
	
	// Speed Settings
	public final static double rotationSpeedMax = 0.75;
	public final static double notSprintSpeedCap = 0.8;
	
	// Controls Inverted
	public final static boolean controlsInvertXY = true;
	
	// PWM to RIO ------------------>
	// Motors
	public final static int motor_left1 = 0,
				motor_left2 = 1,
				motor_right1 = 2,
				motor_right2 = 3;
	
	// ANALOG TO RIO ------------------>
	// Gyro
	public final int gyroIn = 0;
	
	// DIGITAL INPUT OUTPUT TO RIO ------------------>
	// Encoders
	public final int encoderSignalA = 0,
				encoderSignalB = 1;
}
