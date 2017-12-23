package org.usfirst.frc.team6908.robot.subsystems;

import org.usfirst.frc.team6908.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Arms {
	static DoubleSolenoid left;
	static DoubleSolenoid right;
	public Arms(DoubleSolenoid Left, DoubleSolenoid Right){
		left = Left;
		right = Right;
	}
	
	public void toggle()
	{
		if ((left.get() == DoubleSolenoid.Value.kForward) && (right.get() == DoubleSolenoid.Value.kForward))
		{
			left.set(DoubleSolenoid.Value.kReverse);  
			right.set(DoubleSolenoid.Value.kReverse);
		}
		else 
		{
			left.set(DoubleSolenoid.Value.kForward);
			right.set(DoubleSolenoid.Value.kForward);
		}
	}
	
	public void open()
	{
		left.set(DoubleSolenoid.Value.kReverse);  
		right.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void close()
	{
		left.set(DoubleSolenoid.Value.kForward);  
		right.set(DoubleSolenoid.Value.kForward);
	}
	
	public void armMotors()
	    {
	    	//Arm motors
	    	
	    	//Assign xbox values to variables
	    	
			Robot.leftThumb = (Robot.joy.getRawAxis(1));
	    	Robot.rightThumb = (Robot.joy.getRawAxis(4));
	    	
	    	Robot.deadZ = 0.17;
	    	
	    	//If left thumbstick is still

	    	if((Robot.leftThumb>-Robot.deadZ) && (Robot.leftThumb<Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(-(Robot.rightThumb));

	    		Robot.talArmRight.set(-(Robot.rightThumb));
	    	}

	    	//If right thumbstick is still

	    	if((Robot.rightThumb>-Robot.deadZ) && (Robot.rightThumb<Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(Robot.leftThumb);

	    		Robot.talArmRight.set(-Robot.leftThumb);
	    	}

	    	//If left thumbstick is positive and right thumbstick is positive

	    	if((Robot.leftThumb>Robot.deadZ) && (Robot.rightThumb>Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(Robot.leftThumb - (Robot.rightThumb * 0.9));

	    		Robot.talArmRight.set(-(Robot.leftThumb));
	    	}

	    	//If left thumbstick is positive and right thumbstick is negative

	    	if((Robot.leftThumb>Robot.deadZ) && (Robot.rightThumb<-Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(Robot.leftThumb);

	    		Robot.talArmRight.set(-(Robot.leftThumb + (Robot.rightThumb * 0.9)));
	    	}

	    	//If left thumbstick is negative and right thumbstick is positive

	    	if((Robot.leftThumb<-Robot.deadZ) && (Robot.rightThumb>Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(Robot.leftThumb + (Robot.rightThumb * 0.9));

	    		Robot.talArmRight.set(-(Robot.leftThumb));
	    	}

	    	//If left thumbstick is negative and right thumbstick is negative

	    	if((Robot.leftThumb<-Robot.deadZ) && (Robot.rightThumb<-Robot.deadZ)) 
	    	{
	    		Robot.talArmLeft.set(Robot.leftThumb);

	    		Robot.talArmRight.set(-(Robot.leftThumb - (Robot.rightThumb * 0.9))); 	
	    	}
	    }
}
