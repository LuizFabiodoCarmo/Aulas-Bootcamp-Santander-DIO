package projectdio;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

public class AssertionsTest {

	 @SuppressWarnings("deprecation")
	@Test
	    void validarValoresDeOperacoes() {

	        /* Validando soma */
	        int resultado = 10;
	        assertEquals(resultado, (5 + 5));

	        /* Validando igualdade de valores */
	        double valor = 5.0;
	        double outroValor = 5.0;
	        assertEquals(valor, outroValor);
	    }

	    @Test
	    void validarSeArraysSaoIguais() {

	        /* Valida se os arrays são iguais, comparando um a um */
	        int[] primeiroLancamento = {10, 20, 30, 40, 50};
	        int[] segundoLancamento = {10, 20, 30, 40, 50};
	        assertArrayEquals(primeiroLancamento, segundoLancamento);

	        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
	        boolean[] flags = {true, false, false};
	        assertArrayEquals(new boolean[]{true, false, false}, flags);

	        /* Utilizando arrays de diferentes tipos, começando por double[] */
	        double[] valores = {5.0, 10.5, 50D, 46d};
	        assertEquals(new double[]{5.0, 10.5, 50D, 46d}, valores);
	    }

	    @Test
	    void validarSeObjetoEstaNuloOuNao() {

	        Pessoa pessoa = null;
	        assertNull(pessoa);

	        pessoa = new Pessoa("Luciano", LocalDateTime.now());
	        assertNotNull(pessoa);
	    }

	    @SuppressWarnings("deprecation")
		@Test
	    void validarNumerosDeTiposDiferentes() {

	        double valor = 5.0;
	        double outroValor = 5.0;

	        assertEquals(valor, outroValor);
	    }

	    @Test
	    void validarQueValoresSaoDiferentes(){

	        int x = 5;
	        int y = 6;

	        assertNotEquals(5, 6);
	    }

	    @Test
	    void validarQueAlgumaCondicaoEhFalsa() {

	        boolean condicao = 5 + 6 == 12;

	        assertFalse(condicao);
	    }

	    @Test
	    void validarQueAlgumaCondicaoEhVerdadeira() {

	        var condicao = 6 + 6 == 12;

	        assertTrue(condicao);
	    }
	}
