package taskmanager;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Kathleen Tran
 */
public class TaskManagerGUI extends javax.swing.JFrame {
    
    private final List taskManager;
    
    
    /**
     * Creates new form TaskManagerGUI
     */
    public TaskManagerGUI() {
        taskManager = new List();
        initComponents();
        
        taskManager.loadAccounts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLoginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        toDoLabel = new javax.swing.JLabel();
        inProgressLabel = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        undoDeletionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        toDoList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        inProgressList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        doneList = new javax.swing.JList();
        moveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addTaskButton = new javax.swing.JButton();
        targetTaskField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLoginLabel.setText("USER LOGIN");

        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("Username");

        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("Password");

        passwordField.setText("jPasswordField1");

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        toDoLabel.setText("TO DO");

        inProgressLabel.setText("IN PROGRESS");

        doneLabel.setText("DONE");

        quitButton.setText("QUIT");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        usernameField.setText("Enter username here");

        undoDeletionButton.setText("UNDO REMOVAL");
        undoDeletionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoDeletionButtonActionPerformed(evt);
            }
        });

        toDoList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        toDoList.setSelectionBackground(new java.awt.Color(204, 204, 255));
        toDoList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toDoListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(toDoList);

        inProgressList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inProgressList.setSelectionBackground(new java.awt.Color(204, 204, 255));
        inProgressList.setVisibleRowCount(20);
        inProgressList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inProgressListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inProgressList);

        doneList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        doneList.setSelectionBackground(new java.awt.Color(204, 204, 255));
        doneList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(doneList);

        moveButton.setText("UPDATE");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("REMOVE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addTaskButton.setText("ADD NEW TASK");
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        targetTaskField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                targetTaskFieldMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to The Task Manager!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(userLoginLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabel)
                                    .addComponent(usernameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField)
                                    .addComponent(usernameField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toDoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(inProgressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(doneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(undoDeletionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quitButton))
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(targetTaskField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userLoginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton)
                            .addComponent(logoutButton)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDoLabel)
                    .addComponent(inProgressLabel)
                    .addComponent(doneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(targetTaskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addTaskButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(undoDeletionButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(saveButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        usernameField.setText("");
        passwordField.setText("");
        targetTaskField.setText("");
        
        DefaultListModel taskList = new DefaultListModel();
        taskList.addElement("");

        toDoList.setModel(taskList);
        inProgressList.setModel(taskList);
        doneList.setModel(taskList);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        taskManager.save();
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (taskManager.save())
            JOptionPane.showMessageDialog(null, "Tasks successfully saved!",
                                          "Save",
                                          JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Tasks failed to save!",
                                          "Unexpected Error",
                                          JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
//        taskManager.displayAll();
        
        if (taskManager.validLogin(username, password)) {
            taskManager.setHead(taskManager.selectAccount(username));

            displayUpdatedTaskList();
        }
        else if(username.equals("") && password.equals(""))
            JOptionPane.showMessageDialog(null, "Please enter your username and password!",
                                          "Missing Text Fields Warning",
                                          JOptionPane.WARNING_MESSAGE);
        else if (password.equals(""))
            JOptionPane.showMessageDialog(null, "Please enter your password!",
                                          "Missing Password Warning",
                                          JOptionPane.WARNING_MESSAGE);
        else if (username.equals("")) 
            JOptionPane.showMessageDialog(null, "Please enter your username!",
                                          "Missing Username Warning",
                                          JOptionPane.WARNING_MESSAGE);    
        else
            JOptionPane.showMessageDialog(null, "Account not found!",
                                          "Invalid Account Warning",
                                          JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_loginButtonActionPerformed
    
    private void undoDeletionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoDeletionButtonActionPerformed
        if (notLoggedIn())
            return;
        
        if (taskManager.getHead().getDone().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No removals to undo!",
                                          "No Recent Removals Warning",
                                          JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (taskManager.getHead().getToDo().validTask(taskManager.getHead().getDone().mostRecentlyDeleted()) ||
                 taskManager.getHead().getInProg().validTask(taskManager.getHead().getDone().mostRecentlyDeleted())) {
            duplicateTaskErrorMessage();
            return;
        }
            
        taskManager.getHead().undoDeletion();
        displayUpdatedTaskList();
    }//GEN-LAST:event_undoDeletionButtonActionPerformed
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (notLoggedIn() || noTargetTask())
            return;
        
        String task = targetTaskField.getText();
        
        boolean result = taskManager.getHead().deleteTask(task);
        if (result) {
            displayUpdatedTaskList();
        }
        else if (result == false && taskManager.getHead().getToDo().validTask(task)
                                 || taskManager.getHead().getInProg().validTask(task))
            JOptionPane.showMessageDialog(null, "Task may not be removed until completed!",
                                          "Uncompleted Task Warning",
                                          JOptionPane.WARNING_MESSAGE);
        else
            missingTaskErrorMessage();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        if (notLoggedIn() || noTargetTask())
            return;
        
        int result = taskManager.getHead().moveTask(targetTaskField.getText());

        if (result == 0)
            missingTaskErrorMessage();
        else if (result == 1)
            duplicateTaskErrorMessage();
        
        displayUpdatedTaskList();
    }//GEN-LAST:event_moveButtonActionPerformed

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        if (notLoggedIn() || noTargetTask())
            return;
        
        if (taskManager.getHead().getToDo().validTask(targetTaskField.getText())) {
            duplicateTaskErrorMessage();
            return;
        }
            
        if (taskManager.addTask(taskManager.getHead().getUsername(), 1, targetTaskField.getText()))
            updateTaskList(1);
        else
            duplicateTaskErrorMessage();
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void targetTaskFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetTaskFieldMouseClicked
       targetTaskField.setText("");
    }//GEN-LAST:event_targetTaskFieldMouseClicked

    private void toDoListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDoListMouseClicked
        getTargetTaskFromList(evt);
    }//GEN-LAST:event_toDoListMouseClicked

    private void inProgressListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inProgressListMouseClicked
        getTargetTaskFromList(evt);
    }//GEN-LAST:event_inProgressListMouseClicked

    private void doneListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneListMouseClicked
        getTargetTaskFromList(evt);
    }//GEN-LAST:event_doneListMouseClicked
    
    
    
    /**
     * Method to send selected task to target box for easy selection
     */
    private void getTargetTaskFromList(java.awt.event.MouseEvent evt) {
        JList list = (JList)evt.getSource();
        targetTaskField.setText(list.getSelectedValue().toString());
    }
    
    
    
    /**
     * Wrapper method to display all task lists
     */
    private void displayUpdatedTaskList() {
        try {
            for (int i = 1; i < 4; ++i)
                updateTaskList(i);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.getStackTrace();
        }
    }
    
    
    
    /**
     * Method to display a single task list
     * @param list 
     */
    private void updateTaskList(int list) {
        DefaultListModel taskList = new DefaultListModel();

        Iterator i;
        switch (list) {
            case 1:
                Set toDoSet = taskManager.getHead().getToDo().getListContainer().entrySet();
                i = toDoSet.iterator();  
                break;
            case 2:
                Set inProgSet = taskManager.getHead().getInProg().getListContainer().entrySet();
                i = inProgSet.iterator();
                break;
            case 3:
                Set doneSet = taskManager.getHead().getDone().getListContainer().entrySet();
                i = doneSet.iterator();
                break;
            default:
                return;
        }
        
        while (i.hasNext()) {
            Map.Entry task = (Map.Entry) i.next();
            taskList.addElement(task.getValue());
        }
        
        if (list == 1)
            toDoList.setModel(taskList);
        else if (list == 2)
            inProgressList.setModel(taskList);
        else if (list == 3)
            doneList.setModel(taskList);
    }  
    
    
    
    /**
     * Method to determine whether a user is "logged in" or not
     * @param username
     * @param password
     * @return false if username and password fields are empty
     *         and are not valid login credentials else false
     */
    private boolean notLoggedIn() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        if(taskManager.validLogin(username, password))
            return false;
        else {
            JOptionPane.showMessageDialog(null, "Please log into a valid account!",
                                          "Not Logged In Warning",
                                          JOptionPane.WARNING_MESSAGE);
            return true;
        }
    }
    
    
    
    /**
     * Method to check for empty string in task selection field
     * @return true if not empty else false
     */
    private boolean noTargetTask() {
        if(targetTaskField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a task!",
                                          "No Task Warning",
                                          JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    
    
    //Duplicate task error message
    private void duplicateTaskErrorMessage() {
        JOptionPane.showMessageDialog(null, "The task already exists!",
                                          "Duplicate Task Warning",
                                          JOptionPane.WARNING_MESSAGE);
    }
    
    
    
    //Missing task error message
    private void missingTaskErrorMessage() {
        JOptionPane.showMessageDialog(null, "Task cannot be found!",
                                          "Missing Task Warning",
                                          JOptionPane.ERROR_MESSAGE);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TaskManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManagerGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JList doneList;
    private javax.swing.JLabel inProgressLabel;
    private javax.swing.JList inProgressList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton moveButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField targetTaskField;
    private javax.swing.JLabel toDoLabel;
    private javax.swing.JList toDoList;
    private javax.swing.JButton undoDeletionButton;
    private javax.swing.JLabel userLoginLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}