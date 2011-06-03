/*
 * This file is part of Biblioteca-Digital de Univalle.
 *
 * Biblioteca-Digital de Univalle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Biblioteca-Digital de Univalle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with Biblioteca-Digital de Univalle.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

/*
 * Selecc_Pal_Clave.java
 *
 * Created on 7/05/2011, 08:31:41 PM
 */
package biblioteca.gui.catalogacion;

import biblioteca.database2.beans.PalabraClave;
import biblioteca.database2.beans.Documento;
import biblioteca.database2.controladores.ControladorPalabraClave;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author alejandro
 */
public class Selecc_Pal_Clave extends javax.swing.JPanel {
    Documento documento;
    ArrayList<PalabraClave> palabrasClaveExistentes;
    static public ArrayList<PalabraClave> palabrasClaveSeleccionadas;
    /** Creates new form Selecc_Pal_Clave */
    public Selecc_Pal_Clave(Documento documento) {
        initComponents();
        this.documento=documento;
        palabrasClaveSeleccionadas = new ArrayList<PalabraClave>();
        initComboBox();
    }

    
    private void initComboBox() {
     Palabras_Clave.removeAllItems();
     palabrasClaveExistentes=null;
     palabrasClaveExistentes=new ControladorPalabraClave().consultarTodasLasPalabrasClaves();
     if(palabrasClaveExistentes!=null){
         for(int i=0;i<palabrasClaveExistentes.size();i++){
             Palabras_Clave.insertItemAt(palabrasClaveExistentes.get(i).getNombre(), i);
         }
         Palabras_Clave.setSelectedIndex(-1);
     }
    }
    
    private void refreshPalabrasClave(){
        String texto="";
        for(int i=0;i<palabrasClaveSeleccionadas.size();i++){
            texto+=palabrasClaveSeleccionadas.get(i).getNombre();
            if(i!=(palabrasClaveSeleccionadas.size()-1)){
                texto+=", ";
            }
        }
        PC_Agregadas.setText(texto);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Palabras_Clave = new javax.swing.JComboBox();
        Cancelar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PC_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PC_Descripcion = new javax.swing.JTextField();
        Siguiente = new javax.swing.JButton();
        Estado = new javax.swing.JLabel();
        Agregar_Palabra_Clave = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PC_Agregadas = new javax.swing.JTextArea();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/resources/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel4.setText("Palabras Clave");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Palabras Clave Existentes: ");

        Cancelar.setText("Cancelar Operación");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar Palabra Clave al Documento");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jSeparator1.setMinimumSize(new java.awt.Dimension(150, 6));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18));
        jLabel2.setText("Agregar una Nueva Palabra Clave: ");

        jLabel6.setText("Nombre: ");

        jLabel1.setText("Descripción: ");

        Siguiente.setFont(new java.awt.Font("Ubuntu", 1, 15));
        Siguiente.setText("Siguiente Paso");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Estado.setFont(new java.awt.Font("Ubuntu", 0, 24));
        Estado.setForeground(new java.awt.Color(255, 0, 0));
        Estado.setText("[Sin Guardar]");

        Agregar_Palabra_Clave.setText("Agregar Palabra Clave");
        Agregar_Palabra_Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_Palabra_ClaveActionPerformed(evt);
            }
        });

        jSeparator2.setMinimumSize(new java.awt.Dimension(150, 6));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18));
        jLabel7.setText("Palabras Clave Agregadas: ");

        PC_Agregadas.setColumns(20);
        PC_Agregadas.setRows(5);
        PC_Agregadas.setMinimumSize(new java.awt.Dimension(200, 200));
        PC_Agregadas.setPreferredSize(new java.awt.Dimension(300, 500));
        jScrollPane1.setViewportView(PC_Agregadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(Agregar_Palabra_Clave))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(Siguiente))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(PC_Descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(PC_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(Agregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Palabras_Clave, 0, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(Cancelar))
                .addGap(10, 10, 10)
                .addComponent(Palabras_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addComponent(Agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(PC_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PC_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agregar_Palabra_Clave)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Estado)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Siguiente)
                        .addGap(20, 20, 20))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if(Palabras_Clave.getSelectedIndex()!=-1){
            if(!palabrasClaveSeleccionadas.contains(palabrasClaveExistentes.get(Palabras_Clave.getSelectedIndex()))){
                palabrasClaveSeleccionadas.add(palabrasClaveExistentes.get(Palabras_Clave.getSelectedIndex()));
                refreshPalabrasClave();
                biblioteca.gui.GUICatalogacion.Palabras_Clave_Guardadas=false;
            }
        }
}//GEN-LAST:event_AgregarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if(!palabrasClaveSeleccionadas.isEmpty()){
            Palabras_Clave.setEnabled(false);
            Palabras_Clave.setSelectedIndex(-1);
            Agregar.setEnabled(false);
            Estado.setForeground(Color.green);
            Estado.setText("[Guardado]");
            JTabbedPane parent =(JTabbedPane) this.getParent();
            parent.setSelectedIndex(4);
            biblioteca.gui.GUICatalogacion.Palabras_Clave_Guardadas=true;
            
        }else JOptionPane.showMessageDialog(this, "Debe seleccionar almenos una palabra clave", "Error", JOptionPane.ERROR_MESSAGE);
}//GEN-LAST:event_SiguienteActionPerformed

    private void Agregar_Palabra_ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_Palabra_ClaveActionPerformed
        if(checkEmptyFieldsPC()){
            if(new ControladorPalabraClave().InsertarPalabraClave(PC_Nombre.getText().toLowerCase(), PC_Descripcion.getText())!=-1){
                JOptionPane.showMessageDialog(this, PC_Nombre.getText()+ " ha sido agregada", "Notificaición", JOptionPane.INFORMATION_MESSAGE);
                PC_Nombre.setText("");
                PC_Descripcion.setText("");
                initComboBox();
            }
            else{
                JOptionPane.showMessageDialog(this, PC_Nombre.getText()+ " ya existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_Agregar_Palabra_ClaveActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        palabrasClaveSeleccionadas.clear();
        refreshPalabrasClave();
        biblioteca.gui.GUICatalogacion.Palabras_Clave_Guardadas=false;
        Palabras_Clave.setEnabled(true);
        Agregar.setEnabled(true);
        Estado.setForeground(Color.red);
        Estado.setText("[Sin guardar]");
    }//GEN-LAST:event_CancelarActionPerformed

    private boolean checkEmptyFieldsPC(){
        if(PC_Nombre.getText()==null || PC_Nombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(PC_Descripcion.getText()==null || PC_Descripcion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Descripcion no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Agregar_Palabra_Clave;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Estado;
    private javax.swing.JTextArea PC_Agregadas;
    private javax.swing.JTextField PC_Descripcion;
    private javax.swing.JTextField PC_Nombre;
    private javax.swing.JComboBox Palabras_Clave;
    private javax.swing.JButton Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    
}
