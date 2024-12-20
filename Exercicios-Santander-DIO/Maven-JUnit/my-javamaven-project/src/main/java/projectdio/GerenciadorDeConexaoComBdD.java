package projectdio;

import java.util.logging.Logger;

public class GerenciadorDeConexaoComBdD {

	 private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBdD.class.getName());

	    public static void iniciarConexao() {
	        //fez algo
	        LOGGER.info("Iniciou conexao");
	    }

	    public static void finalizarConexao() {
	        //fez algo
	        LOGGER.info("finalizou conexao");
	    }

	    public static void insereDados(Pessoa pessoa) {
	        //insere pessoa no DdB
	        LOGGER.info("inseriu dados");
	    }

	    public static void removeDados(Pessoa pessoa) {
	        //remove pessoa no DdB
	        LOGGER.info("removeu dados");
	    }
	}
