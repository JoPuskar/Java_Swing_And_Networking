import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TopLevelDemo{
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("TopLevelDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(154, 165, 127));
		greenMenuBar.setPreferredSize(new Dimension(200, 20));

		JLabel ylabel = new JLabel();
		ylabel.setOpaque(true);
		ylabel.setBackground(new Color(248, 213, 131));
		ylabel.setPreferredSize(new Dimension(200, 180));

		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(ylabel, BorderLayout.CENTER);

		JPanel contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);

	}
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});	
	}

}