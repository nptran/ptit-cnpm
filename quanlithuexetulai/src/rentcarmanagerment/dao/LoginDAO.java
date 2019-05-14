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
public class LoginDAO extends BaseDAO {

    public LoginDAO() throws SQLException {
        getInstance();
    }

    public String login(String user, String pass, String role) throws SQLException {
        if (role == null) {
            throw new NullPointerException();
        }

        String name = "";
        String queryLogin = "SELECT name FROM rentcar.user \n"
                + "INNER JOIN rentcar.manager \n"
                + "ON id_user=id \n"
                + "WHERE username = ? \n"
                + "AND password = ? \n"
                + "AND role = ?";

        PreparedStatement statement = con.prepareStatement(queryLogin);
        statement.setString(1, user);
        statement.setString(2, pass);
        statement.setString(3, role);

        ResultSet rs = statement.executeQuery();

        if (!rs.isBeforeFirst()) {
            throw new SQLException();
        } else {
            while (rs.next()) {
                name = rs.getString(1);
            }
        }

        return name;
    }
}
