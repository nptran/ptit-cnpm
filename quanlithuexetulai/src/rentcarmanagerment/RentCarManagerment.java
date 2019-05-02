package rentcarmanagerment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Phuc
 */
public class RentCarManagerment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("org.h2.Driver");
            String dbUrl = "jdbc:h2:~/test";
            conn = DriverManager.getConnection(dbUrl, "test", "test");
            
            System.out.println("Connected to database!");
        } catch (SQLException ex) {
            Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RentCarManagerment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
