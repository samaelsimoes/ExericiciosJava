public class Validate { 
	public void validador( Float largura ) {
		if( largura <= 0.0 || largura <= 0  ) {
			System.out.println( " Erro: Um dos lados do retângulo é igual ou menor que zero " );
			System.exit(0);
		}
	}
}
