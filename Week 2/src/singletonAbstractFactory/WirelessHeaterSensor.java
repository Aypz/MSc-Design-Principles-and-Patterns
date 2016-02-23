/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WirelessHeaterSensor implements IHeaterSensor {
	
	public WirelessHeaterSensor() {
		// TODO Auto-generated constructor stub
		System.out.println("Wireless Heater Sensor Created");
	}
	
	/* (non-Javadoc)
	 * @see abstractFactory.IHeaterSensor#measure()
	 */
	@Override
	public void measure() {
		// TODO Auto-generated method stub
		System.out.println("This is a Wireless Heater Sensor");

	}

}
