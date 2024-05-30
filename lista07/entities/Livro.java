package lista07.entities;

public class Livro {
	private String autor;
	private String editora;
	private String ISBN;
	private String titulo;
	private String anoEdicao;
	
	
	public Livro(String autor, String editora, String iSBN, String titulo, String anoEdicao) {
		this.autor = autor;
		this.editora = editora;
		ISBN = iSBN;
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
	}
	
	public String getAutor() {
		return autor;
	}
	public String getEditora() {
		return editora;
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

	public String toString() {
		return "\nautor: " + autor + "\neditora: " + editora + "\nISBN: " + ISBN + "\ntitulo: " + titulo
				+ "\nanoEdicao: " + anoEdicao + "\n";
	}
	
	
}
