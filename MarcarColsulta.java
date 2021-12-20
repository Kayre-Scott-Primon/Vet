
package vet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MarcarColsulta extends javax.swing.JFrame {
MarcarColsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("MARCAR CONSULTA");

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 20)); // NOI18N
        jLabel2.setText("Nome do animal");

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 20)); // NOI18N
        jLabel3.setText("Data");

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setText("MARCAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 20)); // NOI18N
        jLabel4.setText("Hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(data))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))
                            .addComponent(hora))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        if (nome == null) {
            nome.setText("");
        }
        if (data == null) {
            data.setText("");
        }
        if (hora == null) {
            hora.setText("");
        }
        
        if((Vet.pesquisarC(hora.getText(),data.getText())) == null){ JOptionPane.showMessageDialog(rootPane, "CONSULTA MARCADA ");}
        else{ JOptionPane.showMessageDialog(rootPane,"horario nao vago");}


        if ("".equals(nome.getText()) && "".equals(data.getText()) && "".equals(hora.getText()) ) {
            JOptionPane.showMessageDialog(null, "Preencha os campos");
        } else {

            Consultas c = new Consultas(nome.getText(), data.getText(), hora.getText());

            try {
                Vet.exportarArqC(c);
            } catch (IOException ex) {
                Logger.getLogger(MarcarColsulta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (null == Vet.pesquisarA(nome.getText())) {

               
                    Vet.consultas.add(c);

                    Vet.cadas.setVisible(false);

                    nome.setText("");

                    data.setText("");

                    hora.setText("");
       
            } else {
                JOptionPane.showMessageDialog(null, "Ja cadastrado !");
            }
        }
        
        Vet.mc.setVisible(false);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MarcarColsulta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField data;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
