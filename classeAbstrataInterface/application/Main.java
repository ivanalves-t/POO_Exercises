package classeAbstrataInterface.application;

import classeAbstrataInterface.entities.Bicycle;
import classeAbstrataInterface.entities.Car;
import classeAbstrataInterface.services.CarbonFootprint;

public class Main {

	public static void main(String[] args) {
		
		CarbonFootprint[] cfpList = new CarbonFootprint[2];
		
		cfpList[0] = new Car("Ciena", false, 250);
		cfpList[1] = new Bicycle("Monark", true);

		for (CarbonFootprint c : cfpList) {
			System.out.println(c.getClass().getSimpleName() +", "+ c.getCarbonFootprint());
		}
	}

}
