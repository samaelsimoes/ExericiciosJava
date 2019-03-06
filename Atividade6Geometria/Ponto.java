public class Ponto {
	private Double x;
	private Double y;
	
	public Ponto( Double x, Double y ) {
		this.setX(x);
		this.setY(y);
	}

	@Override
	public String toString() {
		return "Ponto -x:" + this.x +  " y:" + this.y;
	}
	
	public Double getX() {
		return x;
	}
	public Double getY() {
		return y;
	}

	public void setX( Double x ) {
		this.x = x;
	}
	public void setY( Double y ) {
		this.y = y;
	}
}
