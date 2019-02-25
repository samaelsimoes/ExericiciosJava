public class Validate { 
	public boolean validador( Float largura ) {
		boolean tpRetorno = false;
		if( largura <= 0.0 || largura <= 0  ) {
			System.out.println( " Erro: Um dos lados do retângulo é igual ou menor que zero " );
			System.exit(0);
		} else {
			tpRetorno = true;
		}
		return tpRetorno;
	}
}