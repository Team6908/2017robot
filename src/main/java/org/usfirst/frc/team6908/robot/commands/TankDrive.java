package org.usfirst.frc.team6908.robot.commands;

import org.usfirst.frc.team6908.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6908.robot.subsystems.DriveTrain;

public class TankDrive extends Command  {
	
	public TankDrive() {
		//put dependencies of the subsystem here
		requires(Robot.drivetrain); //requires the drivetrain object instantiated in Robot.java
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		double leftSideSpeed = Robot.oi.TankDriveControl1.getY();
		double rightSideSpeed = Robot.oi.TankDriveControl2.getY();
		
		Robot.drivetrain.Drive(leftSideSpeed, rightSideSpeed); 
		
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
	
	
	

	

}
