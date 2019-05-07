package rentcarmanagerment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tran Phuc
 */

public class LoginDAO {

    // JDBC driver name and database URL
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/rentcar?useSSL=false";
    private final static String USER = "root";
    private final static String PASS = "31101998";

    public LoginDAO(String user, String pass) throws ClassNotFoundException, SQLException {
        Connection connector = null;
        PreparedStatement statement = null;
        boolean login = false;
        try {
            Class.forName(JDBC_DRIVER);
            connector = DriverManager.getConnection(DB_URL, USER, PASS);

            String queryLogin = "SELECT * FROM rentcar.manager WHERE username = ? AND password = ? AND role = 'MOD'";

            statement = connector.prepareStatement(queryLogin);
            statement.setString(1, user);
            statement.setString(2, pass);
            
            ResultSet rs = statement.executeQuery();

            if(!rs.isBeforeFirst()) {
                throw new SQLException();
            }
        } finally {
            try {
                connector.close();
            } catch (NullPointerException e) {
                /*
                 * conn will be null when wrong username or password 
                 * so do nothing here
                 */
            }
        }
    }
}
