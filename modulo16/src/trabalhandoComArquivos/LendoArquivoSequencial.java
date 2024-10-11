package trabalhandoComArquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LendoArquivoSequencial {

public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream arquivoFonte = new FileInputStream(new String("F:\\TRABALHO\\UNICCO\\BOLETOS\\HINOVA\\09104\\FONTES\\MeuArquivo.txt"));
		Scanner lerArquivo = new Scanner(arquivoFonte,"UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>(); 
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if (linha != null && !linha.isEmpty()) {
			
				String[] fraciona = linha.split("\\;");
				
				String nome = fraciona[0];
				String email = fraciona[1];
				int idade = Integer.parseInt(fraciona[2]);
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(nome);
				pessoa.setEmail(email);
				pessoa.setIdade(idade);
				pessoas.add(pessoa);
			}			
		}
		System.out.println(pessoas);
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}


}
