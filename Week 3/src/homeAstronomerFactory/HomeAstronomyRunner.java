package homeAstronomerFactory;

import homeAstronomerFactory.SkyCoordinates;
import homeAstronomerFactory.Telescope;

public class HomeAstronomyRunner {

	public static void main(String[] args) {
		/**
		 * Exercise 4.2 String type = "normal"; Telescope newTelescope;
		 * 
		 * 
		 * 
		 * SkyCoordinates sc = new SkyCoordinates(2.0, 1.6, 7.5);
		 * 
		 * 
		 * 
		 * HomeAstronomer mySystem = new HomeAstronomer();
		 * 
		 * if (type.equals("normal")) { newTelescope = new AnySkyTelescope();
		 * newTelescope.setCoordinates(sc);
		 * System.out.println(newTelescope.showView()); } else if
		 * (type.equals("plus")) { newTelescope = new AnySkyPlusTelescope();
		 * newTelescope.setCoordinates(sc);
		 * System.out.println(newTelescope.showView()); }
		 **/

		AutoTelescopeFactory autoTelescopeFactory = new AutoTelescopeFactory();
		HomeAstronomer mySystem = new HomeAstronomer();
		Telescope telescope;

		// test case 1
		telescope = autoTelescopeFactory.createTelescope("sky");
		SkyCoordinates coords = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 2
		telescope = autoTelescopeFactory.createTelescope("skyPlus");
		coords = new SkyCoordinates(90.3, 54.2, 120);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		// test case 3
		telescope = autoTelescopeFactory.createTelescope("superSky");
		coords = new SkyCoordinates(33.3, 66.6, 170.5);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

	}
}
