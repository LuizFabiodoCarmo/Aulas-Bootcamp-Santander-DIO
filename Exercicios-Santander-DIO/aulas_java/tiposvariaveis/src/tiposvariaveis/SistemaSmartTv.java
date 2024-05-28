package tiposvariaveis;

//Criar um exemplo de uma classe para representar uma SmartTV onde:
//1. Ela tenha as características: ligada(boolean), canal(int) e volumen(int)
//2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número



public class SistemaSmartTv {
    boolean ligada= false;
    static int canal= 1;
    static int volume= 25;
	boolean desligada = true;
	
	public static void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public static void aumentarCanal() {
		canal++;
	}
	
	public static void diminuirCanal() {
		canal--;
	}
	
	public static void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para:" + volume);
		
	}
	
	public static void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para:" + volume);
	}
	
	public static  void ligar() {
		// TODO Auto-generated method stub
		
	}
     public static void desligar() {
		// TODO Auto-generated method stub
		
    }
	
}		
	
	
