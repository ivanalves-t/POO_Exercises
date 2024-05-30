package lista08.entities;

public class Livro {
	private String autor[] = new String[3];
	private String editora[] = new String[4];
	private String ISBN;
	private String titulo;
	private String anoEdicao;

	public Livro(String[] autor, String[] editora, String iSBN, String titulo, String anoEdicao) {
		super();
		this.autor = autor;
		this.editora = editora;
		ISBN = iSBN;
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
	}

	public String[] getAutor() {
		return autor;
	}

	public String[] getEditora() {
		return editora;
	}

	@Override
	public String toString() {
		return "Livro " + "[autor:" + " CPF=" + autor[0] + ", nome=" + autor[1] + ", endereco=" + autor[2]
				+ ", editora:" + ", CNPJ=" + editora[0] + ", nome=" + editora[1] + ", endereco="
				+ editora[2] + "telefone=" + editora[3]+", ISBN=" + ISBN + ", titulo=" + titulo + ", anoEdicao=" + anoEdicao + "]";
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAnoEdicao() {
		return anoEdicao;
	}
}
