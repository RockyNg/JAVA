package rocky;

import javax.swing.JFrame;

public class Control {

	
	public static void main(String[] args) {
		
		readfile data = new readfile();
		data.openfile();
		data.readFile();
		data.closeFile();

	
		gui go = new gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300,200);
		go.setVisible(true);
		 
		
		
	}
}
