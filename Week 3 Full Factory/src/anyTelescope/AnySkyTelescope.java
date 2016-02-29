package anyTelescope;

import coordinates.SkyCoordinates;
import telescopeFactory.Telescope;



public class AnySkyTelescope implements Telescope {
	
	private SkyCoordinates coords;
	private String view;
		

	@Override
	public String showView() {
		//in real application this adjsuts the telescope to the requested coordinates and returns the image
		view = "AnySkyTelescope showing the view of coordinates: \n\t" + coords.toString();
		return view;
	}

	@Override
	public void setCoordinates(SkyCoordinates coordinates) {
		// TODO Auto-generated method stub
		coords=coordinates;		
	}

}
