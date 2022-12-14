package frc.robot.Subsystems;

import javax.lang.model.element.Element;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.Framework.Subsystem;
import frc.robot.Framework.IO.In.In;
import frc.robot.Framework.IO.Out.Out;

public class Shooter implements Subsystem{
    private In input = new In(SubsystemID.SHOOTER);
    private Out output = new Out(SubsystemID.SHOOTER);

    public void robotInit(){
        System.out.println("Shooter init");
    }

    public void robotPeriodic(){

    }

    public void autonomousInit(){
        
    }
    public void autonomousPeriodic(){
        
    }

    public void teleopInit(){

    }

    public void teleopPeriodic(){
        output.motors.setMotor("FLY_WHEEL", input.getAxis("SHOOT", "OPERATOR") * -1);
        output.motors.setMotor("TURRET_ANGLE", input.getAxis("TURRET_AIM", "OPERATOR") * -1);

        

        // if(input.getButton("LOAD_BALL", "OPERATOR")){
        //     output.servos.setServo("BALL_STOP", 0);
        //     System.out.println("button press");
        // }else{
        //     output.servos.setServo("BALL_STOP", 1);
        // }

    }
}