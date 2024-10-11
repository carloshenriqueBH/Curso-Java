package trabalhandoComArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditandoPlanilhla {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\TRABALHO\\PROJETOS\\JAVA\\modulo16\\src\\ARQUIVO_EXCEL3.XLS");
		
		FileInputStream entrada = new FileInputStream(file);
		HSSFWorkbook hssFWorkBook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssFWorkBook.getSheetAt(0);
		Iterator<Row> linhaIterator = planilha.iterator();
		
		/* Percorre todas as linhas da planilha */
		
		while(linhaIterator.hasNext()) {
			Row linha = linhaIterator.next(); /* dados de uma pessoa na linha */
			int numeroCelulas =  linha.getPhysicalNumberOfCells(); /* quantidade de células na planilha */
			Cell cell = linha.createCell(numeroCelulas); /* cria nova célula à direita */
			cell.setCellValue("4.237,80");			
		}
		
		entrada.close();
 		
		FileOutputStream saida = new FileOutputStream(file);
		hssFWorkBook.write(saida);
		saida.flush();
		saida.close();
		System.out.println("Planilha atualizada!");
	}

}
