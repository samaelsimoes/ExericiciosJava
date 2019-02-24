public class Calculadora {
	public static void main( String[] args ) {
		
		int n1 = Integer.valueOf( args[0] );
		int n2 = Integer.valueOf( args[1] );
		
		Operacoes oper = new Operacoes();
		
		oper.calcular( n1, n2 );
	}
}
