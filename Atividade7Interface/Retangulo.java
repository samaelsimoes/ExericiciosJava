public class Retangulo implements AreaCalcula {
    
    private Double base;
    private Double altura;

    public Retangulo( Double base, Double altura ) {
        this.base   = base;
        this.altura = altura;
    }
    
    @Override
    public Double calcularArea( ) {
        Double resposta_Retangulo;
        resposta_Retangulo = base * altura;
        return resposta_Retangulo;        
    }
    
    public Double getBase() {
		return this.base;
	}

	public void setBase( Double base ) {
		this.base = base;
	}

	public Double getAltura() {
		return this.altura;
	}

	public void setAltura( Double altura ) {
		this.altura = altura;
	}
}