package kataCalculadora;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.Before;

public class TestBasicos {

	//Calculadora calc = new Calculadora();
	private Calculadora calc;
	
	@Before //ejecuta el stup antes de cada test
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void debeIniciarceEn0() {
		//Calculadora calc = new Calculadora();
		Assert.assertEquals(0, calc.Valor());
	}
	
	@Test
	public void siSumo3Mas4elResultadoDebeSer7() {
		//Calculadora calc = new Calculadora();
		calc.Sumar(3,4);
		Assert.assertEquals(7, calc.Valor());
	}
	
	@Test
	public void sumar1mas2debeSer3() {
		//Calculadora calc = new Calculadora();
		calc.Sumar(1,2);
		Assert.assertEquals(3, calc.Valor());
	}
	
	//@Test siResto5menos2debeSer3()

}
