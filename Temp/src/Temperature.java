
public class Temperature {
	
	

		private double ftemp;

		public Temperature(double temp){
		  ftemp = temp;

		}

		public void setFahrenheit( double temp){
		  ftemp = temp;
		}

		public double getFahrenheit(){
		  return ftemp;
		}

		public double getCelsius(){
		  return (ftemp - 32) * .5556;
		}

		public double getKelvin(){
		return 0.5556 * (ftemp- 32) + 273;
		}


		}

		