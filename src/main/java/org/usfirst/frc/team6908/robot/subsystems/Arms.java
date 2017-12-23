package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Arms {
	static DoubleSolenoid left;
	static DoubleSolenoid right;
	
	public Arms(DoubleSolenoid Left, DoubleSolenoid Right){ //constructor for Arms
		left = Left;
		right = Right;
	}
}
