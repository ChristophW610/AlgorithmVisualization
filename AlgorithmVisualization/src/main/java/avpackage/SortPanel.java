package avpackage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SortPanel extends JPanel {
	
	private int[] array;
	
	public SortPanel(int[] array) {
		this.array = array;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		int barWidth = 2;
		
		for(int i = 0; i < array.length; i++) {
			int x = i*barWidth;
			int y = getHeight() - array[i];
			int height = array[i];
			g.fillRect(x, y, barWidth, height);
		}
	}
	
}
