package heranca2.entities;

public class AssistenteTecnico extends Assistente{

	private double bonusSalarial;
	
	public AssistenteTecnico (String matricula, String nome, double bonusSalarial){
		super(matricula, nome);
		this.bonusSalarial = bonusSalarial;
	}

	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	
}
