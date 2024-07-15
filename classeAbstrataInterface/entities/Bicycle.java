package classeAbstrataInterface.entities;

public class Bicycle implements CarbonFootprint{

	private String bikeModel;
	private boolean containsGear;
	
	
	
	public Bicycle(String bikeModel, boolean containsGear) {
		this.bikeModel = bikeModel;
		this.containsGear = containsGear;
	}



	public String getBikeModel() {
		return bikeModel;
	}



	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}



	public boolean isContainsGear() {
		return containsGear;
	}



	public void setContainsGear(boolean containsGear) {
		this.containsGear = containsGear;
	}



	@Override
	public String getCarbonFootprint() {
		return "0 CO2eq";
	}
	
}
