package frc.robot.Framework.IO.Out.Sensors.SensorTypes.DigitalIn;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

public class Digital_In implements DigitalInBase{
    private DigitalInput m_input;
    public Digital_In(Integer port){
        m_input = new DigitalInput(port); 
    }
    public Boolean getDigitalIn() {
        return m_input.get();
    }
    

}
