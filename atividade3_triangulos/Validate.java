public class Validate {
	public boolean ValDados( String campo ) {		
		return campo.matches("[A-Z a-z Çç]{"+campo.length()+"}");
	}
}
