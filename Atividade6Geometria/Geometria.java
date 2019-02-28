public class Geometria {
	public static void main( String[] args ) {
        Ponto p1 = new Ponto( 3.0, 5.0 );
        Ponto p2 = new Ponto( 5.0, 5.0 );
        Ponto p3 = new Ponto( 3.0, 3.0 );
        Ponto p4 = new Ponto( 5.0, 3.0 );
        
        Quadrilatero quadri = new Quadrilatero(  p1, p2, p3, p4 );

        System.out.println( p1 );
        System.out.println( p2 );
        System.out.println( p3 );
        System.out.println( p4 );
	}
}
