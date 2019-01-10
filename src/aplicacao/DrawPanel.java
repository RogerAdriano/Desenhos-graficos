
package aplicacao;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	// Desenha um X na tela
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int width = getWidth();  // Utiliza os metodos get herdados da super classe.
		int height = getHeight();
		
		g.drawLine(0, 0, width, height); // Desenha uma linha do canto superior esquerdo ao canto inferior direito.
		
		g.drawLine(0, height, width, 0); // Desenha uma linha do canto inferior esquerdo ao canto superior direito.
	}
}
