/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysqlcrud;
import Conn.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author retsa
 */
public class MySQLCRUD extends javax.swing.JFrame {
    
    private DefaultTableModel DftTblModelCourse;
    private String SQL;
    
    public void ShowData() {
        DftTblModelCourse = new DefaultTableModel();
        DftTblModelCourse.addColumn("course_name");
        DftTblModelCourse.addColumn("course_number");
        DftTblModelCourse.addColumn("enrollment");
        DftTblModelCourse.addColumn("start_date");
        DftTblModelCourse.addColumn("end_date");
        jTableCourses.setModel(DftTblModelCourse);
        Connection conn = Conn.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "SELECT * FROM courses";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModelCourse.addRow(new Object[]{
                    res.getString("course_name"),
                    res.getString("course_number"),
                    res.getString("enrollment"),
                    res.getString("start_date"),
                    res.getString("end_date"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       
    
    public MySQLCRUD() {
        initComponents();
        this.ShowData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField_id = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourses = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldCourseName = new javax.swing.JTextField();
        jTextFieldCourseNumber = new javax.swing.JTextField();
        jLabelCourseNameLabel = new javax.swing.JLabel();
        jLabelCourseNumberLabel = new javax.swing.JLabel();
        jLabelEndDateLabel = new javax.swing.JLabel();
        jTextFieldEndDate = new javax.swing.JTextField();
        jLabelStartDateLabel = new javax.swing.JLabel();
        jTextFieldStartDate = new javax.swing.JTextField();
        jLabelEnrollmentLabel = new javax.swing.JLabel();
        jTextFieldEnrollment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        jLabelTitle.setText("DAFTAR JENIS KURSUS");

        jTableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCoursesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCourses);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelCourseNameLabel.setText("Course Name");

        jLabelCourseNumberLabel.setText("Course Number");

        jLabelEndDateLabel.setText("End Date");

        jLabelStartDateLabel.setText("Start Date");

        jLabelEnrollmentLabel.setText("Enrollment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCourseNameLabel)
                            .addComponent(jLabelEndDateLabel)
                            .addComponent(jLabelStartDateLabel)
                            .addComponent(jLabelEnrollmentLabel)
                            .addComponent(jLabelCourseNumberLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButtonAdd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCourseNumber)
                            .addComponent(jTextFieldEnrollment)
                            .addComponent(jTextFieldEndDate)
                            .addComponent(jTextFieldCourseName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButtonDelete)
                                .addGap(56, 56, 56)
                                .addComponent(jButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldStartDate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCourseNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCourseNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEnrollmentLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStartDateLabel)
                    .addComponent(jTextFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEndDateLabel)
                    .addComponent(jTextFieldEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonAdd))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into courses(course_name, course_number, enrollment, start_date, end_date) values(?,?,?,?,?)");
            stmt.setString(1, jTextFieldCourseName.getText());
            stmt.setString(2, jTextFieldCourseNumber.getText());
            stmt.setString(3, jTextFieldEnrollment.getText());
            stmt.setString(4, jTextFieldStartDate.getText());
            stmt.setString(5, jTextFieldEndDate.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldCourseName.setText("");
            jTextFieldCourseNumber.setText("");
            jTextFieldEnrollment.setText("");
            jTextFieldStartDate.setText("");
            jTextFieldEndDate.setText("");
            jTextField_id.requestFocus();
            ShowData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }                                          

    private void jTableCoursesMouseClicked(java.awt.event.MouseEvent evt) {                                           

        int baris = jTableCourses.getSelectedRow();
        jTextField_id.setText(DftTblModelCourse.getValueAt(baris, 1).toString());
        jTextFieldCourseName.setText(DftTblModelCourse.getValueAt(baris, 0).toString());
        jTextFieldCourseNumber.setText(DftTblModelCourse.getValueAt(baris, 1).toString());
        jTextFieldEnrollment.setText(DftTblModelCourse.getValueAt(baris, 2).toString());
        jTextFieldStartDate.setText(DftTblModelCourse.getValueAt(baris, 3).toString());
        jTextFieldEndDate.setText(DftTblModelCourse.getValueAt(baris, 4).toString());
    }                                          

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        try {
            Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update courses set course_name=?, course_number=?, enrollment=?, start_date=?, end_date=? where course_number=?");
            stmt.setString(1, jTextFieldCourseName.getText());
            stmt.setString(2, jTextFieldCourseNumber.getText());
            stmt.setString(3, jTextFieldEnrollment.getText());
            stmt.setString(4, jTextFieldStartDate.getText());
            stmt.setString(5, jTextFieldEndDate.getText());
            stmt.setString(6, jTextField_id.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            ShowData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }                                             

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        Connection conn = Conn.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data kursus tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from courses where course_number ='" + jTextField_id.getText() + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                ShowData();
                jTextFieldCourseName.setText("");
                jTextFieldCourseNumber.setText("");
                jTextFieldEnrollment.setText("");
                jTextFieldStartDate.setText("");
                jTextFieldEndDate.setText("");
                jTextField_id.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }

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
            java.util.logging.Logger.getLogger(MySQLCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MySQLCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MySQLCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MySQLCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MySQLCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCourseNameLabel;
    private javax.swing.JLabel jLabelCourseNumberLabel;
    private javax.swing.JLabel jLabelEndDateLabel;
    private javax.swing.JLabel jLabelEnrollmentLabel;
    private javax.swing.JLabel jLabelStartDateLabel;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCourses;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JTextField jTextFieldCourseNumber;
    private javax.swing.JTextField jTextFieldEndDate;
    private javax.swing.JTextField jTextFieldEnrollment;
    private javax.swing.JTextField jTextFieldStartDate;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration                   
    
}
