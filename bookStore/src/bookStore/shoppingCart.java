package bookStore;

import java.util.List;

public class shoppingCart {
	private List<book> fLivros;
	
	public shoppingCart(List<book> livros)
	{
		fLivros = livros;
	}
	
	public List<book> livros()
	{
		return fLivros;
	}
	
	public shoppingCart adicionar(book livro)
	{
		List<book> lista = fLivros;
		lista.add(livro);
		return new shoppingCart(lista);
	}
	
	public shoppingCart remover(int isbn)
	{
		List<book> lista = fLivros;
		if(lista.stream().filter(o -> o.isbn() == isbn) != null)
		{
			lista.removeIf(t -> t.isbn() == isbn);
		}
		return new shoppingCart(lista);
	}

}
