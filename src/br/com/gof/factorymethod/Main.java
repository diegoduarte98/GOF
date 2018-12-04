package br.com.gof.factorymethod;

public class Main {

	public static void main(String[] args) {
		FabricaDeCarro fabricaFiat = new FabricaFiat();
		Carro palio = fabricaFiat.criarCarro();
		palio.exibirInfo();
		
		FabricaDeCarro fabricaGol = new FabricaGol();
		Carro gol = fabricaGol.criarCarro();
		gol.exibirInfo();
	}

}
