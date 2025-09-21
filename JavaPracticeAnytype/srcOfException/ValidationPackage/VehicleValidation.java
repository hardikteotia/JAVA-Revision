package ValidationPackage;

import customException.SpeedOutOfRangeException;

public class VehicleValidation {
	
	public static void speedValidation(int speed) throws SpeedOutOfRangeException {
		if(speed > 80) {
			throw new SpeedOutOfRangeException("Yo speed is above 80 slow down");
		}
		else if(speed<30) {
			throw new SpeedOutOfRangeException("You're going kinda slow buddy");
		}
		
	}
	
	
}
