package trabalhandoComArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiLendoExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream("C:\\TRABALHO\\PROJETOS\\JAVA\\modulo16\\src\\ARQUIVO_EXCEL3.XLS");
		HSSFWorkbook hssFWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssFWorkbook.getSheetAt(0); /* pega a primeira planilha/aba */
		
		Iterator<Row> linhaIterator = planilha.iterator();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;  					
				}
			}
			pessoas.add(pessoa);
		}
		entrada.close();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
