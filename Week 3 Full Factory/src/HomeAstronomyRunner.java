

import astronomer.HomeAstronomer;
import telescopeFactory.AnyTelescopeFactory;
import telescopeFactory.AutoTelescopeFactory;
import telescopeFactory.TelescopeFactory;
import coordinates.SkyCoordinates;
import telescopeFactory.Telescope;

public class HomeAstronomyRunner {

	public static void main(String[] args) {
		TelescopeFactory autoTelescopeFactory = new AutoTelescopeFactory();
		TelescopeFactory anyTelescopeFactory = new AnyTelescopeFactory();

		HomeAstronomer mySystem = new HomeAstronomer();
		Telescope telescope;

		// test case 1
		telescope = anyTelescopeFactory.createTelescope("sky");
		SkyCoordinates coords = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 2
		telescope = anyTelescopeFactory.createTelescope("skyPlus");
		coords = new SkyCoordinates(90.3, 54.2, 120);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 3
		telescope = anyTelescopeFactory.createTelescope("superSky");
		coords = new SkyCoordinates(33.3, 66.6, 170.5);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);
		
		// test case 4
		telescope = autoTelescopeFactory.createTelescope("sky");
		coords = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 5
		telescope = autoTelescopeFactory.createTelescope("skyPlus");
		coords = new SkyCoordinates(90.3, 54.2, 120);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 6
		telescope = autoTelescopeFactory.createTelescope("superSky");
		coords = new SkyCoordinates(33.3, 66.6, 170.5);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

	}
}
