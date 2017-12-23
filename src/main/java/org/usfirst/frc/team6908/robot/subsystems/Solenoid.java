package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Solenoid
{
	public static void toggle(DoubleSolenoid piston)
	{
		if(piston.get() == DoubleSolenoid.Value.kForward)
		{
			piston.set(DoubleSolenoid.Value.kReverse);
		}
		else
		{
			piston.set(DoubleSolenoid.Value.kForward);
		}
	}
	
}