/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main extends javax.swing.JFrame {

  /** Creates new form Main */
  public Main() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jDesktopPane1 = new javax.swing.JDesktopPane();
    jDesktopPane1.setName("desktopPane");
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenuBar1.setName("menuBar");
    jMenu1 = new javax.swing.JMenu();
    jMenu1.setName("customerMenu");
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem1.setName("addCustomerMenuItem");
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenuItem2.setName("searchCustomerMenuItem");
    jMenu2 = new javax.swing.JMenu();
    jMenu2.setName("ticketsMenu");
    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuItem3.setName("bookTicketMenuItem");
    jMenuItem6 = new javax.swing.JMenuItem();
    jMenuItem6.setName("ticketReportMenuItem");
    jMenu3 = new javax.swing.JMenu();
    jMenu3.setName("flightMenu");
    jMenuItem4 = new javax.swing.JMenuItem();
    jMenuItem4.setName("addFlightMenuItem");
    jMenu4 = new javax.swing.JMenu();
    jMenu4.setName("userMenu");
    jMenuItem5 = new javax.swing.JMenuItem();
    jMenuItem5.setName("userCreationMenuItem");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1366, 768));

    javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
    jDesktopPane1.setLayout(jDesktopPane1Layout);
    jDesktopPane1Layout.setHorizontalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE));
    jDesktopPane1Layout.setVerticalGroup(
        jDesktopPane1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE));

    jMenu1.setText("Customer");

    jMenuItem1.setText("Add Customer");
    jMenuItem1.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
          }
        });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setText("Search Customer");
    jMenuItem2.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
          }
        });
    jMenu1.add(jMenuItem2);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Tickets");

    jMenuItem3.setText("Book Ticket");
    jMenuItem3.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
          }
        });
    jMenu2.add(jMenuItem3);

    jMenuItem6.setText("Ticket Report");
    jMenuItem6.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
          }
        });
    jMenu2.add(jMenuItem6);

    jMenuBar1.add(jMenu2);

    jMenu3.setText("Flight");

    jMenuItem4.setText("Add Flight");
    jMenuItem4.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
          }
        });
    jMenu3.add(jMenuItem4);

    jMenuBar1.add(jMenu3);

    jMenu4.setText("User");

    jMenuItem5.setText("UserCreation");
    jMenuItem5.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
          }
        });
    jMenu4.add(jMenuItem5);

    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jMenuItem1ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem1ActionPerformed
    // TODO add your handling code here:

    addCustomer cus = new addCustomer();
    jDesktopPane1.add(cus);
    cus.setVisible(true);
  } // GEN-LAST:event_jMenuItem1ActionPerformed

  private void jMenuItem2ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem2ActionPerformed
    // TODO add your handling code here:

    searchCustomer scus = new searchCustomer();
    jDesktopPane1.add(scus);
    scus.setVisible(true);
  } // GEN-LAST:event_jMenuItem2ActionPerformed

  private void jMenuItem4ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem4ActionPerformed
    // TODO add your handling code here:
    addflight f = new addflight();
    jDesktopPane1.add(f);
    f.setVisible(true);
  } // GEN-LAST:event_jMenuItem4ActionPerformed

  private void jMenuItem3ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem3ActionPerformed
    // TODO add your handling code here:
    ticket t = new ticket();
    jDesktopPane1.add(t);
    t.setVisible(true);
  } // GEN-LAST:event_jMenuItem3ActionPerformed

  private void jMenuItem6ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem6ActionPerformed
    // TODO add your handling code here:

    ticketreport ti = new ticketreport();
    jDesktopPane1.add(ti);
    ti.setVisible(true);
  } // GEN-LAST:event_jMenuItem6ActionPerformed

  private void jMenuItem5ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jMenuItem5ActionPerformed
    // TODO add your handling code here:

    userCreation u = new userCreation();
    jDesktopPane1.add(u);
    u.setVisible(true);
  } // GEN-LAST:event_jMenuItem5ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane jDesktopPane1;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JMenuItem jMenuItem4;
  private javax.swing.JMenuItem jMenuItem5;
  private javax.swing.JMenuItem jMenuItem6;
  // End of variables declaration//GEN-END:variables
}
