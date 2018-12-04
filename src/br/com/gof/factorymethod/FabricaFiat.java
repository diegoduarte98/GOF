package br.com.gof.factorymethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Palio();
	}

}
