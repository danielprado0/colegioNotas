/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolegio.Forms;
import jcolegio.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author unno
 */
public class inscripcionGrado extends javax.swing.JInternalFrame {

    /**
     * Creates new form inscripcionGrado
     */
    public inscripcionGrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Asignar a Grado-Sección");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/teleconference.png"))); // NOI18N

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Grado:");

        jComboBox3.setEnabled(false);

        jLabel6.setText("Sección:");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Asignar automaticamente");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("No. de Identificacion del Alumno:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre: ");

        jLabel7.setText("Ciclo escolar:");

        jLabel3.setText("Apellidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.jComboBox2.removeAllItems();
        this.jComboBox3.removeAllItems();
        this.jComboBox4.removeAllItems();
        try {
            ResultSet 
            consul456 = this.conect.consul("select grado.descripcion, grado.id from grado inner join secciongrado on grado.id = secciongrado.grado_id order by grado_id asc;" );
            jc2.removeAllElements();
            while(consul456.next()){
                this.jComboBox2.addItem(consul456.getString(1));
                jc2.addElement(consul456.getInt(2));
            }
            consul456.close();
            //empiezan a cargarse los id de los alumnos
            consul456 = this.conect.consul("select count(id) from alumno;");
            consul456.next();
            int temp = consul456.getInt(1);
            String[] valores = new String[temp];
            consul456 = this.conect.consul("select id from alumno;");
            for(int a = 0;a<valores.length;a++){
                consul456.next();
                valores[a]= String.valueOf(consul456.getInt(1));
            }
            if(valores.length>0){
                javax.swing.jTextField1 slm = new javax.swing.jTextField1(valores);
                this.jTextField1.setModel(slm);
                jTextField1.setValue(valores[valores.length-1]);
            }
            if(this.jTextField1.getModel().getValue().toString().isEmpty()==false){
                consul456 = this.conect.consul("select Nombre, Apellido from alumno where idAlumno="+this.jTextField1.getValue().toString()+";");
                consul456.next();
                this.jLabel2.setText("Nombre: "+ consul456.getString(1));
                this.jLabel3.setText("Apellidos: "+ consul456.getString(2));
            }
            consul456 = conect.consul("select Id from grado_carrera where Grado_idGrado ="+this.jc2.getElementAt(this.jComboBox2.getSelectedIndex())+" and Carrera_idCarrera ="+this.jc1.getElementAt(this.jComboBox1.getSelectedIndex())+";");
            if(consul456.next()){
                int temp2 =consul456.getInt(1);
                consul456 = conect.consul("select Letra from seccion inner join seccion_g_c on seccion_g_c.Seccion_idSeccion = seccion.idSeccion and seccion_g_c.Grado_Carrera_Id = "+temp2+" order by Seccion_idSeccion asc;");
                while(consul456.next()){
                    this.jComboBox3.addItem(consul456.getString(1));
                }
            }
            consul456 = conect.consul("select ano from cicloescolar order by ano desc;");
            while(consul456.next()){
                this.jComboBox4.addItem(consul456.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inscripcionGrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(this.jCheckBox1.isSelected()){
            this.jComboBox3.setEnabled(false);
        }else{this.jComboBox3.setEnabled(true);}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.jTextField1.getText().isEmpty()==false){
            if(this.jComboBox1.getSelectedIndex()!=-1){
                if(this.jComboBox2.getSelectedIndex()!=-1){
                    if(this.jComboBox3.getSelectedIndex()!=-1 || this.jCheckBox1.isSelected()){
                        if(this.jComboBox4.getSelectedIndex()!=-1){
                            try {
                                //comienza el guardado
                                int idcarreragrad;
                                ResultSet consul3;
                                Conexion conect3 = new Conexion();
                                consul3 = conect3.consul("select idCicloesc from cicloesc where anio ="+this.jComboBox4.getSelectedItem()+";");
                                consul3.next();
                                int idcicl = consul3.getInt(1);
                                consul3 = conect3.consul("select Id from grado_carrera where Grado_idGrado ="+this.jc2.getElementAt(this.jComboBox2.getSelectedIndex())+" and Carrera_idCarrera ="+this.jc1.getElementAt(this.jComboBox1.getSelectedIndex())+";");
                                consul3.next();
                                idcarreragrad = consul3.getInt(1);
                                //aqui comenzamos el ciclo para verificar la seccion
                                int idsec, idsecgrad = 0,limite;
                                if(this.jCheckBox1.isSelected()){
                                    boolean b1 = false;
                                    int a =0;
                                    while (b1 == false && a<this.jComboBox3.getModel().getSize()){
                                        consul3 = conect3.consul("select idSeccion from seccion where Letra = '"+this.jComboBox3.getItemAt(a) +"';");
                                        consul3.next();
                                        idsec = consul3.getInt(1);
                                        consul3 = conect3.consul("select idSeccion_G_C, Limite from seccion_g_c  where Seccion_idSeccion = "+idsec+" and Grado_Carrera_Id ="+idcarreragrad+";");
                                        consul3.next();
                                        idsecgrad= consul3.getInt(1);
                                        limite = consul3.getInt(2);
                                        consul3 = conect3.consul("select count(*) from asignacion where Seccion_G_C_idSeccion_G_C = "+idsecgrad+" and Cicloesc_idCicloesc="+idcicl);
                                        consul3.next();
                                        if(consul3.getInt(1)<limite){
                                            b1 = true;
                                        }
                                        a++;
                                    }
                                    if(b1==true){
                                        consul3 = conect3.consul("select count(*) from asignacion where Cicloesc_idCicloesc = "+idcicl+" and Alumno_idAlumno = "+this.jTextField1.getValue().toString()+";");
                                        consul3.next();
                                        if(consul3.getInt(1)==0){
                                            conect3.ingresar("INSERT INTO `basejalumnos`.`asignacion` (`FechadeInsc`, `Cicloesc_idCicloesc`, `Alumno_idAlumno`, `Seccion_G_C_idSeccion_G_C`) VALUES (now(), "+idcicl+", "+this.jTextField1.getValue().toString()+", "+idsecgrad+");");
                                            ResultSet rs5 =conect3.consul("Select Last_Insert_id() from `basejalumnos`.`asignacion`");
                                            if(rs5.next()){
                                                conect3.consul("Call Dato("+ rs5.getInt(1)+");" );
                                                ireportes.Contrato contrato = new ireportes.Contrato();
                                                contrato.startReport();
                                            }
                                            javax.swing.JOptionPane.showMessageDialog(rootPane, "El Alumno Ha sido asignado correctamente", "Guardado", 1);
                                        }else{
                                            javax.swing.JOptionPane.showMessageDialog(rootPane, "El alumno Ya fue inscrito en una carrera y grado en este ciclo escolar", "Error", 0);
                                        }

                                    }else{
                                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Ya no hay espacios en las secciones creadas, cree una seccion nueva para poder continuar\nsi desea puede editar la sección para aumentar el numero de cupos", "Error", 0);
                                    }
                                }else{
                                    consul3 = conect3.consul("select idSeccion from seccion where Letra = '"+this.jComboBox3.getSelectedItem() +"';");
                                    consul3.next();
                                    idsec = consul3.getInt(1);
                                    consul3 = conect3.consul("select idSeccion_G_C, Limite from seccion_g_c  where Seccion_idSeccion = "+idsec+" and Grado_Carrera_Id ="+idcarreragrad+";");
                                    consul3.next();
                                    idsecgrad= consul3.getInt(1);
                                    limite = consul3.getInt(2);
                                    consul3 = conect3.consul("select count(*) from asignacion where Seccion_G_C_idSeccion_G_C = "+idsecgrad+";");
                                    consul3.next();
                                    if(consul3.getInt(1)<limite){
                                        consul3 = conect3.consul("select count(*) from asignacion where Cicloesc_idCicloesc = "+idcicl+" and Alumno_idAlumno = "+this.jTextField1.getValue().toString()+";");
                                        consul3.next();
                                        if(consul3.getInt(1)==0){
                                            conect3.ingresar("INSERT INTO `basejalumnos`.`asignacion` (`FechadeInsc`, `Cicloesc_idCicloesc`, `Alumno_idAlumno`, `Seccion_G_C_idSeccion_G_C`) VALUES (now(), "+idcicl+", "+this.jTextField1.getValue().toString()+", "+idsecgrad+");");
                                            javax.swing.JOptionPane.showMessageDialog(rootPane, "El Alumno Ha sido asignado correctamente", "Guardado", 1);
                                        }else{
                                            javax.swing.JOptionPane.showMessageDialog(rootPane, "El alumno Ya fue inscrito en una carrera y grado en este ciclo escolar", "Error", 0);
                                        }
                                    }else{
                                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Ya no hay espacios en las seccion asignada, cree una seccion nueva para poder continuar\nsi desea puede editar la sección para aumentar el numero de cupos", "Error", 0);
                                    }
                                }

                                //conect3.ingresar(title);
                                //finaliza el guardado
                            } catch (SQLException ex) {
                                Logger.getLogger(inscripcionGrado.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            javax.swing.JOptionPane.showMessageDialog(rootPane, "Debe existir a lo menos un ciclo escolar", "Error", 0);
                        }
                    }else{
                        javax.swing.JOptionPane.showMessageDialog(rootPane, "Debe existir a lo menos una seccion", "Error", 0);
                    }
                }else{
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Debe seleccionar a lo menos un grado", "Error", 0);
                }
            }else{
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Debe seleccionar a lo menos una carrera", "Error", 0);
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Ingrese un número de identificación", "Error", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    Conexion conect = new Conexion();
    javax.swing.DefaultComboBoxModel jc1 = new javax.swing.DefaultComboBoxModel<>();
    javax.swing.DefaultComboBoxModel jc2 = new javax.swing.DefaultComboBoxModel<>();
}
