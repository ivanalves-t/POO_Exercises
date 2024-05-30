package heranca2.entities;

public class AssistenteAdministrativo extends Assistente{

	private String turno;
	private double adicionalNoturno;
	
	public AssistenteAdministrativo(String matricula, String nome, String turno, double adicionalNoturno) {
		super(matricula, nome);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

}
