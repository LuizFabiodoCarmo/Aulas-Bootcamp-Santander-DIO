package projectdio;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AfterBeforeTest {

	 @BeforeAll
	    static void configuraConexao() {
	        GerenciadorDeConexaoComBdD.iniciarConexao();
	    }

	    @BeforeEach
	    void insereDadosParaTeste() {
	        GerenciadorDeConexaoComBdD.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	    }

	    @AfterEach
	    void removeDadosDoTeste() {
	        GerenciadorDeConexaoComBdD.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	    }

	    @Test
	    void validarDadosDeRetorno() {
	        Assertions.assertTrue(true);
	    }

	    @Test
	    void validarDadosDeRetorno2() {
	        Assertions.assertNull(null);
	    }

	    @AfterAll
	    static void finalizarConexao() {
	        GerenciadorDeConexaoComBdD.finalizarConexao();
	    }
	}
