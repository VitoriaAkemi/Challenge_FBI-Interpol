package br.com.fiap.FBIInterpol.API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import br.com.fiap.FBIInterpol.model.Procurado;


public class FBI {
    
	public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
		String resposta, jsonEmString = "";
		while ((resposta = buffereReader.readLine()) != null) {
			jsonEmString += resposta;
		}
		return jsonEmString;
	}
	
	
    public static Procurado ConsultarPorNome(String nome) throws Exception {
    	String webService = "https://api.fbi.gov/wanted/v1/list?title=" + nome;
    	
    	try {
    		URL url = new URL(webService);
    		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
    		
    		
    		// verificando se a requisição foi 200
    		if (conexao.getResponseCode() != 200)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
    		
    		
    		BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
    		System.out.println("resposta: " + resposta);
            String jsonEmString = converteJsonEmString(resposta);
            
            System.out.println("jsonEmString: " + jsonEmString);
            
            Gson gson = new Gson();
            Procurado procurado = gson.fromJson(jsonEmString, Procurado.class);
            
            System.out.println("procurado: " + procurado);
            
            return procurado;
    		
    	}  catch (Exception e) {
        throw new Exception("ERRO: " + e);
    	}
    }
    	
    	
}
