package bookStore;

public class book {
	private String fTitulo;
	private int fIsbn;
	private double fPreco;
	
	public book(String titulo, int isbn, double preco)
	{
		fTitulo = titulo;
		fIsbn = isbn;
		fPreco = preco;
	}
	
	public String titulo()
	{
		return fTitulo;
	}
	
	public int isbn()
	{
		return fIsbn;
	}
	
	public double preco()
	{
		return fPreco;
	}

}
