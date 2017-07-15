import javax.swing.*;
import java.awt.events.*;
import java.awt.*;

public class Addition extends JFrame{
	JLabel label1;
	JLabel label2;

	JText text1;
	JText text2;

	JButton button;

	public Addition(){
		label1 = new JLabel("First Number:");
		label2 = new JLabel("Second Number:");

		text1 = new JText(20);
		text2 = new JText(20);

		button = new JButton("+");

		add(label1);
		add(label2);
		add(text1);
		add(text2);
		add(button);

		int sum = Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText());

		button.addActionListner(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "The sum is: "+sum +"Sum of two Integers", JOptionPane.PAIN_MESSAGE);
			}
		});


	}
}

public class AdditionTest{
	publc static void main(String[] args){
		Addition add = new Addition();
		add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setSize(400, 200);
		add.setVisible(true);
	}
}
