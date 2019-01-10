package aplicacao;

import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		
		DrawPanel painel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(painel);
		application.setSize(250, 250);
		application.setVisible(true);
	}

}
