import static org.junit.Assert.*;

import org.junit.Test;


public class CiclistaTest {

	@Test
	public void deveCalcularVelocidadeMediaParaPercuso10KMPor1Hora() throws Exception {
		double velocidadeMedia = Ciclista.calcularVelocidadeMedia(10.0, 1.0);
		assertEquals(10.0, velocidadeMedia, 0);
	}

	@Test
	public void deveCalcularVelocidadeMediaParaPercurso20KMPor1hora() throws Exception {
		double velocidadeMedia = Ciclista.calcularVelocidadeMedia(20.0, 1.0);
		assertEquals(20.0, velocidadeMedia, 0);
	}
	
	@Test
	public void deveCalcularVelocidadeMediaParaPercurso40KMPor4horas() throws Exception {
		double velocidadeMedia = Ciclista.calcularVelocidadeMedia(40.0, 4.0);
		assertEquals(10.0, velocidadeMedia, 0);
	}

	@Test
	public void deveCalcularVelocidadeMediaParaPercurso50KMPor2horasEMeia() throws Exception {
		double velocidadeMedia = Ciclista.calcularVelocidadeMedia(50.0, 2.5);
		assertEquals(20.0, velocidadeMedia, 0);
	}

	@Test
	public void deveCalcularVelocidadeMediaParaPercurso100KMPor2horasEMeia() throws Exception {
		double velocidadeMedia = Ciclista.calcularVelocidadeMedia(100.0, 2.5);
		assertEquals(40.0, velocidadeMedia, 0);
	}
	
	@Test(expected = CiclistaException.class)
	public void naoDeveCalcularVelocidadeMediaParaPercursoDe0Horas() throws Exception {
		Ciclista.calcularVelocidadeMedia(50.0, 0.0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia10Tempo1() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("10.0 1.0");
		assertArrayEquals(new double[] {10.0, 1.0}, velocidadeTempo, 0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia20Tempo2() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("20.0 2.0");
		assertArrayEquals(new double[] {20.0, 2.0}, velocidadeTempo, 0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia40Tempo20() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("40.0 20.0");
		assertArrayEquals(new double[] {40.0, 20.0}, velocidadeTempo, 0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia50Tempo30() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("50.0 30.0");
		assertArrayEquals(new double[] {50.0, 30.0}, velocidadeTempo, 0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia100Tempo20() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("100.0 20.0");
		assertArrayEquals(new double[] {100.0, 20.0}, velocidadeTempo, 0);
	}
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempoParaDistancia100Tempo0() {
		double[] velocidadeTempo = Ciclista.interpretarValoresDeVelocidadeTempo("100.0 0.0");
		assertArrayEquals(new double[] {100.0, 0.0}, velocidadeTempo, 0);
	}
}
