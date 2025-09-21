package ValidationPackage;

import customException.MyPollutionCustomException;

public class pollutionValidation {
	public static void  ValidatePolution(int level) throws MyPollutionCustomException{
		if(level > 100) {
			throw new MyPollutionCustomException("Please update your pollution");
		}
	}
}
