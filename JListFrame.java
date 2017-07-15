import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
public class MultipleSelectionFrame extends JFrame
{
private JList colorJList; // list to hold color names
private JList copyJList; // list to copy color names into
private JButton copyJButton; // button to copy selected names
private static final String[] colorNames = { "Black", "Blue", "Cyan",
"Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
"Pink", "Red", "White", "Yellow" };

	public MultipleSelectionFrame(){
		super("MultipleSelectionFrame");
		setLayout(new FlowLayout());
		colorJList = new colorJList(colorNames);
		colorJList.setVisibleRow(5);
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));

		copyJButton = new copyJButton("Copy>>");
		copyJButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				copyJList.setListData(colorJList.getSelectedValues());
			}
		});
		add(copyJButton);
		copyJList = new JList();
		copyJList.setVisibleRow(5);
		copyJList.setFixedCellWidth(100);
		copyJList.setFixedCellHeight(15);
		copyJList.setSelectionMode(SINGLE_INTERVAL_SELECTION);

		add(new JScrollPane(copyJList));

	}
}
