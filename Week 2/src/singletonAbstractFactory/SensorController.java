/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class SensorController {

	IDoorSensor ds;
	IHeaterSensor hs;

	public SensorController(ISensorFactory sf) {
		ds = sf.createDoorSensor();
		hs = sf.createHeaterSensor();
	}

	public void start() {
		ds.detect();
		hs.measure();
	}

}
