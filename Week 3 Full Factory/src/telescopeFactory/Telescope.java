package telescopeFactory;

import coordinates.SkyCoordinates;

public interface Telescope {

		public void setCoordinates(SkyCoordinates coordinates);
		public String showView(); //in real application returns an image		
}
