import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BorderDemo extends JFrame implements ActionListener{

	private static final String[] names = {"Hide North", "Hide South",
											"Hide East", "Hide West", "Hide Center"};
	private JButton[] buttons;
	private BorderLayout layout;


	public BorderDemo(){
		super("BorderLayout Demo");
		layout = new BorderLayout(2,2);
		setLayout(layout);

		buttons = new JButton[names.length];

		for(int i = 0; i<names.length; i++){
			buttons[i] = new JButton(names[i]);
			buttons[i].addActionListener(this);
		}

		add(buttons[0], BorderLayout.NORTH); 
		add(buttons[1], BorderLayout.SOUTH); 
		add(buttons[2], BorderLayout.EAST); 
		add(buttons[3], BorderLayout.WEST); 
		add(buttons[4], BorderLayout.CENTER); 
		}

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

