package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem; //import to extend the subsystem class
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team6908.robot.RobotMap;


public class DriveTrain extends Subsystem {
	
	public RobotDrive robotdrive = new RobotDrive(RobotMap.frontLeft, RobotMap.frontRight); // RobotDrive with 2 motors specified as SpeedController object

	
	protected void initDefaultCommand() { // Every subsystem has a initDefaultCommand 
		// TODO Auto-generated method stub
		LiveWindow.addActuator("Drive Motors", "frontRight", RobotMap.frontRight);//adds the actuator to the LiveWindow display
		LiveWindow.addActuator("Drive Motors", "frontLeft", RobotMap.frontLeft);
		LiveWindow.addActuator("Drive Motors", "backRight", RobotMap.backRight);
		LiveWindow.addActuator("Drive Motors", "backLeft", RobotMap.backLeft);
		
	}
	public void Drive(double speedLeft, double speedRight) {
		RobotMap.frontRight.set(speedRight);
		RobotMap.backRight.set(speedRight);
		RobotMap.frontLeft.set(speedLeft);
		RobotMap.backLeft.set(speedLeft); 	
	}

}
