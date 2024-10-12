package trabalhandoComArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setCPF("40330915649");
		usuario1.setLogin("Carlim");
		usuario1.setSenha("123456");
		usuario1.setNome("Carlos Henrique");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setCPF("66260825668");
		usuario2.setLogin("Leca");
		usuario2.setSenha("456789");
		usuario2.setNome("Liliane");
		
		Usuario usuario3 = new Usuario();
		
		usuario3.setCPF("38749374934");
		usuario3.setLogin("Caroço");
		usuario3.setSenha("456789");
		usuario3.setNome("Pedro Caroço");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		String jsonUser = new Gson().toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\TRABALHO\\PROJETOS\\JAVA\\modulo16\\src\\fileJson.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
	}

}
