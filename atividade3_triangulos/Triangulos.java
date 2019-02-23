public class Triangulos {

	public static void main(String[] args) {
		String selecionador    = String.valueOf(  args[0] );
        Integer quantidadeGera = Integer.valueOf( args[1] );

       Validate val 		 = new Validate();
       MontaTriangulos monta = new MontaTriangulos();
       
       if( !val.ValDados( selecionador ) ) {
    	   System.out.println(" - erro Gentileza informe apenas letras ");
    	   System.out.println("Passe uma letra (a, b, c ou d) e um número para o comando!");

    	   System.exit(0);    	   
       }
       
       monta.triangulos( selecionador, quantidadeGera );
	}
}
