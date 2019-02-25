public class Retangulo {
	
	private Float comprimento;
	private Float largura;
	
	Validate val = new Validate();
	
	public Float getLargura() {
		return largura;
	}
	public void setLargura( Float largura ) {
		if( val.validador( largura ) ) {
			this.largura = largura;
		}
	}
	
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento( Float comprimento ) {
		if( val.validador( comprimento ) ) {
			this.comprimento = comprimento;
		}
	}	
	
	public void Calculo() {
		Float  perimetro = ( 2 * getLargura()) + (2 * getComprimento() );

		System.out.println( " Área: " + getLargura() * getComprimento() );
		System.out.println( " Perímetro: " + perimetro );
	}
}
