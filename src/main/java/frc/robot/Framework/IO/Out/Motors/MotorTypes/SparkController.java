package frc.robot.Framework.IO.Out.Motors.MotorTypes;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Framework.IO.Out.Motors.MotorBase;
import frc.robot.Framework.Util.CommandMode;

public class SparkController implements MotorBase {
    private Spark controller;

    public SparkController(int port) {
        controller = new Spark(port);
    }

    public void set(double speed) {
        controller.set(speed);
    };

    public void setInverted(boolean invert) {
        controller.setInverted(invert);
    }

    @Override
    public void set(double setpoint, CommandMode mode) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPID(double kP, double kI, double kD, double kF) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setVoltage(double voltage) {
        // TODO Auto-generated method stub
        
    }
}