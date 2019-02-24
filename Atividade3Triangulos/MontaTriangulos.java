public class MontaTriangulos {
	public void triangulos( String selecionador, Integer quantidadeGera ) {
		switch( selecionador ) {
			case "a":
			case "A":
				TrianguloA( quantidadeGera );
				break;
			case "b":
			case "B":
				TrianguloB( quantidadeGera );
			break;
			case "c":
			case "C":
				TrianguloC( quantidadeGera );
			break;
			case "d":
			case "D":
				TrianguloD( quantidadeGera );
			break;
		} 
	}

	private void TrianguloD( Integer quantidadeGera ) {
		for( Integer i = 0; i < quantidadeGera; i++ ) {
			for( Integer j = quantidadeGera; j >= i+1; j-- ) {
				System.out.print(" ");
			}
			
			for( Integer k = 1; k <= i+1; k++ ) {
				System.out.print("*");
			}
			
			System.out.println("");			
		}
	}

	private void TrianguloC( Integer quantidadeGera ) {
		for( Integer i = 0; i < quantidadeGera; i++ ) {
			for( Integer j = 1; j <= i+1; j++ ) {
				System.out.print(" ");
			}
			for (Integer k = quantidadeGera; k >= i+1; k--) {
				System.out.print("*");
			}			
			System.out.println("");			
		}
	}

	private void TrianguloB( Integer quantidadeGera ) {
		for( Integer i = 0; i < quantidadeGera; i++ ) {
			for( Integer j = quantidadeGera; j >= i+1; j-- ) {
				System.out.print("*");
			}			
			System.out.println("");			
		}
	}

	private void TrianguloA( Integer quantidadeGera ) {
		for (Integer i = 0; i < quantidadeGera; i++) {
			for (Integer j = 1; j <= i+1; j++) {
				System.out.print("*");
			}			
			System.out.println("");			
		}
	}	
}
