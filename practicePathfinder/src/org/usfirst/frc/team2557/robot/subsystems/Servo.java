package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.ServoCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Servo extends Subsystem {
	
	public void ServoMethod() {
		if (OI.Button1.get()) {
			RobotMap.Servo1.setAngle(90);
//			System.out.println(OI.Button1.get());
		}
		else {
			RobotMap.Servo1.setAngle(0);
		}
	}

    // Put methods for controlling this sub0system
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new ServoCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

