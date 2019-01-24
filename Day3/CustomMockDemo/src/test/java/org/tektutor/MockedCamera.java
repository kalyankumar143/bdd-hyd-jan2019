package org.tektutor;

public class MockedCamera implements ICamera {

	private int onMethodCallCount = 0;

	public boolean ON() {
		System.out.println ("Mocked Camera ON method invoked ...");
		++onMethodCallCount;
		return false;
	}

	public int getOnMethodCallCount() {
		return onMethodCallCount;
	}

}
