package lanchonete.area.cliente;

public class Cliente {

	public void escolherLanche() {
	System.out.println("ESCOLHENDO O LANCHE");
	}
    public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
    public void pagarConta() {
		System.out.println("PAGANDO A CONTA");
	}
    private void consultarSaldoAplicativo() {
		System.out.println("CONSUKTANDO SALDO NO APLICATIVO");
	}
//    public void pegarPedidoBalcao() {
//		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
//	} método refatorado, não é uma ação que o cliente deve ter.
    
}
