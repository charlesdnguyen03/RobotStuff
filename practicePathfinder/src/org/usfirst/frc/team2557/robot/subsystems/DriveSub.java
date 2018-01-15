package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveSub extends Subsystem {
	public void DriveMethod(double speed, double rotation) {
		while(RobotMap.Left2.getSensorCollection().getQuadraturePosition()<50){
			RobotMap.Drive.arcadeDrive(1, 0);
			SmartDashboard.putNumber("QuadPos", RobotMap.Left2.getSensorCollection().getQuadraturePosition());
		}
		RobotMap.Drive.arcadeDrive(0, 0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

