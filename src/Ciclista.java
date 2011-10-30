import java.util.Scanner;

public class Ciclista {

	public static void main(String [] args) throws CiclistaException {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Informe distância e tempo: ");
			String valoresEntrada = scanner.nextLine();
			double[] velocidadeTempo = interpretarValoresDeVelocidadeTempo(valoresEntrada);
			double velocidadeMedia = calcularVelocidadeMedia(velocidadeTempo[0], velocidadeTempo[1]);
			System.out.println("Velocidade média: " + velocidadeMedia);
		}
	}
	
	public static double calcularVelocidadeMedia(double distancia, double tempo) throws CiclistaException {
		if(tempo == 0.0) {
			throw new CiclistaException();
		}
		return distancia/tempo;
	}

	public static double[] interpretarValoresDeVelocidadeTempo(String valoresEntrada) {
		String[] velocidadeTempoString = valoresEntrada.split(" ");
		return new double[] {Double.parseDouble(velocidadeTempoString[0]), Double.parseDouble(velocidadeTempoString[1])};
	}
}
