public class PopulacaoMundial {
	public static void main(String[] args) {

        Integer entrada   = Integer.valueOf( args[0] );
		Long populaMundial = 7444333222L;
		
		if( entrada == 0 ) {
			System.out.println( " Gentileza informe um numero maior que zero " );		
		}
		
		CalculaTaxas calcula = new CalculaTaxas();		
		EntradaSaida.mostraResultado( calcula.calculaPolacao( entrada, populaMundial ) );
	}
}
