package Q3.TireMonitor;


public class Alarm
{
	private final double LowPressureThreshold = 17;
	private final double HighPressureThreshold = 21;

	Sensor sensor;

	private boolean alarmOn = false;
	
	public Alarm(Sensor sensor){
		this.sensor = sensor;
	}	

	public void check()
	{
		double psiPressureValue = sensor.popNextPressurePsiValue();

		if (psiPressureValue < LowPressureThreshold)
			alarmOn = true;
		else if (HighPressureThreshold < psiPressureValue)
			alarmOn = true;
		else
			alarmOn = false;
			
	}

	public boolean isAlarmOn()
	{
		return alarmOn; 
	}
}