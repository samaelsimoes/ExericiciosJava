public class FaturaTeste {
    public static void main( String[] args ) {
        String cdFatura    = String.valueOf( args[0] );
        String descricao   = String.valueOf( args[1] );
        Integer quantidade = Integer.valueOf( args[2] );
        Double preco       = Double.valueOf( args[3] );

        Fatura fatura = new Fatura( cdFatura, descricao, quantidade, preco );
        fatura.saidaFatura();
    }
}