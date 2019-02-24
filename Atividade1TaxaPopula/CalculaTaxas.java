public class CalculaTaxas {
	public Object calculaPolacao( int totAnos, Long populaMundial ) {
		Long  resposta = Math.round( populaMundial * Math.pow( 1.02, totAnos -1 ) );				
		return resposta;
	}
}
