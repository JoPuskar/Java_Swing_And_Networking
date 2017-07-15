import javax.swing.*;
import java.awt.event.ListSelectionEvent;
import java.awt.event.ListSelectionListener;
import java.awt.ListselectionModel;

public class JListFrame extends JListFrame{

	private static final JList colorList;
	private static final String[] colorNames = {"Black", "Blue", "Cyan",
												"Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
												"Orange", "Pink", "Red", "White", "Yellow" };


	private static final Color[] colors = {Color.BLACK, Color.BLUE,
											Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
											Color.RED, Color.WHITE, Color.YELLOW};

	public JListFrame(){

		super("JList Testing ");
		setLayout(new FlowLayout());
		colorList = new colorList(colorNames);
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		colorList.setVisibleRowCount(5);

		add(new JScrollPane(colorList));

		colorList.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				getContentPane().setBackground(color[colorList.getSelectedIndex()]);
			}
		});

	}
}

import javax.swing.JFrame;
public class JListTest extends JFrame{
	public static void main(String[] args){
		JListFrame jlf = new JListFrame();
		jlf.setDefaultColseOperation(JFrame.EXIT_ON_CLOSE);
		jlf.setSize(400, 200);
		jlf.setVisible(true);
	}
}