
public class LakeData {
	private double windSpeed;
	private double airTemp;
	private double barometricPressure;
	
	public LakeData() {
		windSpeed = 0;
		airTemp = 0;
		barometricPressure = 0;
		
	}
	
	public LakeData(double w, double a, double p) {
		windSpeed = w;
		airTemp = a;
		barometricPressure = p;
	}
	
	public void setWindSpeed(double w) {
		windSpeed = w;
	}
	 
	public void airTemp(double a) {
		airTemp = a;
	}
	 
	public void barometricPressure(double p) {
		barometricPressure = p;
	}
	
	public double getWindSpeed() {
		return windSpeed;
	}
	
	public double getAirTemp() {
		return airTemp;
	}
	
	public double getBarometricPressure() {
		return barometricPressure;
	}
	 
    public double getAverage(double a, double b) {
    	return a/b;
    }
}
