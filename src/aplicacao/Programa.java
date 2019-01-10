package aplicacao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja:\n"
				+ "1 - Retangulos\n2 - Circulos"));
		
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}

}
