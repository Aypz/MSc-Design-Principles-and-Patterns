/**
 * 
 */
package telescopeFactory;

import anyTelescope.AnySkyPlusTelescope;
import anyTelescope.AnySkyTelescope;
import anyTelescope.AnySuperSkyTelescope;

/**
 * @author Adam
 *
 */
public class AnyTelescopeFactory extends TelescopeFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * homeAstronomerFactory.TelescopeFactory#createTelescope(java.lang.String)
	 */
	@Override
	public Telescope createTelescope(String type) {
		if (type == "skyPlus") {
			return new AnySkyPlusTelescope();
		} else if (type == "sky") {
			return new AnySkyTelescope();
		} else if (type == "superSky") {
			return new AnySuperSkyTelescope();
		} else {
			return null;
		}
	}

}
