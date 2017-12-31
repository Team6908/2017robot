package org.usfirst.frc.team6908.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Solenoid extends Subsystem
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

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}	