/*
	* formato do arquivo ISO 8859-1
*/
public class Operacoes {
	public void calcular( int num1, int num2 ) {
		
		System.out.println( "Soma:      " + ( num1 + num2 ) );
		System.out.println( "Produto:   " + ( num1 * num2 ) );
		System.out.println( "Diferen�a: " + ( num1 - num2 ) );
	
		if( num2 != 0 ) {
			System.out.println( "Divis�o: " + ( (double) num1 / num2 ) );
		} else {
			System.out.println( 999999999.999999999 + " \n " + "Erro de divis�o por zero");			
		}		

		System.out.println( num1 > num2 ?  num1 + " � maior " : num2 + " � maior" );
	
	}
}
