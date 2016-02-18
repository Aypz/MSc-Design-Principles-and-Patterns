/**
 * 
 */
package abstractFactory;

/**
 * @author Adam
 *
 */
public class WirelessSensorFactory implements ISensorFactory {

	private void WirelessSensorFactory() {
		System.out
				.printf("%nWireless Sensor	Factory %n=======================");
	}

	
	
	@Override
	public IDoorSensor createDoorSensor() {
		return new WirelessDoorSensor();
	}



	@Override
	public IHeaterSensor createHeaterSensor() {
		return new WirelessHeaterSensor();
	}

}
