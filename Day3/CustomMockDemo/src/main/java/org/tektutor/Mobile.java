package org.tektutor;

public class Mobile {
	private ICamera camera;

	public Mobile( ICamera camera ) {
		this.camera = camera;
	}

	public boolean powerOn() {
		
		camera.ON();
		return true;
	}

}
