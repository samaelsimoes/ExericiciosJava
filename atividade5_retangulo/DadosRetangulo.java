public class DadosRetangulo {
	public static void main( String[] args ) {
		
		Float comprimento = Float.valueOf( args[0] );
		Float largura 	  = Float.valueOf( args[1] );
		
		Retangulo retangulo = new Retangulo();
		retangulo.setComprimento( comprimento );
		retangulo.setComprimento( largura );
		
		retangulo.Calculo();

	}
}
