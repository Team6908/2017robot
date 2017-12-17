package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem; //import to extend the subsystem class
import org.usfirst.frc.team6908.robot.RobotMap;


public class DriveTrain extends Subsystem {
	
	public RobotDrive robotdrive = new RobotDrive(RobotMap.frontLeft, RobotMap.frontRight); // RobotDrive with 2 motors specified as SpeedController object

	@Override
	protected void initDefaultCommand() { // Every subsystem has a initDefaultCommand 
		// TODO Auto-generated method stub
		
		
	}

}
