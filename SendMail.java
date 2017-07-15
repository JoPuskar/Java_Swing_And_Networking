import javax.swing.*;
import java.awt.*;

public class SwingDemo extends Jframe{
    private Jlabel labelUsername = new Jlabel("Enter Username:");
    private Jlabel labelPassword = new Jlabel("Enter Password:");
    private JText textUsername = new JText(20);
    private JPasssword fieldPassword = new JPassswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public SwingJPanelDemo(){
        super("JPanel Demo Program");

        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        //add components to the panel 
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelUsername, constraints);

        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelPassword, constraints);

        constraints.gridx = 0;
        newPanel.add(fieldPassword, constraints);

        constraints.girdx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);

        //set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

        //add the panel to this frame
        add(newPanel);

        pack();
        setLocationRelativeTo(null);

    }
        public static void main(String[] args){
            //set look and feel to the system look and feel
            try{
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            catch(Exception ex){
                ex.printStackTrace();

            }    
            SwingUtilities.invokeLater(new Runnable(){

                public void run(){
                    new SwingJPanelDemo().setvisible(true);
                }
            });

    }
}
