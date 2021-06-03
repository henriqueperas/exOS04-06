package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllerA implements ControllerI {

	String testeB[] = new String[100]; 
	int interB;
	
	@Override
	public void readFile(String path, String name) throws IOException {
		File arq = new File(path, name);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			int inter = 0;
			while (linha != null) {
				linha = linha.replace(";", "		");
				testeB[inter] = linha;
				inter = inter + 1;
				linha = buffer.readLine();
			}
			interB = inter;
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Diretorio invalido");
		}
		
	}

	@Override
	public void separacao() throws IOException {
		// TODO Auto-generated method stub
		for(int j = 0; interB > j; j++) {
			String teste = testeB[j];
			int i = teste.lastIndexOf(" ");
			String teste2 = teste.substring(i+1, i+7);
			if(teste2.equalsIgnoreCase("fruits")) {
				System.out.println(testeB[j]);
			}
		}
	}

}
