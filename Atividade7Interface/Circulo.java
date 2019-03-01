public class Circulo implements AreaCalcula {
    private Double diametro;

    public Circulo( Double diametro ) {
        this.diametro = diametro;
    }
    
    @Override
    public Double calcularArea( ) {
        Double resposta_Circulo;
        resposta_Circulo = Math.PI * ( diametro/2 );
        return resposta_Circulo;
    }

    public Double getDiametro() {
		return this.diametro;
	}

	public void setDiametro( Double diametro ) {
		this.diametro = diametro;
	}
}