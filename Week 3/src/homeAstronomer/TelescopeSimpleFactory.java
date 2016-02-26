/**
 * 
 */
package homeAstronomer;

import homeAstronomer.AnySkyTelescope;
import homeAstronomer.Telescope;

/**
 * @author Adam
 *
 */
public class TelescopeSimpleFactory {

	public enum Type {
		ANYSKYTELESCOPE, ANYSKYPLUSTELESCOPE, ANYSUPERSKYTELESCOPE
	};

	/**
	 * @param anyskytelescope
	 */
	public Telescope create(Type type) {

		Telescope newTelescope;

		switch (type) {
		case ANYSKYTELESCOPE:
			return newTelescope = new AnySkyTelescope();
		case ANYSKYPLUSTELESCOPE:
			return newTelescope = new AnySkyPlusTelescope();
		case ANYSUPERSKYTELESCOPE:
			return newTelescope = new AnySuperSkyTelescope();
		default:
			return null;

		}

	}

}
