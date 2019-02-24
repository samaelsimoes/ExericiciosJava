//Formato do arquivo iso 8859-1
public class Fatura {
	private String	cdFatura;
    private String  descricao;
    private Integer quantidade;
    private Double  preco;
    
    public Fatura( String cdFatura, String  descricao, String args, String  args2 ) {
    	this.cdFatura   = String.valueOf( cdFatura );
        this.descricao  = String.valueOf( descricao );
        this.quantidade = Integer.valueOf( args );
        this.preco 	    = Double.valueOf( args2 );
    }

    public void totalFatura() {
		System.out.println( "Descrição: " + descricao );		
		System.out.println( "Total: " + preco * quantidade );			
	}
}
