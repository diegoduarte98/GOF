package br.com.gof.factorymethod;

public class FabricaGol implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
