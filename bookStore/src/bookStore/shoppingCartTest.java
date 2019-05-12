package bookStore;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class shoppingCartTest {

	@Test
	void testAdicionar() {
		List<book> lista = new ArrayList<book>(); ;
		lista.add(new book("First", 1, 10));
		shoppingCart carrinho = new shoppingCart(lista);
		shoppingCart result = carrinho.adicionar(new book("Second", 2, 20));
		
		assertTrue(result.livros().size() == 2);
		
	}

	@Test
	void testRemover() {
		//fail("Not yet implemented");
	}

}
