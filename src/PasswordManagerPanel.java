import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordManagerPanel extends JPanel {
      private JLabel label;
    private JButton enterButton;
    private JButton exitButton;
    private JTextField input;


    private JPanel eastPanel;
    private JPanel westPanel;
    private JPanel northPanel;

    public PasswordManagerPanel()
    {
        setLayout(new BorderLayout());
        label = new JLabel("Password Manager: CS 211");
        label.setForeground(new Color(51, 0, 102));
        label.setFont(new Font("Sans-serif", Font.BOLD, 40));

        add(label, BorderLayout.NORTH);
        label.setHorizontalAlignment(SwingConstants.LEFT);

        eastPanel = new JPanel(new FlowLayout());
        add(eastPanel, BorderLayout.EAST);
        westPanel= new JPanel(new FlowLayout());
        add(westPanel, BorderLayout.WEST);
        northPanel = new JPanel(new FlowLayout());
        //add(westPanel, BorderLayout.NORTH);

        //northPanel.add(label);

        enterButton = new JButton ("OK");
        enterButton.addActionListener(new searchListener());
        eastPanel.add(enterButton);

        input = new JTextField("WEBSITE NAME", 10);;
        westPanel.add(input);

        exitButton = new JButton("EXIT");
        exitButton.addActionListener(new exitListener());

        add(exitButton, BorderLayout.SOUTH);
        //label.setHorizontalAlignment(SwingConstants.RIGHT);

    }
    private class searchListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String s = input.getText();
        }
    }

    private class exitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
