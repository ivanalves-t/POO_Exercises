package classeAbstrataInterface.entities;

public class Car implements CarbonFootprint{

	private String carModel;
	private boolean renewableFuel;
	private float cylinderCapacity;
	
	
	public Car(String carModel, boolean renewableFuel, float cylinderCapacity) {
		this.carModel = carModel;
		this.renewableFuel = renewableFuel;
		this.cylinderCapacity = cylinderCapacity;
	}


	public String getCarModel() {
		return carModel;
	}


	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public boolean isRenewableFuel() {
		return renewableFuel;
	}


	public void setRenewableFuel(boolean renewableFuel) {
		this.renewableFuel = renewableFuel;
	}


	public float getCylinderCapacity() {
		return cylinderCapacity;
	}


	public void setCylinderCapacity(float cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}


	@Override
	public String getCarbonFootprint() {
		if (renewableFuel == true) {
			return "0 CO2eq";
		}
		return "1000 CO2eq";
	}
}
