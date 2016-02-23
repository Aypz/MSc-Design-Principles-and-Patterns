/**
 * 
 */
package singletonAbstractFactory;

/**
 * @author Adam
 *
 */
public class WirelessSensorFactory implements ISensorFactory {

	private volatile static WirelessSensorFactory uniqueInstance;

	private void WirelessSensorFactory() {
		System.out
				.printf("%nWireless Sensor	Factory %n=======================");
	}

	public static WirelessSensorFactory getInstance() {
		if (uniqueInstance == null) {
			synchronized (WirelessSensorFactory.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new WirelessSensorFactory();
				}
			}
		}
		return uniqueInstance;
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
