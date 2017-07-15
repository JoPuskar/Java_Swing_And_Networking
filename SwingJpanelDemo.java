import javax.swing.*;
import java.awt.*;

public class SwingJpanelDemo extends JFrame{
     JLabel labelUsername = new JLabel("Enter Username:");
     JLabel labelPassword = new JLabel("Enter Password:");
     JTextField textUsername = new JTextField(20);
     JPasswordField fieldPassword = new JPasswordField(20);
     JButton buttonLogin = new JButton("Login");

    public SwingJpanelDemo(){
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

        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);

        constraints.gridx = 0;
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
            }

            catch(Exception ex){
                ex.printStackTrace();

            }    
            SwingUtilities.invokeLater(new Runnable(){

                public void run(){
                    new SwingJpanelDemo().setVisible(true);
                }
            });

    }
}
