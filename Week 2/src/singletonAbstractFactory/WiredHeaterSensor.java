/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WiredHeaterSensor implements IHeaterSensor {

	public WiredHeaterSensor() {
		// TODO Auto-generated constructor stub
		System.out.println("Wired Heater Sensor Created");
	}
	
	/* (non-Javadoc)
	 * @see abstractFactory.IHeaterSensor#measure()
	 */
	@Override
	public void measure() {
		// TODO Auto-generated method stub
		System.out.println("This is a Wired Heater Sensor");
	}

}
