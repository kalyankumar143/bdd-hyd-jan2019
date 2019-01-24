package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



public class MobileTest {
	
	@Test
	public void testPowerOnWhenCameraONWorksNormally() {

		//MockedCamera mockedCamera = new MockedCamera();	
		//Mocking
		ICamera mockedCamera = mock ( ICamera.class );
		Mobile mobile = new Mobile(mockedCamera);

		//Stubbing - hard coding the response of mocked object method
		when ( mockedCamera.ON() ).thenReturn ( true );
		
		boolean actualResponse = mobile.powerOn();
		boolean expectedResponse = true;

		assertEquals ( expectedResponse, actualResponse );

		//int actualCount = mockedCamera.getOnMethodCallCount();
		//assertEquals ( 1 ,actualCount);
		//
		verify ( mockedCamera, times(1 )).ON();

		
	
	}

}
