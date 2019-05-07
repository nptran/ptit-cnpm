package rentcarmanagerment;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
//        Connection conn = null;
//        try {
//            Class.forName("org.h2.Driver");
//            String dbUrl = "jdbc:h2:~/test";
//            conn = DriverManager.getConnection(dbUrl, "test", "test");
//
//            System.out.println("Connected to database!");
//        } catch (SQLException ex) {
//            Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                conn.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

        /* Set the look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrm().setVisible(true);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
