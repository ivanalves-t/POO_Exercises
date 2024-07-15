package classeAbstrataInterface.entities;

public abstract class Building implements CarbonFootprint{

	private Integer residentsQuantity;
	private boolean renewableEnergy;
	private Integer lampsQuantity;
	
	public Building (Integer residentsQuantity, boolean renewableEnergy, Integer lampsQuantity) {
		this.residentsQuantity = residentsQuantity;
		this.renewableEnergy = renewableEnergy;
		this.lampsQuantity = lampsQuantity;
	}
	
	
	
	public Integer getResidentsQuantity() {
		return residentsQuantity;
	}



	public void setResidentsQuantity(Integer residentsQuantity) {
		this.residentsQuantity = residentsQuantity;
	}



	public boolean isRenewableEnergy() {
		return renewableEnergy;
	}



	public void setRenewableEnergy(boolean renewableEnergy) {
		this.renewableEnergy = renewableEnergy;
	}



	public Integer getLampsQuantity() {
		return lampsQuantity;
	}



	public void setLampsQuantity(int lampsQuantity) {
		this.lampsQuantity = lampsQuantity;
	}



	@Override
	public String getCarbonFootprint() {
		if (renewableEnergy == true) {
			return "0 CO2eq";
		}
		return "250 CO2eq";
	}
}
