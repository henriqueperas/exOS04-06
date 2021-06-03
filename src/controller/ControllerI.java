package controller;

import java.io.IOException;

public interface ControllerI {

	public void readFile(String path, String name) throws IOException;
	public void separacao() throws IOException;
	
}
