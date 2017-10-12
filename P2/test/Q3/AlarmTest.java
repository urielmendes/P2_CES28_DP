package Q3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import Q3.TireMonitor.Alarm;
import Q3.TireMonitor.Sensor;

public class AlarmTest {

	@InjectMocks private Alarm	alarm; 
	@Mock private Sensor sensor;
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void lowPressureTest() {
		Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16.5);
		
		alarm.check();
		
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void highPressureTest() {
		Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(23.2);
		
		alarm.check();
		
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void normalPressureTest() {
		Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(19.1);
		
		alarm.check();
		
		assertFalse(alarm.isAlarmOn());
	}
	
}
