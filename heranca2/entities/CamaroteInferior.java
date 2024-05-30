package heranca2.entities;

public class CamaroteInferior extends VIP{
	
	private String localIngresso;
	
	public CamaroteInferior(Double valor, String localIngresso) {
		super(valor);
		this.localIngresso = localIngresso;
	}

	public String getLocalIngresso() {
		return localIngresso;
	}

	public void setLocalIngresso(String localIngresso) {
		this.localIngresso = localIngresso;
	}
	
}
