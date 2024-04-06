package ordering;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {

    
    public Signup() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstnameFIELD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        middlenameFIELD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastnameFIELD = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        addressFIELD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailFIELD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordFIELD = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        confirmpassFIELD = new javax.swing.JPasswordField();
        signupBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tologinBTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Register Account");

        firstnameFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstnameFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameFIELDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Firstname");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Middlename");

        middlenameFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middlenameFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameFIELDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Lastname");

        lastnameFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastnameFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameFIELDActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        addressFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFIELDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email");

        emailFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFIELDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Password");

        passwordFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFIELDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Confirm Password");

        confirmpassFIELD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmpassFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassFIELDActionPerformed(evt);
            }
        });

        signupBTN.setBackground(new java.awt.Color(0, 0, 51));
        signupBTN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        signupBTN.setForeground(new java.awt.Color(255, 255, 255));
        signupBTN.setText("SIGN UP");
        signupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBTNActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(0, 0, 51));
        clearBTN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setText("CLEAR");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                            .addComponent(signupBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(confirmpassFIELD)
                                        .addComponent(passwordFIELD)
                                        .addComponent(emailFIELD)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2)
                                                .addComponent(firstnameFIELD)
                                                .addComponent(jLabel3)
                                                .addComponent(middlenameFIELD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addComponent(lastnameFIELD, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addComponent(addressFIELD))))
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstnameFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middlenameFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastnameFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpassFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        tologinBTN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tologinBTN.setText("Already have an account?");
        tologinBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tologinBTNActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EASYPC");

        jLabel12.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Build, Upgrade, Conquer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addComponent(tologinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tologinBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFIELDActionPerformed

    private void middlenameFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameFIELDActionPerformed

    private void lastnameFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFIELDActionPerformed

    private void signupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBTNActionPerformed
        // TODO add your handling code here:
        String firstName = firstnameFIELD.getText();
        String middleName = middlenameFIELD.getText();
        String lastName = lastnameFIELD.getText();
        String address = addressFIELD.getText();
        String email = emailFIELD.getText();
        String password = new String(passwordFIELD.getPassword());
        String confirmPassword = new String(confirmpassFIELD.getPassword());
        String selectedGender = (String) gender.getSelectedItem();

        // check if there is a field that is empty
        if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check if the email contains '@'
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Invalid email address. Please enter a valid email.", "Invalid Email", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // check if password matches the confirm password
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please re-enter your password.", "Password Mismatch", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // convert gender to 'M' or 'F' for storing to db
        char genderCode;
        if ("Male".equalsIgnoreCase(selectedGender)) {
            genderCode = 'M';
        } else if ("Female".equalsIgnoreCase(selectedGender)) {
            genderCode = 'F';
        } else {
            JOptionPane.showMessageDialog(this, "Please select a gender.", "Gender Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // datbase connection
        Connection connection = DatabaseConnection.connect();

        if (connection != null) {
            try {
                // query for inserting data to tbl_customer
                String sql = "INSERT INTO tbl_customer (Customer_Firstname, Customer_Middlename, Customer_Lastname, Gender, Address, Email, Password) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                  
                    statement.setString(1, firstName);
                    statement.setString(2, middleName);
                    statement.setString(3, lastName);
                    statement.setString(4, String.valueOf(genderCode));
                    statement.setString(5, address);
                    statement.setString(6, email);
                    statement.setString(7, password);

                    statement.executeUpdate();

                    JOptionPane.showMessageDialog(this, "User registered successfully. You can now log in.", "Registration Success", JOptionPane.INFORMATION_MESSAGE);
                    // upon clicking sign up if sucessful, will redirect to login
                    LogIn loginWindow = new LogIn();
                    loginWindow.setVisible(true);
                    this.dispose();
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error registering user. Please try again later.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                DatabaseConnection.close(connection);
            }
        }
    
    }//GEN-LAST:event_signupBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        // TODO add your handling code here:
        firstnameFIELD.setText("");
        middlenameFIELD.setText("");
        lastnameFIELD.setText("");
        gender.setSelectedIndex(0);
        addressFIELD.setText("");
        emailFIELD.setText("");
        passwordFIELD.setText("");
        confirmpassFIELD.setText("");

        JOptionPane.showMessageDialog(this, "All fields are cleared.");
    }//GEN-LAST:event_clearBTNActionPerformed

    private void addressFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFIELDActionPerformed

    private void emailFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFIELDActionPerformed

    private void passwordFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFIELDActionPerformed

    private void confirmpassFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassFIELDActionPerformed

    private void tologinBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tologinBTNActionPerformed
        // TODO add your handling code here:
        LogIn loginWindow = new LogIn();
        loginWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tologinBTNActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFIELD;
    private javax.swing.JButton clearBTN;
    private javax.swing.JPasswordField confirmpassFIELD;
    private javax.swing.JTextField emailFIELD;
    private javax.swing.JTextField firstnameFIELD;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastnameFIELD;
    private javax.swing.JTextField middlenameFIELD;
    private javax.swing.JPasswordField passwordFIELD;
    private javax.swing.JButton signupBTN;
    private javax.swing.JButton tologinBTN;
    // End of variables declaration//GEN-END:variables
}
