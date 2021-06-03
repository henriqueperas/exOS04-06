package view;

import java.io.IOException;

import controller.ControllerA;
import controller.ControllerI;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControllerI arqCont = new ControllerA();
		String path = "C:\\TEMP";
		String name = "generic_food.csv";
		
		try {
			arqCont.readFile(path, name);
			arqCont.separacao();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
