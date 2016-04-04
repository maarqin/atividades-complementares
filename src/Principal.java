
/**
 * @author Marcos Thomaz
 *
 */
public class Principal {
	
	public static void main(String[] args) {
		System.out.println("R: " + binaria(7));
		
		//fibonacci(1);
	}
		
	
	/**
	 * Busca binaria
	 * 
	 * @param chave
	 * @return
	 */
	private static int binaria(int chave) {
		int[] arranjo = {1,2,3,4,5,6,7,8,9};
    	int inicio = 0, fim = arranjo.length;
    	do {
    		
    		int pivo = ((fim-inicio)/2)+inicio; System.out.println(pivo);
    		if( arranjo[pivo] == chave ){
    			return pivo;
    		} else if( chave > arranjo[pivo] ){
    			inicio = pivo+1;
    		} else {
				fim = pivo;
    		}

    	} while ((fim-inicio) > 0);

    	return -1;
	}
	
	/**
	 * Calcula a sequencia de fibonacci
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {		
		//return (n < 2) ? n : (fibonacci(n - 1) + fibonacci(n - 2)); 
		return (fibonacci(n - 1) + fibonacci(n - 2)); 

	}
	
	/**
	 * Calcula a sequencia de valores inteiros de um array
	 * @param valores
	 * @return
	 */
	public static int somador(int[] valores){		
		int resultado = 0;
		for (int i = 0; i < valores.length; i++) {
			resultado +=  valores[i];
		}		
		return resultado;
	}
	
	/**
	 * Verifica se uma palavra eh palindroma
	 * @param palavra
	 * @return
	 */
	public static boolean palindromo(String palavra) {
		String nova = "";
		for (int i = (palavra.length()-1); i >= 0; i--) {
			nova += palavra.charAt(i);
		}
		return ( palavra.toUpperCase().equals(nova.toUpperCase()) ) ? true : false;
	}

	/**
	 * Verifica se uma lista de palavras sao palindromas
	 * @param palavras
	 * @return
	 */
	public static boolean palindromos(String[] palavras) {
		boolean retorno = false;
		for (int i = 0; i < palavras.length; i++) {
			String nova = "";
			for (int j = (palavras[i].length()-1); j >= 0; j--) {
				nova += palavras[i].charAt(j);
			}
			if( (palavras[i].toUpperCase().equals(nova.toUpperCase())) ){
				retorno = true;
				break;
			}
		}
		return retorno;
	}
	
	/**
	 * Verifica um numero inteiro e par eh palindroma
	 * @return
	 */
	public static boolean palindromo() {
		boolean retorno = false;
		for (int i = 1; i <= 1000; i++) {
			if( i % 2 == 0 ){
				String nova = "";
				String novoI = i+"";
				for (int j = (novoI.length()-1); j >= 0; j--) {
					nova += novoI.charAt(j);
				}
				if( (novoI.equals(nova)) ){
					retorno = true;
					break;
				}
			}
		}
		return retorno;
	}
	
}
