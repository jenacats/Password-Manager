import javax.swing.*;

public class UIDriver {
    public static void main(String [] args)
    {
        boolean USE_CROSS_PLATFORM_UI = true;
        if(USE_CROSS_PLATFORM_UI){
            try{
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        JFrame frame = new JFrame("Password Manager");
        frame.setSize(700, 500);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PasswordManagerPanel());
        frame.setVisible(true);
    }
}
