package org.openaudible;


public class AudibleAccountPrefs {
	public String audibleUser = "";
	public String audiblePassword = "";
	public AudibleRegion audibleRegion = AudibleRegion.US;
	public int quality = 6;
	public AudibleRegion getRegion() {
		return audibleRegion;
	}
}

