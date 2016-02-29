package astronomer;

import telescopeFactory.Telescope;

public class HomeAstronomer {

	public void start(Telescope localTelescope) {

		System.out.println(localTelescope.showView());
	}
}