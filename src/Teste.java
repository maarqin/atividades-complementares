import static org.junit.Assert.*;

import org.junit.Test;


public class Teste {

	@Test
	public void fibTest() {
		assertEquals("Erro no fib(55)", 55, Principal.fibonacci(10));
	}
	
	@Test
	public void somaTest(){
		int[] valores = {1,2,3,4,5};
		assertEquals("Erro no somador", 15, Principal.somador(valores));
	}
	
	@Test
	public void palindromoTest(){
		assertEquals("Eh palindromo", true, Principal.palindromo("arara"));
	}
	
	@Test
	public void palindromosTeste(){
		String[] palavras = {"ovo", "arara", "caiu", "matam", "fala", "reviver"};
		assertEquals("Tem palindromos", true, Principal.palindromos(palavras));
	}
	
	@Test
	public void palindromoIntTest(){		
		assertEquals("Tem palindromos", true, Principal.palindromo());
	}
}
