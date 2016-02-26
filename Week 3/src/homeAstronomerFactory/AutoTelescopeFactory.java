/**
 * 
 */
package homeAstronomerFactory;

/**
 * @author Adam
 *
 */
public class AutoTelescopeFactory extends TelescopeFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * homeAstronomerFactory.TelescopeFactory#createTelescope(java.lang.String)
	 */
	@Override
	public Telescope createTelescope(String type) {
		if (type == "skyPlus") {
			return new AutoAnySkyPlusTelescope();
		} else if (type == "sky") {
			return new AutoAnySkyTelescope();
		} else if (type == "superSky") {
			return new AutoAnySuperSkyTelescope();
		} else {
			return null;
		}
	}

}
