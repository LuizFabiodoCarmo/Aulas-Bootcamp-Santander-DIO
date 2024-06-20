package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args, Almoxarife atendente) {
	Cozinheiro cozinheiro = new Cozinheiro();

	//ações que não precisam estarem disponiveis para a aplicação.
//	cozinheiro.lavarIngredientes();
//	cozinheiro.baterVitaminaLiquidificador();
//	cozinheiro.selecionarIngredientesVitamina();
//	cozinheiro.prepararLanche();
//	cozinheiro.prepararVitamina();
//  cozinheiro.fritarIngredientesLanche();
	
	//ações que estabeleciomento precisa ter ciência
	cozinheiro.adicionarSucoNoBalcao();
	cozinheiro.adicionarLancheNoBalcao();
	cozinheiro.adicionarComboNoBalcao();
	
//Já que o estabelecimento não tem ciência do que o Almoxarife faz, essa classe não precisa existir aqui.	
//	Almoxarife almoxarife = new Almoxarife();
	//ações que não precisam estarem disponiveis para a aplicação.
//	almoxarife.controlarEntrada();
//	almoxarife.controlarSaida();
	
	//ações que somente o pacote cozinha precisa ter ciência (default)
//	almoxarife.entregarIngredientes();
//	almoxarife.trocarGas();  
	
	Atendente atendente1 = new Atendente();
//	atendente1.pegarLancheCozinha();
	atendente1.receberPagamento();
	atendente1.servindoMesa();
	
	//ação que somento o pacote cozinha precisa saber(default)
//	atendente1.trocarGas();
	
	Cliente cliente = new Cliente();
	cliente.escolherLanche();
	cliente.fazerPedido();
	cliente.pagarConta();
	
	//não deveria, mas o estabelecimento ainda não definiu normas de atendimento.
    //cliente.pegarPedidoBalcao();
	
	//esta ação é muito sigilosa, que tal ser privada?
    //cliente.consultarSaldoAplicativo();
	
	//já pensou os clientes ouvindo que o gás acabou?
//	cozinheiro.pedirParaTrocarGas(atendente1);
//	cozinheiro.pedirParaTrocarGas(almoxarife);
  }
}
