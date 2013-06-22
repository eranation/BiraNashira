/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biranashira;

import java.awt.ComponentOrientation;

/**
 *
 * @author ehrannm
 */
public class BiraNashira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx = 0; idx < installedLookAndFeels.length; idx++) {
                if ("Windows".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final MainWindow mainWindow = new MainWindow();

                //mainWindow.applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
                mainWindow.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                mainWindow.setVisible(true);



            }
        });


    }
}
