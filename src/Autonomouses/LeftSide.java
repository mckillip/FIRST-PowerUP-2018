package Autonomouses;

import org.usfirst.frc.team293.robot.commands.AfterburnerHalfThrottle;
import org.usfirst.frc.team293.robot.commands.DriveStraightDistanceChristian;
import org.usfirst.frc.team293.robot.commands.DriveStraightTimeChristian;
import org.usfirst.frc.team293.robot.commands.DriveTurnGyroInPlace;
import org.usfirst.frc.team293.robot.commands.FeederRelease;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSide extends CommandGroup {

    public LeftSide(String choice) {
    	addSequential(new DriveStraightDistanceChristian(.5,50));
    	if (choice.charAt(0) == 'L'){
    		addSequential(new DriveStraightDistanceChristian(.5,13.5*12));
    		addSequential(new DriveTurnGyroInPlace(90,1));
    		addSequential(new DriveStraightTimeChristian(.5, 2));
    		//addSequential(new FeederSetAngle(2));
    		//addSequential(new FeederRelease());
    	} else if(choice.charAt(1) == 'L'){
    		addSequential(new DriveStraightDistanceChristian(.5,25*12));
    		addSequential(new DriveTurnGyroInPlace(-90,-1));
    		addSequential(new AfterburnerHalfThrottle(.7));
    		addSequential(new DriveStraightDistanceChristian(.3, 6));
    		addSequential(new FeederRelease(-1));
    	} else {
    		addSequential(new DriveStraightTimeChristian(.6, 4.5));
    	}
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
