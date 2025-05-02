package avpackage;

import javax.swing.JFrame;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
			
		int[] array = new int[400];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(550);
		}
		
		
		JFrame frame = new JFrame("Bubblesort Visualizer");
		SortPanel panel = new SortPanel(array);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(815, 610);
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		
		new Thread(() -> {
			try {
				bubbleSort(array, panel);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
	}
	
	private static void bubbleSort(int[] array, SortPanel panel) throws InterruptedException {
		int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    panel.repaint();

                    Thread.sleep(1);
                }
            }
        }
	}
	

}
