package kataCalculadora;

public class Calculadora {
	
	private int valor=0;

	public int Valor() {
		
		return valor;
	}

	public int Sumar(int primerSumando, int segundoSumando) {
		valor = primerSumando+segundoSumando; 
		return valor;
	}
	
}
