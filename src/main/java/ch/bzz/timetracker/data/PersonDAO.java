package ch.bzz.timetracker.data;

import ch.bzz.timetracker.service.Config;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * data access object for person
 * Time Tracker
 *
 * @author Marcel Suter (Ghwalin)
 */
public class PersonDAO {

    /**
     * counts the number of users in the database
     * @return
     */
    public Integer count() {
        Connection connection = null;                                         // import java.sql.Connection;
        try {
            InitialContext initialContext = new InitialContext();
            // import javax.naming.InitialContext
            DataSource dataSource = (DataSource) initialContext.lookup(Config.getProperty("jdbcRessource")); // import javax.sql.DataSource
            connection = dataSource.getConnection();

        } catch (NamingException nameEx) {                                    // import javax.naming.NamingException
            nameEx.printStackTrace();
            throw new RuntimeException();
        } catch (SQLException sqlEx) {                                        // import java.sql.SQLException
            sqlEx.printStackTrace();
            throw new RuntimeException();
        }

        int countRows = 0;
        PreparedStatement prepStmt = null;
        ResultSet resultSet = null;
        String sqlQuery = "SELECT COUNT(*) FROM Person";
        try {
            prepStmt = connection.prepareStatement(sqlQuery);
            resultSet = prepStmt.executeQuery();

            if (resultSet.next()) {                // resultSet contains rows
                countRows = resultSet.getInt(1);   // get the value of the first attribute
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            throw new RuntimeException();
        }  finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (prepStmt != null)
                    prepStmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
                throw new RuntimeException();
            }
        }

        return countRows;

    }
}
