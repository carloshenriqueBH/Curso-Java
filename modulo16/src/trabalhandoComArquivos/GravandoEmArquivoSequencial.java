package trabalhandoComArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravandoEmArquivoSequencial {

	public static void main(String[] args) throws IOException {
		
			File gravandoArquivo = new File("F:\\TRABALHO\\UNICCO\\BOLETOS\\HINOVA\\09104\\FONTES\\MeuArquivo.csv");
			if (!gravandoArquivo.exists()) {
				gravandoArquivo.createNewFile();
			}
			FileWriter escrevendoNoArquivo = new FileWriter(gravandoArquivo);
		
			Pessoa pessoa1 = new Pessoa();
			Pessoa pessoa2 = new Pessoa();
			Pessoa pessoa3 = new Pessoa();
		
			pessoa1.setNome("Carlos Henrique");
			pessoa1.setEmail("carlhenrique@gmail.com");
			pessoa1.setIdade(64);
		
			pessoa2.setNome("Maria das Graças");
			pessoa2.setEmail("mgraca@gmail.com");
			pessoa2.setIdade(24);
		
			pessoa3.setNome("Pedro Caroço");
			pessoa3.setEmail("caroco@gmail.com");
			pessoa3.setIdade(33);
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa3);
			pessoas.add(pessoa2);
			
			for (Pessoa pessoa : pessoas) {
				escrevendoNoArquivo.write(pessoa.getNome()+";"+pessoa.getEmail()+";"+pessoa.getIdade()+"\n");
				escrevendoNoArquivo.flush();
			}		
			escrevendoNoArquivo.close();	
		}
}
