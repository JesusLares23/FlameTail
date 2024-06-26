
package vista;

import control.Registro;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import usuarios.Usuario;
import validadores.Validadores;

/**
 * 
 * 
 * @author Jesús Pedro Lares Valencia - 00000233383
 *          
 */
public class frmLogin extends javax.swing.JFrame {

    public static Usuario usuario = new Usuario();
    public static int scoreMax;
    private Validadores validador = new Validadores();
    private Registro registro = new Registro("Registros.dat");
    Graphics g;
    
    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource(""));
        btnIniciar.setIcon(new ImageIcon(setearImagen(icon)));
        ImageIcon icon2 = new ImageIcon(getClass().getResource(""));
        btnRegistrarse.setIcon(new ImageIcon(setearImagen(icon2)));
        
        ImageIcon fondo = new ImageIcon(getClass().getResource(""));
        Image imgFondo = fondo.getImage();
        Image newFondo = imgFondo.getScaledInstance(910, 680, java.awt.Image.SCALE_SMOOTH);
        lblFondo.setIcon(new ImageIcon(newFondo));
    }
    
    public Image setearImagen(ImageIcon icon){
        
        Image image = icon.getImage();
        Image newImg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        return newImg;
        
    }
    
    public Image getIconImage(){
        Image setValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(""));
        return setValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        lblContra = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(252, 138, 62), new java.awt.Color(255, 102, 0), new java.awt.Color(196, 66, 1), new java.awt.Color(153, 51, 0)));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));

        txtContra.setBackground(new java.awt.Color(204, 204, 204));
        txtContra.setForeground(new java.awt.Color(51, 51, 51));

        lblContra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContra.setForeground(new java.awt.Color(204, 204, 204));
        lblContra.setText("Contraseña");

        btnIniciar.setText("Iniciar");
        btnIniciar.setPreferredSize(new java.awt.Dimension(87, 23));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContra)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarse))
                        .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 240, 210));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/login1.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (validador.validaApodo(txtUsuario.getText()) && validador.validaContrasena(txtContra.getText())) {
            try {
                Usuario user = (Usuario) registro.obten(new Usuario(txtUsuario.getText(), "", "", ""));
                if (user != null) {
                    if (user.getContra().equals(txtContra.getText())) {
                        usuario = user;
                        scoreMax = user.getScore();
                        JOptionPane.showMessageDialog(this, "Se a logueado exitosamente");
                        frmPrincipal frmPrincipal = new frmPrincipal();
                        frmPrincipal.setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario no registrado");
                }
            }catch (Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else{
            if (!validador.validaApodo(txtUsuario.getText()) && !validador.validaContrasena(txtContra.getText())) {
                JOptionPane.showMessageDialog(this, "El formato de ambos campos son invalidos");
            }else if (!validador.validaContrasena(txtContra.getText())){
                JOptionPane.showMessageDialog(this, "El formato de la contraseña es invalido");
            }else{
                JOptionPane.showMessageDialog(this, "El formato de ambos campos es invalido");
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        frmUsuarios frmUsuario = new frmUsuarios();
        frmUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
