package classeAbstrataInterface.entities;

public class School extends Building{

	private int teachersQuantity;
	
	public School(int residentsQuantity, boolean renewableEnergy, int lampsQuantity, int teachersQuantity) {
		super(residentsQuantity, renewableEnergy, lampsQuantity);
		this.teachersQuantity = teachersQuantity;
	}

	public int getTeachersQuantity() {
		return teachersQuantity;
	}

	public void setTeachersQuantity(int teachersQuantity) {
		this.teachersQuantity = teachersQuantity;
	}

}
