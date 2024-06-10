package classeAbstrataInterface.entities;

import classeAbstrataInterface.services.CarbonFootprint;

public class Building implements CarbonFootprint{

	private int residentsQuantity;
	private boolean renewableEnergy;
	private int lampsQuantity;
	
	public Building (int residentsQuantity, boolean renewableEnergy, int lampsQuantity) {
		this.residentsQuantity = residentsQuantity;
		this.renewableEnergy = renewableEnergy;
		this.lampsQuantity = lampsQuantity;
	}
	
	
	
	public int getResidentsQuantity() {
		return residentsQuantity;
	}



	public void setResidentsQuantity(int residentsQuantity) {
		this.residentsQuantity = residentsQuantity;
	}



	public boolean isRenewableEnergy() {
		return renewableEnergy;
	}



	public void setRenewableEnergy(boolean renewableEnergy) {
		this.renewableEnergy = renewableEnergy;
	}



	public int getLampsQuantity() {
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
