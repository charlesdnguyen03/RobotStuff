/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2557.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static WPI_TalonSRX Left1;
	public static WPI_TalonSRX Left2;
	public static WPI_TalonSRX Right1;
	public static WPI_TalonSRX Right2;
	
	public static SpeedControllerGroup Left;
	public static SpeedControllerGroup Right;
	
	public static DifferentialDrive Drive;
	
	
	public static WPI_TalonSRX Intake;
	
	
	public static Servo Servo1;
	
	public static void init() {
		
		Left1 = new WPI_TalonSRX(7);
		Left2 = new  WPI_TalonSRX(6);
		Right1 = new  WPI_TalonSRX(8);
		Right2 = new  WPI_TalonSRX(5);
		
		Left = new SpeedControllerGroup(Left1, Left2);
		Right = new SpeedControllerGroup(Right1, Right2);
		
		Drive = new DifferentialDrive(Left, Right);
		
		
		Intake = new WPI_TalonSRX(4);
		Servo1 = new Servo(4);
	}
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
