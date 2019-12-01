import java.awt.*;
import java.io.IOException;

/**
 *
 * @author Minhvy Van, Mohammed Shahabuddin,Wei-Chen Yen
 */
public class PasswordManagerPanel extends javax.swing.JFrame {

    /**
     * Creates new form PasswordManagerPanel
     */
    public PasswordManagerPanel() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        websiteTF = new javax.swing.JTextField();
        searchB = new javax.swing.JButton();
        addWebB = new javax.swing.JButton();
        homeTitle = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        userL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        makeQL = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        passTF = new javax.swing.JTextField();
        q1TF = new javax.swing.JTextField();
        addTitle = new javax.swing.JLabel();
        urlL = new javax.swing.JLabel();
        webNameL = new javax.swing.JLabel();
        webNameTF = new javax.swing.JTextField();
        urlTF = new javax.swing.JTextField();
        saveB = new javax.swing.JButton();
        makeAL = new javax.swing.JLabel();
        a1TF = new javax.swing.JTextField();
        backB = new javax.swing.JButton();
        qPanel = new javax.swing.JPanel();
        question1L = new javax.swing.JLabel();
        answer1TF = new javax.swing.JTextField();
        submitB = new javax.swing.JButton();
        aPanel = new javax.swing.JPanel();
        usernameL = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        websiteUrlL = new javax.swing.JLabel();
        websiteNL = new javax.swing.JLabel();
        homeB = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Manager");
//        addContainerListener(new java.awt.event.ContainerAdapter() {
//            public void componentAdded(java.awt.event.ContainerEvent evt) {
//                formComponentAdded(evt);
//            }
//        });

        parentPanel.setPreferredSize(new java.awt.Dimension(450, 290));
        parentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setPreferredSize(new java.awt.Dimension(450, 290));

        websiteTF.setText("WEBSITE NAME");

        searchB.setText("SEARCH");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    searchBActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (FileException e) {
                    e.printStackTrace();
                }
            }
        });

        addWebB.setText("ADD NEW WEBSITE");
        addWebB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWebBActionPerformed(evt);
            }
        });

        homeTitle.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        homeTitle.setForeground(new java.awt.Color(51, 0, 102));
        homeTitle.setText("PASSWORD MANAGER : CS 211");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(addWebB, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(homeTitle)
                                        .addGroup(homePanelLayout.createSequentialGroup()
                                                .addComponent(websiteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchB)))
                                .addGap(20, 20, 20))
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(homeTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(websiteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchB))
                                .addGap(99, 99, 99)
                                .addComponent(addWebB)
                                .addContainerGap())
        );

        parentPanel.add(homePanel, "homePanel");

        addPanel.setPreferredSize(new java.awt.Dimension(450, 290));

        userL.setText("USERNAME");

        passL.setText("PASSWORD");

        makeQL.setText("QUESTION");


        addTitle.setText("ADD NEW WEBSITE");

        urlL.setText("WEBSITE URL");

        webNameL.setText("WEBSITE NAME");

        saveB.setText("SAVE");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    saveBActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (FileException e) {
                    e.printStackTrace();
                }
            }
        });

        makeAL.setText("ANSWER");

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(urlL)
                                                        .addComponent(webNameL))
                                                .addGap(111, 111, 111)
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(urlTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                                .addComponent(webNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(passTF, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(addPanelLayout.createSequentialGroup()
                                                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(userL)
                                                                                .addComponent(passL))
                                                                        .addGap(346, 346, 346))
                                                                .addGroup(addPanelLayout.createSequentialGroup()
                                                                        .addComponent(addTitle)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(saveB)))
                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(makeAL)
                                                                        .addComponent(makeQL))
                                                                .addGap(78, 78, 78)
                                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(a1TF, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                                        .addComponent(q1TF))))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(addPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backB)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
                addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(a1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(addPanelLayout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addComponent(addTitle)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(userL)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(passL)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(webNameL)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                                .addComponent(urlL)
                                                                .addGap(25, 25, 25))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(saveB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(webNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(urlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(q1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(makeQL))
                                                .addGap(11, 11, 11)
                                                .addComponent(makeAL)))
                                .addGap(18, 18, 18)
                                .addComponent(backB)
                                .addGap(12, 12, 12))
        );

        parentPanel.add(addPanel, "addPanel");

        qPanel.setPreferredSize(new java.awt.Dimension(450, 290));

        question1L.setText("Q1: ");

        answer1TF.setText("A1");

        submitB.setText("SUBMIT");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    submitBActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (FileException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout qPanelLayout = new javax.swing.GroupLayout(qPanel);
        qPanel.setLayout(qPanelLayout);
        qPanelLayout.setHorizontalGroup(
                qPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(qPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(question1L)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(answer1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                        .addGroup(qPanelLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(submitB)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        qPanelLayout.setVerticalGroup(
                qPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(qPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(qPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(question1L)
                                        .addComponent(answer1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addComponent(submitB)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        parentPanel.add(qPanel, "qPanel");

        aPanel.setPreferredSize(new java.awt.Dimension(450, 290));

        usernameL.setText("USERNAME:");

        passwordL.setText("PASSWORD:");

        websiteUrlL.setText("WEBSITE URL:");

        websiteNL.setText("WEBSITE NAME:");

        homeB.setText("Home");
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aPanelLayout = new javax.swing.GroupLayout(aPanel);
        aPanel.setLayout(aPanelLayout);
        aPanelLayout.setHorizontalGroup(
                aPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(aPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(aPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(websiteNL)
                                        .addComponent(websiteUrlL)
                                        .addComponent(passwordL)
                                        .addComponent(usernameL))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aPanelLayout.createSequentialGroup()
                                .addContainerGap(206, Short.MAX_VALUE)
                                .addComponent(homeB)
                                .addGap(163, 163, 163))
        );
        aPanelLayout.setVerticalGroup(
                aPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(aPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(websiteNL)
                                .addGap(12, 12, 12)
                                .addComponent(websiteUrlL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordL)
                                .addGap(18, 18, 18)
                                .addComponent(homeB)
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        parentPanel.add(aPanel, "aPanel");

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>


    /**
     * addWebsite button on the homePanel will direct to go to addPanel
     * @param evt
     */
    private void addWebBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        CardLayout card = (CardLayout)parentPanel.getLayout();
        card.show(parentPanel, "addPanel");
    }

    /**
     * save button on the addPanel checks if all fields are answered, and will save the website by creating a new text fila
     * @param evt
     * @throws IOException
     * @throws FileException
     */
    private void saveBActionPerformed(java.awt.event.ActionEvent evt) throws IOException, FileException {
        // TODO add your handling code here:
        boolean check = true;
        //check if all required text files are filled in & create a new website object
        //if required are not full, then check = false & will show ERROR
        //if "?" is not detected, then check = false & will show ERROR
        String name = webNameTF.getText();
        String url = urlTF.getText();
        String user = userTF.getText();
        String pass = passTF.getText();
        String question = q1TF.getText();
        String answer = a1TF.getText();
        if(name.equals("") || url.equals("") || user.equals("") || pass.equals("")|| question.equals("") || answer.equals(""))
            check=false;

        if(check)
        {
            FileHandler fHandler = new FileHandler("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Password_Manager");
            Website web = new Website(url, name, user, pass,question,answer);
            fHandler.addWebsite(web);

            //reset all colors & text fields

            userL.setForeground(Color.BLACK);
            urlL.setForeground(Color.BLACK);
            webNameL.setForeground(Color.BLACK);
            passL.setForeground(Color.BLACK);
            makeQL.setForeground(Color.BLACK);
            makeAL.setForeground(Color.BLACK);

            userTF.setText("");
            urlTF.setText("");
            webNameTF.setText("");
            passTF.setText("");
            q1TF.setText("");
            a1TF.setText("");
            //change card
            CardLayout card = (CardLayout)parentPanel.getLayout();
            card.show(parentPanel, "homePanel");
        }
        else
        {
            if(name.equals(""))
            {
                webNameL.setForeground(Color.RED);
            }
            if(url.equals("")) {
                urlL.setForeground(Color.RED);
            }
            if(user.equals(""))
            {
                userL.setForeground(Color.RED);
            }
            if(pass.equals(""))
            {
                passL.setForeground(Color.RED);
            }
            if(question.equals(""))
            {
                makeQL.setForeground(Color.RED);
            }
            if(answer.equals(""))
            {
                makeAL.setForeground(Color.RED);
            }
        }

    }

    /**
     * submit button will check if the asnwer to the question is correct, if true then will take the user to aPanel
     * @param evt
     * @throws IOException
     * @throws FileException
     */
    private void submitBActionPerformed(java.awt.event.ActionEvent evt) throws IOException, FileException {
        // TODO add your handling code here:
        FileHandler fHandler = new FileHandler("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Password_Manager");
        String answer = fHandler.getAnswer(websiteTF.getText());
        boolean check = true;
        System.out.println("ASDAD");
        if (!answer1TF.getText().toLowerCase().equals(answer)){ // checks whether the user answered the question correctly
            check = false;
            System.out.println(answer1TF.getText());
        }
        //question is answered correctly, then go to answer panel & change labels
        //if question does not exist, then if left blank: is correct
        if(check)
        {
            String [] data = fHandler.readWebsite(websiteTF.getText()); // gets an array with website data
            websiteNL.setText(websiteNL.getText() + data[0]);
            websiteUrlL.setText(websiteUrlL.getText() + data[1]);
            usernameL.setText(usernameL.getText() + data[2]);
            passwordL.setText(passwordL.getText() + data[3]);

            question1L.setForeground(Color.BLACK);

            CardLayout card = (CardLayout)parentPanel.getLayout();
            card.show(parentPanel, "aPanel");
        }
        else
        {
            question1L.setForeground(Color.RED);
        }
    }

    /**
     * search button will search if website written in websiteTF exists, if true then change to qPanel
     * @param evt
     * @throws IOException
     * @throws FileException
     */
    private void searchBActionPerformed(java.awt.event.ActionEvent evt) throws IOException, FileException {
        // TODO add your handling code here:
        //if website is found in textfile, then change question1L, question2L, question3L
        //if website is not found, then "Error: Website does not exist"
        //if website is found, then go to question panel
        FileHandler fHandler = new FileHandler("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Password_Manager");
        boolean check = fHandler.checkWebsite(websiteTF.getText()); // checks if website exists


        if(check)
        {
            question1L.setText("Q1: " + fHandler.getQuestion(websiteTF.getText())); // sets question 1 label to the question it gets from the text file

            CardLayout card = (CardLayout)parentPanel.getLayout();
            card.show(parentPanel, "qPanel");
        }
    }

    /**
     * back button on aPanel will direct to the home screen
     * @param evt
     */
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        userL.setForeground(Color.BLACK);
        urlL.setForeground(Color.BLACK);
        webNameL.setForeground(Color.BLACK);
        passL.setForeground(Color.BLACK);
        makeQL.setForeground(Color.BLACK);
        makeAL.setForeground(Color.BLACK);

        userTF.setText("");
        urlTF.setText("");
        webNameTF.setText("");
        passTF.setText("");
        q1TF.setText("");
        a1TF.setText("");

        CardLayout card = (CardLayout)parentPanel.getLayout();
        card.show(parentPanel, "homePanel");
    }

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        websiteNL.setText("");
        websiteUrlL.setText("");
        usernameL.setText("");
        passwordL.setText("");

        question1L.setText("");

        CardLayout card = (CardLayout)parentPanel.getLayout();
        card.show(parentPanel, "homePanel");
    }
    /**
     * creates a new directory
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordManagerPanel().setVisible(true);
            }
        });

        String path = "C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\"; // path of where passwordmanager folder will be located
        FileHandler fHandler = new FileHandler();
        fHandler.createDirectory(path); // if there is no folder named "Password_Manager" at location then it will create one, if there is already one then it should do nothing
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField a1TF;
    private javax.swing.JPanel aPanel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel addTitle;
    private javax.swing.JButton addWebB;
    private javax.swing.JTextField answer1TF;
    private javax.swing.JButton backB;
    private javax.swing.JButton homeB;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel makeAL;
    private javax.swing.JLabel makeQL;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel passL;
    private javax.swing.JTextField passTF;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField q1TF;
    private javax.swing.JPanel qPanel;
    private javax.swing.JLabel question1L;
    private javax.swing.JButton saveB;
    private javax.swing.JButton searchB;
    private javax.swing.JButton submitB;
    private javax.swing.JLabel urlL;
    private javax.swing.JTextField urlTF;
    private javax.swing.JLabel userL;
    private javax.swing.JTextField userTF;
    private javax.swing.JLabel usernameL;
    private javax.swing.JLabel webNameL;
    private javax.swing.JTextField webNameTF;
    private javax.swing.JLabel websiteNL;
    private javax.swing.JTextField websiteTF;
    private javax.swing.JLabel websiteUrlL;
    // End of variables declaration
}
