public class Quadrado implements AreaCalcula{
    private Double lado;

    public Quadrado( Double lado ) {
        this.lado = lado;
    }
    
    @Override
    public Double calcularArea( ) {
        double resposta_Quadrado;
        resposta_Quadrado = Math.pow(lado,2);
        return resposta_Quadrado;
    }

    public Double getLado() {
		return this.lado;
	}

	public void setLado( Double lado ) {
		this.lado = lado;
	}

}