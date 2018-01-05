package org.usfirst.frc.team6908.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

import org.usfirst.frc.team6908.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	public Joystick TankDriveControl1; //new joystick object
	public Joystick TankDriveControl2; //new joystick object
	public XboxController  xbox;
	
	public Button moveArm; //New button object
	
	public OI(){
		xbox = new XboxController(0);
		TankDriveControl1 = new Joystick(0); //Connects joystick object to port 1
		TankDriveControl2 = new Joystick(1); //Connects joystick object to port 2
		
		moveArm = new JoystickButton(xbox, 0);
		moveArm = new JoystickButton(TankDriveControl1, 0); //binds button object to port 0 on tankdrive1
		//The port # should be changed based on the layout of the joystick once we have that info
		
		moveArm.whenPressed(new MoveArm()); //binds button to run MoveArm when pressed
	}
	//use TankDriveControl1 for leftHandSide
	//use TankDriveControl2 for rightHandSide
}
