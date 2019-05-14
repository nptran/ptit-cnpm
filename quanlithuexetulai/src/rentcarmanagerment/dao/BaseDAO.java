package rentcarmanagerment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Phuc
 */
public class BaseDAO {

    // JDBC driver name and database URL
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/rentcar?useSSL=false";
    private final static String USER = "root";
    private final static String PASS = "31101998";

    protected static Connection con;

    public static void getInstance() throws SQLException {
        if (con == null) {
            try {
                Class.forName(JDBC_DRIVER);
                con = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

}
