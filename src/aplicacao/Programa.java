package aplicacao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Programa {          // Usuario escolhe a forma desejada e o programa exibe na tela(Circulos e Retangulos).

	public static void main(String[] args) {
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Qual op��o deseja:\n"
				+ "1 - Retangulos\n2 - Circulos"));
		
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}

}
