/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WiredDoorSensor implements IDoorSensor {

	public WiredDoorSensor() {
		// TODO Auto-generated constructor stub
		System.out.println("Wired Door Sensor Created");
	}

	/* (non-Javadoc)
	 * @see abstractFactory.IDoorSensor#detect()
	 */
	@Override
	public void detect() {
		// TODO Auto-generated method stub
		System.out.println("This is a Wired Door Sensor");
	}

}
