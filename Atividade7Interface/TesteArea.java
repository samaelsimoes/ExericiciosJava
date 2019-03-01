import java.util.Arrays;
import java.util.List;

public class TesteArea {
    public static void main( String[] args ) {

    	List<AreaCalcula> objetos = Arrays.asList(
    			new Circulo( 22.5 ),
                new Quadrado( 40.0 ),
                new Retangulo( 15.0, 2.0 )
        );
             	
        objetos.forEach( objeto -> System.out.println( objeto.calcularArea() ) );
    }
}