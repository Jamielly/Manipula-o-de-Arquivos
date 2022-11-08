package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String dirwin = "C:\\Windows";
		String path = "C:\\TEMP\\generic_food";
		String nome = "generic_food.csv";
		
		try {
			arqCont.readDir(dirwin);
			arqCont.createFile(path, nome);
			arqCont.readFile(path, nome);
			arqCont.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
