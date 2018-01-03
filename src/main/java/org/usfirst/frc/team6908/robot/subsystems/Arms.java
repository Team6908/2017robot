package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem{
	public static Victor armMotor;	
	
	public static void moveArm(double speed) {
		armMotor.set(speed);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
