package classeAbstrataInterface.application;

import classeAbstrataInterface.entities.Bicycle;
import classeAbstrataInterface.entities.Car;
import classeAbstrataInterface.entities.House;
import classeAbstrataInterface.entities.School;
import classeAbstrataInterface.services.CarbonFootprint;

public class Main {

	public static void main(String[] args) {
		
		CarbonFootprint[] cfpList = new CarbonFootprint[6];
<<<<<<< HEAD

=======
		
>>>>>>> d97f137e5496c95e562834320cfdc47c3b941f58
		cfpList[0] = new Car("Ciena", false, 250);
		cfpList[1] = new Car("Ford", true, 400);
		cfpList[2] = new Bicycle("Monark", true);
		cfpList[3] = new Bicycle("BMX", false);
<<<<<<< HEAD
		cfpList[4] = new House(3, true, 5);
		cfpList[5] = new School(7, false, 12, 10);
=======
		cfpList[4] = new Building(3, true, 5);
		cfpList[5] = new Building(7, false, 12);
>>>>>>> d97f137e5496c95e562834320cfdc47c3b941f58

		for (CarbonFootprint c : cfpList) {
			System.out.println(c.getClass().getSimpleName() + ", "+ c.getCarbonFootprint());
		}
	}

}
