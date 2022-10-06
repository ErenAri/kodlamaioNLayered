package kodlamaNLayered.core.loggers;

public class SmsLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Sms loglandı=> "+ data);
		
	}

}
