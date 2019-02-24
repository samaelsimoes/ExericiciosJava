public class Retangulo {
	
	private Float comprimento = 1.0f;
	private Float largura 	  = 1.0f;
	
	Validate val = new Validate();	

	public static void main( String[] args ) {
		
		Float comprimento = Float.valueOf( args[0] );
		Float largura 	  = Float.valueOf( args[1] );
		
		Retangulo retangulo = new Retangulo();
		retangulo.setComprimento( comprimento );
		retangulo.setComprimento( largura );
		
		retangulo.Calculo();

	}

	public Float getLargura() {
		return largura;
	}
	public void setLargura( Float largura ) {
		val.validador( largura );
		this.largura = largura;
	}
	
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento( Float comprimento ) {
		val.validador( comprimento );
		this.comprimento = comprimento;
	}	
	
	public void Calculo() {
		
		double area = ( comprimento * largura );
		System.out.println( " Área: " + area );
		System.out.println( " Perímetro: " + ( getLargura() + getLargura() ) + ( getComprimento() + getComprimento() )   );
	}
}
