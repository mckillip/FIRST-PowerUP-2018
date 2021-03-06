package org.usfirst.frc.team293.robot.commands;

import org.usfirst.frc.team293.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AfterburnerHalfThrottle extends Command {
	double percentOut;
    public AfterburnerHalfThrottle(double power) {
    	percentOut = -1*power;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.afterBurner);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.afterBurner.move(percentOut);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.afterBurner.move(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.afterBurner.move(0);
    }
}
