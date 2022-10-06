package kodlamaNLayered.core.loggers;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Database'e loglandı=> "+ data);
		
	}

}
