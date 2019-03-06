/**
 * Obs importantes: Tentado rodar pelo javac ou no intellij não consegui, fiz no eclipse e funcionou tirar duvida com o professor
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTeste {
	public static void main( String[] args ) {
	
		JSONParser parser = new JSONParser();
       
       	try {
       		
       		//Faz a leitura do arquivo
       		Object obj = parser.parse( new FileReader("C://Users//Samael//Documents//projetosJava//Calculadora//ExericicioCatolica-json-9//src//arquivo.json") );
       		
       		//Joga o conteúdo para um objeto
       		JSONObject jsonObject = (JSONObject) obj;
       		
       		//Procura a 'key' 'itens' dentro do objeto e espera que ela seja um array 
       		JSONArray itens = (JSONArray) jsonObject.get("itens");
       		
       		Double totalFatura 		  = 0.0;
       		int totalQuantidadeFatura = 0;
       		
       		Fatura fatura = new Fatura();
       		
       		for( int i = 0; i < itens.size(); i++ ) {
       		
       			//Lê a primeira posição do array e joga para um objeto
				JSONObject item = (JSONObject) itens.get(i);
				
				fatura.setCdFatura(	  (String) item.get("codigo") );
				fatura.setDescricao(  (String) item.get("descricao") );
				fatura.setQuantidade( (Long)   item.get("quantidade") );
				fatura.setPreco( 	  (Double) item.get("preco") )	;
				
				Double calculoTotal   = fatura.getPreco() * fatura.getQuantidade();
				totalQuantidadeFatura = i + totalQuantidadeFatura;
				
				totalFatura = totalFatura + calculoTotal;

			}
       		
       		fatura.saidaFatura( totalFatura, totalQuantidadeFatura);
       	} catch( FileNotFoundException e ) {
			e.printStackTrace();
		} catch( IOException e ) {
			e.printStackTrace();
		} catch ( ParseException e ) {
			e.printStackTrace();
		}
	};
}
