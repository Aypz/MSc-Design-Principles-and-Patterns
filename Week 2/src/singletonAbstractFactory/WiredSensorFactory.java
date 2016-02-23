/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WiredSensorFactory implements ISensorFactory {

	private void WiredSensorFactor(){
		System.out.printf("%nWIRED	Sensor	Factory %n=======================");
	}

	@Override
	public IDoorSensor createDoorSensor() {
		// TODO Auto-generated method stub
		return new WiredDoorSensor();
	}

	@Override
	public IHeaterSensor createHeaterSensor() {
		// TODO Auto-generated method stub
		return new WiredHeaterSensor();
	}

}
