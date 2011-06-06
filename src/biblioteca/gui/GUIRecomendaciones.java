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
 * GUIRecomendaciones.java
 *
 * Created on 14/05/2011, 10:58:38 PM
 */
package biblioteca.gui;

import biblioteca.database2.beans.Autor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import biblioteca.database2.controladores.ControladorDocumento;

/**
 * GUI para mostrar las recomendaciones de documentos al usuario autenticado
 * actualmente
 * 
 * <br>Estas recomendaciones se calculan según las áreas de interes del usuario
 * autenticado actualmente, la fecha de catalogación de documentos que tengan esas
 * áreas de interés del usuario y la ultima vez que accedio el usuario a la
 * aplicación
 * 
 * @author María Cristina Bustos Rodríguez
 * @author Alejandro Valdés Villada
 */
public class GUIRecomendaciones extends javax.swing.JFrame {
    javax.swing.JFrame parent;
    ArrayList<String> resultados;
    
    /** Creates new form GUIRecomendaciones */
    public GUIRecomendaciones(javax.swing.JFrame parent) {
            initComponents();
            NoEditableTableModel modelo =new NoEditableTableModel();
            modelo.addColumn("Titulo");
            modelo.addColumn("Autores");
            resultados = new ControladorDocumento().consultarRecomendaciones(biblioteca.Main.BibliotecaDigital.LOGGED_USER);
            for(int i=0;i<(int) resultados.size()/2;i++){
                String[] row = new String[2];
                row[0] =resultados.get(i*2+1);
                String autores="";
                ArrayList<Autor> obtenerAutores = new ControladorDocumento().obtenerAutores(resultados.get(i*2));
                for(int j=0;j<obtenerAutores.size();j++){
                    autores+=obtenerAutores.get(j).getNombre()+" "+obtenerAutores.get(j).getApellido();
                    if(j!=(obtenerAutores.size()-1))
                        autores+=", ";
                }
                row[1]=autores;
                modelo.addRow(row);
            }
            Resultados.setModel(modelo);
            this.parent=parent;
            this.setLocationRelativeTo(parent);
            this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTable();
        Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/resources/logo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("Recomendaciones Nuevas");

        Resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Resultados);

        Consultar.setText("Consultar Documento Seleccionado");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("En esta tabla usted podrá encontrar las recomendaciones sobre documentos nuevos");

        jLabel2.setText("basado en sus áreas de interés y en su última fecha de acceso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel4)))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(Consultar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Consultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        int numeroSelecc=Resultados.getSelectedRow();
        if(numeroSelecc==-1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.setVisible(false);
            new biblioteca.gui.GUIInformacionDocumento(this, resultados.get(numeroSelecc*2)).setVisible(true);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void ResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultadosMouseClicked
        if(evt.getClickCount()==2){
            int numeroSelecc=Resultados.getSelectedRow();
            new biblioteca.gui.GUIInformacionDocumento(this, resultados.get(numeroSelecc*2)).setVisible(true);
        }
    }//GEN-LAST:event_ResultadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JTable Resultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
