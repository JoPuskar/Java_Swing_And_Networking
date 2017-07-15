import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class Addition extends JFrame{
	JLabel label1;
	JLabel label2;

	JTextField text1;
	JTextField text2;

	JButton button;

	public Addition(){
		super("Addition Test");
		setLayout( new FlowLayout() );

		label1 = new JLabel("First Number:");
		label2 = new JLabel("Second Number:");

		text1 = new JTextField(20);
		text2 = new JTextField(20);

		button = new JButton("+");

		add(label1);
		add(label2);
		add(text1);
		add(text2);
		add(button);

		EventHandler handler = new EventHandler();
		button.addActionListener(handler);
	}

		private class EventHandler implements ActionListener{
			public void actionPerformed(ActionEvent e){

				int sum = (Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText()));
				JOptionPane.showMessageDialog(null,"The sum is:"+sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
			}
		}
}

public class AdditionTest{
	public static void main(String[] args){
		Addition add = new Addition();
		add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setSize(400, 200);
		add.setVisible(true);
	}
}
