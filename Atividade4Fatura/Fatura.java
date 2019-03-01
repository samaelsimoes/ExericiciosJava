//Formato do arquivo iso 8859-1
public class Fatura {
	private String	cdFatura;
    private String  descricao;
    private Integer quantidade;
    private Double  preco;
    
    public Fatura( String cdFatura, String  descricao, Integer quantidade, Double preco ) {
    	this.cdFatura   = cdFatura;
        this.descricao  = descricao;
        this.quantidade = quantidade;
        this.preco 	    = preco;
    }

    public void saidaFatura() {
		System.out.println( "Descrição: " + descricao );		
		System.out.println( "Total: " + preco * quantidade );			
	}
}
