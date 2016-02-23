/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WirelessDoorSensor implements IDoorSensor {

	public WirelessDoorSensor() {
		// TODO Auto-generated constructor stub
		System.out.println("Wireless Door Sensor Created");

	}
	
	/* (non-Javadoc)
	 * @see abstractFactory.IDoorSensor#detect()
	 */
	@Override
	public void detect() {
		// TODO Auto-generated method stub
		System.out.println("This is a Wireless Door Sensor");

	}

}
