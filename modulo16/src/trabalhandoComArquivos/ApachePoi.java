package trabalhandoComArquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\TRABALHO\\PROJETOS\\JAVA\\modulo16\\src\\ARQUIVO_EXCEL3.XLS");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		/* Dados para escrever na planilha: 11/10/2024 */
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		pessoa1.setNome("Carlos Henrique");
		pessoa1.setEmail("carlhenrique@gmail.com");
		pessoa1.setIdade(64);
	
		pessoa2.setNome("Maria das Graças");
		pessoa2.setEmail("mgraca@gmail.com");
		pessoa2.setIdade(24);
	
		pessoa3.setNome("Pedro Caroço");
		pessoa3.setEmail("caroco@gmail.com");
		pessoa3.setIdade(33);
		
		pessoa4.setNome("Último da Silva");
		pessoa4.setEmail("ultimo@gmail.com");
		pessoa4.setIdade(29);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa2);
		
		HSSFWorkbook hssFWorkbook = new HSSFWorkbook();
		HSSFSheet linhasPessoa = hssFWorkbook.createSheet("Planilha de pessoas 11-04-2024");
		
		int numeroLinhas = 0;
		for (Pessoa p: pessoas) {
			HSSFRow linha = linhasPessoa.createRow(numeroLinhas++);
			int celula = 0;
			
			HSSFCell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());

			HSSFCell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
			
			HSSFCell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(p.getIdade());			
		}
		FileOutputStream saida = new FileOutputStream(file);
		hssFWorkbook.write(saida);
		saida.flush();
		saida.close();
		hssFWorkbook.close();
		System.out.println("Planilha3 criada!");
	}
}
