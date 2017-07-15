import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BorderDemo extends JFrame implements ActionListener{

	private static final String[] names = {"Hide North", "Hide South",
											"Hide East", "Hide West", "Hide Center"};
	private JButton[] buttons;
	private BorderLayout layout;


	public BorderLayout(){
		super("BorderLayout Demo");
		layout = new BorderLayout(5,5);
		setLayout(layout);

		buttons = new JButton[names.length];

		for(int i = 0; i<names.length; i++){
			buttons[i] = new JButton[names[i]];
			buttons[i] = addActionListener(this);
		}

		add(button[0], BorderLayout.NORTH); 
		add(button[1], BorderLayout.WEST); 
		add(button[2], BorderLayout.EAST); 
		add(button[3], BorderLayout.WEST); 
		add(button[4], BorderLayout.CENTER); 

		public void actionPerformed(ActionEvent e){
			for(JButton button: buttons){
				if(e.getSource()==button){
					button.setVisible(false);
				}
				else
				button.setVisible(true);	
			}
			layout.layoutContainer(getContentPane());
		}
	}
}
