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
 * GUICAT_Informacion_Basica.java
 *
 * Created on 7/05/2011, 04:04:25 PM
 */
package biblioteca.gui.modificacion;

import biblioteca.database2.accesoDatos.DaoDocumento;
import biblioteca.database2.beans.Documento;
import biblioteca.gui.LimitadorDejTextField;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 * Este panel hace parte de la interfaz GUIModificacionDocumento, permite la modificación de la
 * información basica (contenida en la tabla de documentos) o metadatos de un documento
 * ya existente en la aplicación
 *
 * @see biblioteca.gui.GUIModificacionDocumento;
 * @author María Cristina Bustos Rodríguez
 * @author Alejandro Valdés Villada
 */
public class Informacion_Basica extends javax.swing.JPanel {
    Documento documento;    
    biblioteca.gui.GUIModificacionDocumento parent;
    /** Creates new form GUICAT_Informacion_Basica */
    public Informacion_Basica(Documento documento, biblioteca.gui.GUIModificacionDocumento parent) {
        initComponents();
        this.documento=documento;
        this.parent=parent;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        Titulo_Principal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Titulo_Secundario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Idioma = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Editorial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Derechos_Autor = new javax.swing.JTextField();
        Estado = new javax.swing.JLabel();
        Siguiente = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        id_Documento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DiaComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        MesComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        AnoComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Activo = new javax.swing.JComboBox();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Titulo Principal: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel1, gridBagConstraints);

        LimitadorDejTextField Titulo_PrincipalL=new LimitadorDejTextField(200);
        Titulo_Principal.setDocument(Titulo_PrincipalL);
        Titulo_Principal.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        add(Titulo_Principal, gridBagConstraints);

        jLabel2.setText("Titulo Secundario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel2, gridBagConstraints);

        LimitadorDejTextField Titulo_SecundarioL=new LimitadorDejTextField(200);
        Titulo_Secundario.setDocument(Titulo_SecundarioL);
        Titulo_Secundario.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        add(Titulo_Secundario, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/resources/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel4.setText("Información Basica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 0, 10);
        add(jLabel4, gridBagConstraints);

        jLabel5.setText("Descripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel5, gridBagConstraints);

        LimitadorDejTextField DescripcionL=new LimitadorDejTextField(500);
        Descripcion.setDocument(DescripcionL);
        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Tahoma", 0, 11));
        Descripcion.setRows(5);
        Descripcion.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(Descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.ipady = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        add(jScrollPane1, gridBagConstraints);

        jLabel6.setText("Idioma:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel6, gridBagConstraints);

        Idioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Español", "Inglés", "Francés", "Aleman", "Portugués", "Otro" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(Idioma, gridBagConstraints);

        jLabel7.setText("Editorial: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel7, gridBagConstraints);

        LimitadorDejTextField EditorialL=new LimitadorDejTextField(30);
        Editorial.setDocument(EditorialL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        add(Editorial, gridBagConstraints);

        jLabel8.setText("Fecha Publicación: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel8, gridBagConstraints);

        jLabel9.setText("Derechos de Autor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel9, gridBagConstraints);

        LimitadorDejTextField Derechos_AutorL=new LimitadorDejTextField(40);
        Derechos_Autor.setDocument(Derechos_AutorL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 15);
        add(Derechos_Autor, gridBagConstraints);

        Estado.setFont(new java.awt.Font("Ubuntu", 0, 24));
        Estado.setForeground(new java.awt.Color(255, 0, 0));
        Estado.setText("[Sin Guardar]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 12, 10, 0);
        add(Estado, gridBagConstraints);

        Siguiente.setFont(new java.awt.Font("Ubuntu", 1, 15));
        Siguiente.setText("Siguiente Paso");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        add(Siguiente, gridBagConstraints);

        Editar.setText("Editar");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        add(Editar, gridBagConstraints);

        Consultar.setText("Consultar Documento");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        add(Consultar, gridBagConstraints);

        jLabel10.setText("Identificador: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(jLabel10, gridBagConstraints);

        id_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_DocumentoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(id_Documento, gridBagConstraints);

        jLabel12.setText("Día:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel12, gridBagConstraints);

        DiaComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        DiaComboBox.setMaximumRowCount(31);
        DiaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(DiaComboBox, gridBagConstraints);

        jLabel11.setText("Mes: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel11, gridBagConstraints);

        MesComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        MesComboBox.setMaximumRowCount(12);
        MesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(MesComboBox, gridBagConstraints);

        jLabel13.setText("Año: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 9;
        add(jLabel13, gridBagConstraints);

        AnoComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        AnoComboBox.setMaximumRowCount(60);
        AnoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(AnoComboBox, gridBagConstraints);

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        add(jLabel14, gridBagConstraints);

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        add(jLabel15, gridBagConstraints);

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        add(jLabel16, gridBagConstraints);

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        add(jLabel17, gridBagConstraints);

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        add(jLabel19, gridBagConstraints);

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        add(jLabel18, gridBagConstraints);

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        add(jLabel20, gridBagConstraints);

        jLabel21.setText("Estado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel21, gridBagConstraints);

        Activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(Activo, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if(checkEmptyFields()){
            guardarDatos();
            JTabbedPane panelParent =(JTabbedPane) this.getParent();
            panelParent.setSelectedIndex(1);
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        biblioteca.gui.GUIModificacionDocumento.Informacion_Basica_Guardada=false;
        enableFields(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void id_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_DocumentoActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
         documento=new DaoDocumento().consultarDocumento(id_Documento.getText());
         if(!documento.getID_documento().equalsIgnoreCase("")){
             id_Documento.setEnabled(false);
             Titulo_Principal.setText(documento.getTituloPrincipal());
        Titulo_Secundario.setText(documento.getTituloSecundario());
        
        Descripcion.setText(documento.getTituloPrincipal());
       
        DiaComboBox.setSelectedItem(documento.getFechaPublicacion().substring(8, 10));
        MesComboBox.setSelectedItem(documento.getFechaPublicacion().substring(5, 7));
        AnoComboBox.setSelectedItem(documento.getFechaPublicacion().substring(0, 4));
        
        Editorial.setText(documento.getEditorial());
        Derechos_Autor.setText(documento.getDerechosAutor());
        Idioma.setSelectedItem(documento.getIdioma());
        if(documento.getActivo()){
            Activo.setSelectedIndex(0);
        }
        else{
            Activo.setSelectedIndex(1);
        }
        biblioteca.gui.GUIModificacionDocumento.documento=this.documento;
        parent.documentoAbierto();
         }
         else{
            JOptionPane.showMessageDialog(this, "El documento no existe, por favor ingrese ", "Error", JOptionPane.ERROR_MESSAGE);   
         }
    }//GEN-LAST:event_ConsultarActionPerformed

    /**
     * Comprueba si existen campos vacios en las entradas para insertar una
     * nueva autor
     * @return boolean indicando si no hay campos vacios
     */
    private boolean checkEmptyFields(){
        if(Titulo_Principal.getText()==null || Titulo_Principal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Titulo Principal no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(Titulo_Secundario.getText()==null || Titulo_Secundario.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Titulo Secundario no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(Descripcion.getText()==null || Descripcion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Descripcion no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(Editorial.getText()==null || Editorial.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Editorial no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(Derechos_Autor.getText()==null || Derechos_Autor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "El campo Derechos de Autor no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else return true;
    }
    
    /**
     * Guarda los datos que estan en la interfaz en un Documento, y finaliza el 
     * proceso de la inserción de datos basicos del documento
     */
    private void guardarDatos(){
        documento.setTituloPrincipal(Titulo_Principal.getText().replaceAll("[']", "`"));
        documento.setTituloSecundario(Titulo_Secundario.getText().replaceAll("[']", "`"));
        documento.setDescripcion(Descripcion.getText().replaceAll("[']", "`"));
        documento.setEditorial(Editorial.getText().replaceAll("[']", "`"));
        String fechaPub= (String) AnoComboBox.getSelectedItem();
        fechaPub+=(String) MesComboBox.getSelectedItem();
        fechaPub+=(String) DiaComboBox.getSelectedItem();
        documento.setFechaPublicacion(fechaPub);
        documento.setDerechosAutor(Derechos_Autor.getText().replaceAll("[']", "`"));
        documento.setIdioma((String)Idioma.getItemAt(Idioma.getSelectedIndex()));
        documento.setActivo((Activo.getSelectedIndex()==0) ? true : false);
        Estado.setForeground(Color.green);
        Estado.setText("[Guardado]");
        enableFields(false);
        biblioteca.gui.GUIModificacionDocumento.Informacion_Basica_Guardada=true;
    }
    
    /**
     * Habilita o deshabilita los campos de la interfaz según el parametro
     * @param b boolean indicando si habilitar o deshabilitar la interfaz
     */
    private void enableFields(boolean b){
        Titulo_Principal.setEditable(b);
        Titulo_Principal.setEnabled(b);
        Titulo_Secundario.setEditable(b);
        Titulo_Secundario.setEnabled(b);
        Descripcion.setEditable(b);
        Descripcion.setEnabled(b);
        Editorial.setEditable(b);
        Editorial.setEnabled(b);
        AnoComboBox.setEnabled(b);
        DiaComboBox.setEnabled(b);
        MesComboBox.setEnabled(b);
        Derechos_Autor.setEditable(b);
        Derechos_Autor.setEnabled(b);
        Idioma.setEnabled(b);
        Editar.setEnabled(!b);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Activo;
    private javax.swing.JComboBox AnoComboBox;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField Derechos_Autor;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JComboBox DiaComboBox;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField Editorial;
    private javax.swing.JLabel Estado;
    private javax.swing.JComboBox Idioma;
    private javax.swing.JComboBox MesComboBox;
    private javax.swing.JButton Siguiente;
    private javax.swing.JTextField Titulo_Principal;
    private javax.swing.JTextField Titulo_Secundario;
    private javax.swing.JTextField id_Documento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
