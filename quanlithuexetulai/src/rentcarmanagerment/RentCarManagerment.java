package rentcarmanagerment;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import rentcarmanagerment.view.LoginFrm;

/**
 *
 * @author Tran Phuc
 */
public class RentCarManagerment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrm().setVisible(true);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}
