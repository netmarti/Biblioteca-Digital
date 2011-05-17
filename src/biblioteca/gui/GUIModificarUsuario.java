/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIModificarUsuario.java
 *
 * Created on 8/05/2011, 09:36:57 PM
 */

package biblioteca.gui;

import biblioteca.database2.beans.Usuario;
import biblioteca.database2.controladores.ControladorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class GUIModificarUsuario extends javax.swing.JFrame {
    biblioteca.gui.GUIBusqueda parent;
    String Username;
    boolean tipo;
    /** Creates new form GUIModificarUsuario */
    public GUIModificarUsuario(biblioteca.gui.GUIBusqueda parent, boolean tipo) {
        Username=biblioteca.Main.BibliotecaDigital.LOGGED_USER;
        this.parent=parent;
        this.tipo=tipo;
        initComponents();
      
        if(!tipo){
        NombreUsuarioTextField1.setEditable(false);
        NombreUsuarioTextField1.setText(Username);
        ConsultarLabel.setText("");
        ConsultarDatosUsuario(NombreUsuarioTextField1.getText());
        }
        else{
            NombreUsuarioTextField1.setEditable(true);
        }
        this.setLocationRelativeTo(parent);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        UniValleLabel = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        TittleLabel = new javax.swing.JLabel();
        EscolaridadLabel = new javax.swing.JLabel();
        GeneroLabel = new javax.swing.JLabel();
        VinculoLabel = new javax.swing.JLabel();
        CorreoTextField = new javax.swing.JTextField();
        CorreoLabel = new javax.swing.JLabel();
        PreguntaSecretaLabel = new javax.swing.JLabel();
        ContrasenaPasswordField = new javax.swing.JPasswordField();
        ContrasenaLabel = new javax.swing.JLabel();
        ApellidosLabel = new javax.swing.JLabel();
        ApellidosTextField = new javax.swing.JTextField();
        NombresTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreUsuarioTextField1 = new javax.swing.JTextField();
        RespuestaSecretaLabel = new javax.swing.JLabel();
        PreguntaSecretaTextField = new javax.swing.JTextField();
        RespuestaSecretaTextField = new javax.swing.JTextField();
        VerificarContrasenaLabel = new javax.swing.JLabel();
        GeneroComboBox = new javax.swing.JComboBox();
        EscolaridadComboBox = new javax.swing.JComboBox();
        VinculoComboBox = new javax.swing.JComboBox();
        ModificarAreasButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();
        VerificarContrasenaPasswordField = new javax.swing.JPasswordField();
        FechaNacimientoLabel = new javax.swing.JLabel();
        DayComboBox = new javax.swing.JComboBox();
        MonthComboBox = new javax.swing.JComboBox();
        YearComboBox = new javax.swing.JComboBox();
        CancelarButton = new javax.swing.JButton();
        PerfilComboBox = new javax.swing.JComboBox();
        PerfilLabel = new javax.swing.JLabel();
        ConsultarLabel = new javax.swing.JLabel();
        EstadoLabel = new javax.swing.JLabel();
        EstadoCuentaComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modificar Información");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        UniValleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/gui/resources/logo.png"))); // NOI18N

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addComponent(UniValleLabel)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addComponent(UniValleLabel)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        TittleLabel.setFont(new java.awt.Font("Ubuntu", 1, 24));
        TittleLabel.setText("Modificar Información");

        EscolaridadLabel.setFont(new java.awt.Font("Arial", 0, 12));
        EscolaridadLabel.setText("Nivel Escolaridad:");

        GeneroLabel.setFont(new java.awt.Font("Arial", 0, 12));
        GeneroLabel.setText("Genero:");

        VinculoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        VinculoLabel.setText("Vinculo con Univalle:");

        CorreoTextField.setFont(new java.awt.Font("Arial", 0, 11));

        CorreoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        CorreoLabel.setText("Correo Electronico: ");

        PreguntaSecretaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        PreguntaSecretaLabel.setText("Pregunta Secreta:");

        ContrasenaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        ContrasenaLabel.setText("Contraseña:");

        ApellidosLabel.setFont(new java.awt.Font("Arial", 0, 12));
        ApellidosLabel.setText("Apellidos:");

        ApellidosTextField.setFont(new java.awt.Font("Arial", 0, 11));

        NombresTextField.setFont(new java.awt.Font("Arial", 0, 11));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setText("Nombres:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("Nombre de Usuario: ");

        NombreUsuarioTextField1.setFont(new java.awt.Font("Arial", 0, 11));

        RespuestaSecretaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        RespuestaSecretaLabel.setText("Respuesta Secreta: ");

        PreguntaSecretaTextField.setFont(new java.awt.Font("Arial", 0, 11));

        VerificarContrasenaLabel.setFont(new java.awt.Font("Arial", 0, 12));
        VerificarContrasenaLabel.setText("Verificar Contraseña:");

        GeneroComboBox.setMaximumRowCount(2);
        GeneroComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        EscolaridadComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Primaria", "Bachiller", "Universidad", "Maestria", "Doctorado" }));

        VinculoComboBox.setMaximumRowCount(6);
        VinculoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Pregrado", "Posgrado", "Egresado", "Profesor", "Jubilado" }));

        ModificarAreasButton.setText("Modificar Areas");
        ModificarAreasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAreasButtonActionPerformed(evt);
            }
        });

        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        FechaNacimientoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        FechaNacimientoLabel.setText("Fecha de Nacimiento:");

        DayComboBox.setMaximumRowCount(31);
        DayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        MonthComboBox.setMaximumRowCount(12);
        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        YearComboBox.setMaximumRowCount(60);
        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940" }));

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        PerfilComboBox.setFont(new java.awt.Font("Arial", 0, 12));
        PerfilComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario Registrado", "Usuario Catalogador" }));
        PerfilComboBox.setEnabled(false);

        PerfilLabel.setFont(new java.awt.Font("Arial", 0, 12));
        PerfilLabel.setText("Perfil Usuario");

        ConsultarLabel.setText("Consultar");
        ConsultarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarLabelMouseClicked(evt);
            }
        });

        EstadoLabel.setFont(new java.awt.Font("Arial", 0, 12));
        EstadoLabel.setText("Estado de Cuenta");

        EstadoCuentaComboBox.setFont(new java.awt.Font("Arial", 0, 12));
        EstadoCuentaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        EstadoCuentaComboBox.setEnabled(false);
        EstadoCuentaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoCuentaComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(TittleLabel)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(EstadoLabel)
                        .addContainerGap())
                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BodyPanelLayout.createSequentialGroup()
                            .addComponent(PerfilLabel)
                            .addContainerGap())
                        .addGroup(BodyPanelLayout.createSequentialGroup()
                            .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BodyPanelLayout.createSequentialGroup()
                                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RespuestaSecretaLabel)
                                        .addComponent(PreguntaSecretaLabel)
                                        .addComponent(CorreoLabel)
                                        .addComponent(FechaNacimientoLabel)
                                        .addComponent(VinculoLabel)
                                        .addComponent(EscolaridadLabel)
                                        .addComponent(GeneroLabel)
                                        .addComponent(VerificarContrasenaLabel)
                                        .addComponent(ContrasenaLabel)
                                        .addComponent(jLabel2)
                                        .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(ApellidosLabel))))
                                    .addGap(8, 8, 8)
                                    .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NombreUsuarioTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(PreguntaSecretaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(NombresTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(ApellidosTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(ContrasenaPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(RespuestaSecretaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(CorreoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(VerificarContrasenaPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(VinculoComboBox, 0, 207, Short.MAX_VALUE)
                                        .addComponent(EscolaridadComboBox, 0, 207, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyPanelLayout.createSequentialGroup()
                                            .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(MonthComboBox, 0, 59, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(GeneroComboBox, 0, 207, Short.MAX_VALUE)
                                        .addComponent(PerfilComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 207, Short.MAX_VALUE)
                                        .addComponent(EstadoCuentaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 207, Short.MAX_VALUE)))
                                .addGroup(BodyPanelLayout.createSequentialGroup()
                                    .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ModificarAreasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ConsultarLabel)
                            .addGap(150, 150, 150)))))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(TittleLabel)
                .addGap(37, 37, 37)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreUsuarioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarLabel))
                .addGap(18, 18, 18)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContrasenaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerificarContrasenaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerificarContrasenaLabel))
                .addGap(9, 9, 9)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreguntaSecretaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreguntaSecretaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RespuestaSecretaLabel)
                    .addComponent(RespuestaSecretaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CorreoLabel))
                .addGap(14, 14, 14)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaNacimientoLabel)
                    .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GeneroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EscolaridadLabel)
                    .addComponent(EscolaridadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VinculoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VinculoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerfilLabel)
                    .addComponent(PerfilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoLabel)
                    .addComponent(EstadoCuentaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(ModificarAreasButton)
                    .addComponent(ModificarButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HeadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void ModificarAreasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAreasButtonActionPerformed
        biblioteca.gui.GUIModificarAreas GMA = new biblioteca.gui.GUIModificarAreas(parent);
        GMA.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ModificarAreasButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        if(!tipo){
            String username, nombre, apellido,
                pregunta, respuesta, correo, genero, nivel, vinculo, ano, mes, dia, fecha_nacimiento="",
                contrasenaS, estado;
                char[] contrasena;

        username=NombreUsuarioTextField1.getText();
        nombre=NombresTextField.getText();
        apellido=ApellidosTextField.getText();
        contrasena=ContrasenaPasswordField.getPassword();
        pregunta=PreguntaSecretaTextField.getText();
        respuesta=RespuestaSecretaTextField.getText();
        correo=CorreoTextField.getText();
        dia=(String)DayComboBox.getSelectedItem();
        mes=(String)MonthComboBox.getSelectedItem();
        ano=(String)YearComboBox.getSelectedItem();
        genero=(String)GeneroComboBox.getSelectedItem();
        nivel=(String)EscolaridadComboBox.getSelectedItem();
        vinculo=(String)VinculoComboBox.getSelectedItem();
        estado=getEstadoComboBox((String)EstadoCuentaComboBox.getSelectedItem());
        fecha_nacimiento=ano+"-"+mes+"-"+dia;
        contrasenaS=new String(contrasena);

        ControladorUsuario controlador=new ControladorUsuario();
        int i;
        if(checkEmptyFields()){
           i=controlador.modificarUsuario(username, nombre, apellido, genero, correo, contrasenaS, fecha_nacimiento, pregunta, respuesta, vinculo, nivel, estado);
           if(i!=-1)
               JOptionPane.showMessageDialog(null, "Datos Modificados con Exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        else{
            int i=-1, j=-1;
            String username=NombreUsuarioTextField1.getText();
            String estado=getEstadoComboBox((String)EstadoCuentaComboBox.getSelectedItem());
            String tipo_usuario=getPerfilComboBox((String)PerfilComboBox.getSelectedItem());
            System.err.println("estado "+estado);
            System.err.println("tipo_usuario "+tipo_usuario);
            int seleccion=0;
            if(estado.equals("f")){
                seleccion=JOptionPane.showConfirmDialog(this, "¿Está seguro de la desactivación de usuario?", "Deshabilitación de usuario", 2);
            }
            if(seleccion==0){
                i=new ControladorUsuario().cambiarTipoUsuario(username, tipo_usuario);
                j=new ControladorUsuario().cambiarEstadoCuenta(username, estado);
            }
            if(i!=-1 && j!=-1){
                JOptionPane.showMessageDialog(this, "Datos Modificados con Exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                parent.setVisible(true);
                this.dispose();
            }   
        }
}//GEN-LAST:event_ModificarButtonActionPerformed


    private void ConsultarDatosUsuario(String username){

        Usuario usuario= new ControladorUsuario().consultarUsuario(username);
        String fecha_nac=usuario.getFechaNacimiento();
        NombreUsuarioTextField1.setText(usuario.getLogin());
        NombresTextField.setText(usuario.getNombre());
        ApellidosTextField.setText(usuario.getApellido());
        ContrasenaPasswordField.setText(usuario.getContraseña());
        VerificarContrasenaPasswordField.setText(usuario.getContraseña());
        PreguntaSecretaTextField.setText(usuario.getPreguntaSecreta());
        RespuestaSecretaTextField.setText(usuario.getRespuestaSecreta());
        CorreoTextField.setText(usuario.getCorreoElectronico());
        DayComboBox.setSelectedItem(fecha_nac.substring(8, 10));
        MonthComboBox.setSelectedItem(fecha_nac.substring(5, 7));
        YearComboBox.setSelectedItem(fecha_nac.substring(0, 4));
        GeneroComboBox.setSelectedItem(usuario.getGenero());
        EscolaridadComboBox.setSelectedItem(usuario.getEscolaridad());
        VinculoComboBox.setSelectedItem(usuario.getVinculoUnivalle());
        SetEstadoComboBox(usuario.getActivo());
        SetPerfilComboBox(usuario.getPerfil());
    }

    private void SetEstadoComboBox(String estado){
        System.err.print(estado);
        if(estado.equals("t"))
            EstadoCuentaComboBox.setSelectedIndex(0);
        else
            EstadoCuentaComboBox.setSelectedIndex(1);

    }

    private void SetPerfilComboBox(String perfil){
        if(perfil.equals("3"))
            PerfilComboBox.setSelectedIndex(0);
        else if(perfil.equals("2"))
            PerfilComboBox.setSelectedIndex(1);

    }
    
    private String getPerfilComboBox(String perfil){
        if(perfil.equals("Usuario Catalogador"))
            return "2";
        return "1";
    }

    private String getEstadoComboBox(String estado){
        if(estado.equals("Activo"))
            return "t";
        return "f";
    }

     private boolean checkEmptyFields(){
        String contrasena=new String(ContrasenaPasswordField.getPassword());
        String vericontrasena=new String(VerificarContrasenaPasswordField.getPassword());
        if(NombreUsuarioTextField1.getText()==null || NombreUsuarioTextField1.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Por favor ingrese un Username", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(NombresTextField.getText() == null || NombresTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese sus Nombres", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(ApellidosTextField.getText() == null || ApellidosTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese sus Apellidos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(contrasena == null || contrasena.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese su contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(vericontrasena == null || vericontrasena.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese nuevamente su contraseña en el campo de Verificar Contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(PreguntaSecretaTextField.getText() == null || PreguntaSecretaTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese una Pregunta Secreta", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(RespuestaSecretaTextField.getText() == null || RespuestaSecretaTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese una Respuesta Secreta", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(!contrasena.equals(vericontrasena)){
            VerificarContrasenaPasswordField.setText("");
            JOptionPane.showMessageDialog(null, "Por favor vuelva a verificar su contraseña", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }


    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void ConsultarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarLabelMouseClicked
      
           Usuario usuario=new Usuario();
           usuario=new ControladorUsuario().consultarUsuario(NombreUsuarioTextField1.getText());
           if(usuario.getLogin().equals("")){
               JOptionPane.showMessageDialog(null, "Lo sentimos, el Nombre de Usuario no esta Disponible, por favor ingrese otro", "Error", JOptionPane.ERROR_MESSAGE);
                 }

            else{
                String fecha_nac=usuario.getFechaNacimiento();
                    NombreUsuarioTextField1.setText(usuario.getLogin());
                    NombresTextField.setText(usuario.getNombre());
                    ApellidosTextField.setText(usuario.getApellido());
                    ContrasenaPasswordField.setText(usuario.getContraseña());
                    VerificarContrasenaPasswordField.setText(usuario.getContraseña());
                    PreguntaSecretaTextField.setText(usuario.getPreguntaSecreta());
                    RespuestaSecretaTextField.setText(usuario.getRespuestaSecreta());
                    CorreoTextField.setText(usuario.getCorreoElectronico());
                    DayComboBox.setSelectedItem(fecha_nac.substring(8, 10));
                    MonthComboBox.setSelectedItem(fecha_nac.substring(5, 7));
                    YearComboBox.setSelectedItem(fecha_nac.substring(0, 4));
                    GeneroComboBox.setSelectedItem(usuario.getGenero());
                    EscolaridadComboBox.setSelectedItem(usuario.getEscolaridad());
                    VinculoComboBox.setSelectedItem(usuario.getVinculoUnivalle());
                    SetEstadoComboBox(usuario.getActivo());
                    SetPerfilComboBox(usuario.getPerfil());
                    
                    NombreUsuarioTextField1.setEnabled(false);
                    NombresTextField.setEnabled(false);
                    ApellidosTextField.setEnabled(false);
                    ContrasenaPasswordField.setEnabled(false);
                    VerificarContrasenaPasswordField.setEnabled(false);
                    PreguntaSecretaTextField.setEnabled(false);
                    RespuestaSecretaTextField.setEnabled(false);
                    CorreoTextField.setEnabled(false);
                    DayComboBox.setEnabled(false);
                    MonthComboBox.setEnabled(false);
                    YearComboBox.setEnabled(false);
                    GeneroComboBox.setEnabled(false);
                    EscolaridadComboBox.setEnabled(false);
                    VinculoComboBox.setEnabled(false);
                    PerfilComboBox.setEnabled(true);
                    EstadoCuentaComboBox.setEnabled(true);
                        }
        
    }//GEN-LAST:event_ConsultarLabelMouseClicked

    private void EstadoCuentaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCuentaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoCuentaComboBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidosLabel;
    private javax.swing.JTextField ApellidosTextField;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel ConsultarLabel;
    private javax.swing.JLabel ContrasenaLabel;
    private javax.swing.JPasswordField ContrasenaPasswordField;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JTextField CorreoTextField;
    private javax.swing.JComboBox DayComboBox;
    private javax.swing.JComboBox EscolaridadComboBox;
    private javax.swing.JLabel EscolaridadLabel;
    private javax.swing.JComboBox EstadoCuentaComboBox;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JLabel FechaNacimientoLabel;
    private javax.swing.JComboBox GeneroComboBox;
    private javax.swing.JLabel GeneroLabel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JButton ModificarAreasButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JComboBox MonthComboBox;
    private javax.swing.JTextField NombreUsuarioTextField1;
    private javax.swing.JTextField NombresTextField;
    private javax.swing.JComboBox PerfilComboBox;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JLabel PreguntaSecretaLabel;
    private javax.swing.JTextField PreguntaSecretaTextField;
    private javax.swing.JLabel RespuestaSecretaLabel;
    private javax.swing.JTextField RespuestaSecretaTextField;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel UniValleLabel;
    private javax.swing.JLabel VerificarContrasenaLabel;
    private javax.swing.JPasswordField VerificarContrasenaPasswordField;
    private javax.swing.JComboBox VinculoComboBox;
    private javax.swing.JLabel VinculoLabel;
    private javax.swing.JComboBox YearComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
