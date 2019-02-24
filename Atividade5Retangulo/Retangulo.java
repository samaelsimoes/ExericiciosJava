public class Retangulo {
	
	private Float comprimento = 1.0f;
	private Float largura 	  = 1.0f;
	
	Validate val = new Validate();
	
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
		System.out.println( " Área: " + getLargura() * getComprimento() );
		System.out.println( " Perí­metro: " + ( getLargura() + getLargura() ) + ( getComprimento() + getComprimento() )   );
	}
}
