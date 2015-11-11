/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolegio.Forms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jcolegio.Conexion;

/**
 *
 * @author JESSICA
 */
public class cursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form cursos
     */
    public cursos() {
        try {
            initComponents();
            ResultSet 
            consul456 = this.conect.consul("select grado.descripcion, grado.id from grado order by grado.id asc;" );
            jc2.removeAllElements();
            while(consul456.next()){
                this.jComboBox2.addItem(consul456.getString(1));
                jc2.addElement(consul456.getInt(2));
            }
            consul456.close();
            //empiezan a cargarse los cursos
            if(this.jComboBox2.getSelectedIndex() != -1){
                consul456 = conect.consul("select grado.id from grado where grado.id ="+this.jc2.getElementAt(this.jComboBox2.getSelectedIndex())+"");
                if(consul456.next()){
                    int temp = consul456.getInt(1);
                    
                    consul456 = conect.consul("SELECT curso.id, curso.descripcion, curso.grado_id, curso.orden FROM curso\n" +
                    "inner join grado on curso.grado_id = grado.id\n" +
                    "where grado_id ="+temp+" order by orden;");
                    this.jl1.removeAllElements();
                    this.jl2.removeAllElements();
                    this.jl3.removeAllElements();
                    while (consul456.next()){
                        this.jl1.addElement(consul456.getString(1));
                        this.jl2.addElement(consul456.getInt(2));
                        this.jl3.addElement(consul456.getInt(3));
                    }
                }else{
                    this.jl1.removeAllElements();
                    this.jl2.removeAllElements();
                    this.jl3.removeAllElements();
                }
                this.jList1.setModel(jl1);
            }else{
                this.jl1.removeAllElements();
                this.jList1.setModel(jl1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso:");

        jButton7.setText("Arriba");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("");

        jButton8.setText("Abajo");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel5.setText("Cursos:");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.setToolTipText("Elimina un Curso de la carrera, recuerde si tiene notas ingresadas en este segmento se perderan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Grado");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jButton8)
                            .addComponent(jButton7))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 187, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(this.jTextField1.getText().isEmpty() == false){
            this.jTextField1.setText(this.jTextField1.getText().replace("'", "`"));
            if(this.jButton5.getText().equals("Editar")){
                int temp = this.jList1.getSelectedIndex();
                this.jl1.removeElementAt(temp);
                this.jl1.insertElementAt(this.jTextField1.getText(), temp);
                this.jList1.setEnabled(true);
                this.jButton2.setEnabled(true);
                this.jButton5.setText("Agregar");
                jButton6.setText("Modificar");
                }else{
                this.jl1.addElement(this.jTextField1.getText());
                this.jl2.addElement(null);
                this.jl3.addElement(1);
            }
            this.jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(this.jList1.getSelectedIndex()!=-1 && this.jButton6.getText().equals("Modificar")){
            this.jTextField1.setText(this.jList1.getSelectedValue().toString());
            this.jList1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.jButton5.setText("Editar");
            
            jButton6.setText("Cancelar");
        }else{
            if(this.jButton6.getText().equals("Cancelar")){
                this.jList1.setEnabled(true);
                this.jButton2.setEnabled(true);
                this.jButton5.setText("Agregar");
               
                jButton6.setText("Modificar");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int temp = this.jList1.getSelectedIndex();
        Object tempint2,tempint3,tempint4,tempint5, tempst1,tempst2;
        tempst1 = this.jl1.getElementAt(temp -1);
        tempint2 = this.jl2.getElementAt(temp-1);
        tempint3 = this.jl3.getElementAt(temp-1);
        tempst2 = this.jl1.getElementAt(temp);
        tempint4 = this.jl2.getElementAt(temp);
        tempint5 = this.jl3.getElementAt(temp);
        jl1.removeElementAt(temp);
        jl2.removeElementAt(temp);
        jl3.removeElementAt(temp);
        jl1.removeElementAt(temp-1);
        jl2.removeElementAt(temp-1);
        jl3.removeElementAt(temp-1);
        jl1.insertElementAt(tempst2, temp-1);
        jl2.insertElementAt(tempint4, temp-1);
        jl3.insertElementAt(tempint5, temp-1);
        jl1.insertElementAt(tempst1, temp);
        jl2.insertElementAt(tempint2, temp);
        jl3.insertElementAt(tempint3, temp);
        this.jList1.setModel(jl1);
        this.jList1.setSelectedIndex(temp-1);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int temp = this.jList1.getSelectedIndex();
        Object tempint2,tempint3,tempint4,tempint5, tempst1,tempst2;
        tempst1 = this.jl1.getElementAt(temp +1);
        tempint2 = this.jl2.getElementAt(temp+1);
        tempint3 = this.jl3.getElementAt(temp+1);
        tempst2 = this.jl1.getElementAt(temp);
        tempint4 = this.jl2.getElementAt(temp);
        tempint5 = this.jl3.getElementAt(temp);
        jl1.removeElementAt(temp+1);
        jl2.removeElementAt(temp+1);
        jl3.removeElementAt(temp+1);
        jl1.removeElementAt(temp);
        jl2.removeElementAt(temp);
        jl3.removeElementAt(temp);
        jl1.insertElementAt(tempst1, temp);
        jl2.insertElementAt(tempint2, temp);
        jl3.insertElementAt(tempint3, temp);
        jl1.insertElementAt(tempst2, temp+1);
        jl2.insertElementAt(tempint4, temp+1);
        jl3.insertElementAt(tempint5, temp+1);
        this.jList1.setModel(jl1);
        this.jList1.setSelectedIndex(temp+1);
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            Conexion conect1 = new Conexion();
            if(this.jComboBox2.getSelectedIndex() != -1){
                ResultSet consul5 = conect1.consul("select grado.id from grado;");
                if(consul5.next()){
                    int temp = consul5.getInt(1);
                    
                    consul5 = conect1.consul("select curso.descripcion, curso.id, curso.orden from curso where curso.grado_id ="+temp+" order by orden;");
                    this.jl1.removeAllElements();
                    this.jl2.removeAllElements();
                    this.jl3.removeAllElements();
                    while (consul5.next()){
                        this.jl1.addElement(consul5.getString(1));
                        this.jl2.addElement(consul5.getInt(2));
                        this.jl3.addElement(consul5.getInt(3));
                    }
                }else{
                    this.jl1.removeAllElements();
                    this.jl2.removeAllElements();
                    this.jl3.removeAllElements();
                }
                this.jList1.setModel(jl1);
            }else{
                this.jl1.removeAllElements();
                this.jList1.setModel(jl1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       try {
           if(this.jList1.getSelectedIndex()!= -1){
                if(this.jl2.getElementAt(this.jList1.getSelectedIndex())==null){
                    this.jl3.removeElementAt(this.jList1.getSelectedIndex());
                    this.jl1.removeElementAt(this.jList1.getSelectedIndex());
                }else{
                    Conexion conect4 = new Conexion();
                    ResultSet consul58 ;//1;
                    consul58 = conect4.consul("select count(*) from nota where nota.curso_id = "+this.jl2.getElementAt(this.jList1.getSelectedIndex())+";");
                    consul58.next();
                    if(consul58.getInt(1)==0){
                        this.jl3.removeElementAt(this.jList1.getSelectedIndex());
                        this.jl2.removeElementAt(this.jList1.getSelectedIndex());
                        this.jl1.removeElementAt(this.jList1.getSelectedIndex());
                        
                    }else{
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "No se puede eliminar este curso\nya que puede afectar a notas ya ingresadas\nsi quiere eliminarlo simplemente desactivelo", "Error", 0);
                    }
                }
           }
        } catch (SQLException ex) {
            Logger.getLogger(cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            this.jComboBox2.removeAllItems();
                ResultSet 
                consul456 = this.conect.consul("select grado.descripcion, grado.id from grado order by grado.id asc;" );
                jc2.removeAllElements();
                while(consul456.next()){
                    this.jComboBox2.addItem(consul456.getString(1));
                    jc2.addElement(consul456.getInt(2));
                }
                consul456.close();
                //empiezan a cargarse los cursos
                if ( this.jComboBox2.getSelectedIndex() != -1){
                    consul456 = conect.consul("select grado.id from grado where gradoid ="+this.jc2.getElementAt(this.jComboBox2.getSelectedIndex())+"");
                    if(consul456.next()){
                        int temp = consul456.getInt(1);

                        consul456 = conect.consul("SELECT curso.id, curso.descripcion, curso.grado_id FROM curso\n" +
                        "inner join grado on curso.grado_id = grado.id\n" +
                        "where grado_id =\n" +
                        ""+temp+"order by curso.orden;");  
                        this.jl1.removeAllElements();
                        this.jl2.removeAllElements();
                        this.jl3.removeAllElements();
                        while (consul456.next()){
                            this.jl1.addElement(consul456.getString(1));
                            this.jl2.addElement(consul456.getInt(2));
                            this.jl3.addElement(consul456.getInt(3));
                        }
                    }else{
                        this.jl1.removeAllElements();
                        this.jl2.removeAllElements();
                        this.jl3.removeAllElements();
                    }
                    this.jList1.setModel(jl1);
                }else{
                    this.jl1.removeAllElements();
                    this.jList1.setModel(jl1);
                }
        } catch (SQLException ex) {
            Logger.getLogger(cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    Conexion conect = new Conexion();
    javax.swing.DefaultComboBoxModel jc2 = new javax.swing.DefaultComboBoxModel<>();
    javax.swing.DefaultComboBoxModel jl2 = new javax.swing.DefaultComboBoxModel<>();
    javax.swing.DefaultComboBoxModel jl1 = new javax.swing.DefaultComboBoxModel<>(); 
    javax.swing.DefaultComboBoxModel jl3 = new javax.swing.DefaultComboBoxModel<>();

}

