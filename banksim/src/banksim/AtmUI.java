package banksim;

import java.util.List;
//import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class AtmUI extends javax.swing.JFrame {

    private AtmAsController controller;

    public AtmUI(Bank bank, String lokasi) {
        controller = new AtmAsController(bank, lokasi);
        initComponents();

    }

    public AtmAsController getController() {
        return controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        info_display = new javax.swing.JTextArea();
        login_btn = new javax.swing.JButton();
        saldo_btn = new javax.swing.JButton();
        tarik_btn = new javax.swing.JButton();
        setor_btn = new javax.swing.JButton();
        transfer_btn = new javax.swing.JButton();
        log_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        allrek_btn = new javax.swing.JButton();
        register_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info_display.setColumns(20);
        info_display.setRows(5);
        jScrollPane1.setViewportView(info_display);

        login_btn.setText("LOGIN");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        saldo_btn.setText("Saldo");
        saldo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo_btnActionPerformed(evt);
            }
        });

        tarik_btn.setText("Tarik");
        tarik_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarik_btnActionPerformed(evt);
            }
        });

        setor_btn.setText("Setor");
        setor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setor_btnActionPerformed(evt);
            }
        });

        transfer_btn.setText("Transfer");
        transfer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_btnActionPerformed(evt);
            }
        });

        log_btn.setText("Log");
        log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        allrek_btn.setText("All Rekening");
        allrek_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allrek_btnActionPerformed(evt);
            }
        });

        register_btn.setText("Register");
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allrek_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(register_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allrek_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_btn)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(log_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tarik_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setor_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transfer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(saldo_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarik_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setor_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transfer_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed

        if (evt.getActionCommand().equals("LOGIN")) {

            JPasswordField pwd = new JPasswordField();
            pwd.setEchoChar('*');

            int pin = JOptionPane.showConfirmDialog(this, pwd, "PIN", JOptionPane.OK_CANCEL_OPTION);

            if (controller.login(new String(pwd.getPassword()))) {
                info_display.append("\n" + controller.getRekeningAktifAsModel().getNasabahName() + " Welcome, \n" + controller.getBank().getName());
                info_display.append(" " + controller.getLokasi());
                info_display.append("\n" + Log.getTime());
                info_display.append("\n________________________");
                login_btn.setText("LOGOUT");
            } else {
                JOptionPane.showMessageDialog(this, "WRONG PIN", "TRY AGAIN", JOptionPane.WARNING_MESSAGE);
            }

        }

        if (evt.getActionCommand().equals("LOGOUT")) {
            info_display.setText("");
            controller.logOut();
            login_btn.setText("LOGIN");
        }

    }//GEN-LAST:event_login_btnActionPerformed

    private void transfer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_btnActionPerformed

        String noRekTujuan = JOptionPane.showInputDialog(this, "No. Rekening Tujuan");
        Rekening rekTujuan = null;

        if (controller.getBank().findRekeningById(noRekTujuan) == null) {
            JOptionPane.showMessageDialog(this, "Rekening Tidak Ditemukan", "!", JOptionPane.WARNING_MESSAGE);
        } else {
            rekTujuan = controller.getBank().findRekeningById(noRekTujuan);
            double jumlah = Integer.parseInt(JOptionPane.showInputDialog(this, "Jumlah"));
            controller.transfer(jumlah, rekTujuan);
            info_display.append("\n Transfer Rp " + jumlah + "Ke " + noRekTujuan + " " + controller.getBank().findRekeningById(noRekTujuan).getNasabahName() + " Berhasil");

            controller.getRekeningAktifAsModel().addLogTransaction(Log.addLog("CREDIT", jumlah, controller.getRekeningAktifAsModel().getSaldo()));

            rekTujuan.addLogTransaction(Log.addLog("DEBIT", jumlah, rekTujuan.getSaldo()));
        }

    }//GEN-LAST:event_transfer_btnActionPerformed

    private void saldo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo_btnActionPerformed

        info_display.append("\n Saldo Rp. " + controller.getRekeningAktifAsModel().getSaldo());

    }//GEN-LAST:event_saldo_btnActionPerformed

    private void tarik_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarik_btnActionPerformed

        double jumlah = Integer.parseInt(JOptionPane.showInputDialog(this, "Jumlah Penarikan"));
        info_display.append("\n Tarik Rp. " + jumlah + " Berhasil");
        controller.getRekeningAktifAsModel().tarik(jumlah);
        controller.getRekeningAktifAsModel().addLogTransaction(Log.addLog("CREDIT", jumlah, controller.getRekeningAktifAsModel().getSaldo()));

    }//GEN-LAST:event_tarik_btnActionPerformed

    private void setor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setor_btnActionPerformed

        double jumlah = Integer.parseInt(JOptionPane.showInputDialog(this, "Jumlah Setoran"));
        info_display.append("\n Setor Rp. " + jumlah + " Berhasil");
        controller.getRekeningAktifAsModel().setor(jumlah);
        controller.getRekeningAktifAsModel().addLogTransaction(Log.addLog("DEBIT", jumlah, controller.getRekeningAktifAsModel().getSaldo()));

    }//GEN-LAST:event_setor_btnActionPerformed

    private void log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btnActionPerformed

        info_display.append("\n ___ Log Transaction __");
        for (String log : controller.getRekeningAktifAsModel().getLogTransaction()) {
            info_display.append(log);
        }
        info_display.append("\n_______________________");

    }//GEN-LAST:event_log_btnActionPerformed

    private void allrek_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allrek_btnActionPerformed

        info_display.append("\n No. Rekening  |  Nama  | PIN  ");
        info_display.append("\n_________________________________");

        RekeningRepository rekrep = new RekeningRepository(controller.getBank());
        Iterator iter = rekrep.getIterator();

        while (iter.hasNext()) {

            Rekening rekening = iter.next();

            info_display.append("\n" + rekening.getRekeningID() + " " + rekening.getNasabahName() + " " + rekening.getPin());

        }

        info_display.append("\n_________________________________");

    }//GEN-LAST:event_allrek_btnActionPerformed

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed

        JDialog dialog = new RegisterRekening(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

    }//GEN-LAST:event_register_btnActionPerformed

    public static void main(String args[]) {

        Bank bank = new Bank("BNI");
        bank.registrasiNasabah(new Nasabah("REZKI TRIANDY", "RT001"), new Rekening("165150207111023", "737800", 5000000));
        bank.registrasiNasabah(new Nasabah("MUHAMMAD ILHAM WIBOWO", "MIW002"), new Rekening("165150200111020", "123456", 3350000));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmUI(bank, "KCP. MALANG").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allrek_btn;
    private javax.swing.JTextArea info_display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton log_btn;
    private javax.swing.JButton login_btn;
    private javax.swing.JButton register_btn;
    private javax.swing.JButton saldo_btn;
    private javax.swing.JButton setor_btn;
    private javax.swing.JButton tarik_btn;
    private javax.swing.JButton transfer_btn;
    // End of variables declaration//GEN-END:variables
}
