package spring.jdbc.statementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementExample extends AbstractStatement {

    public void connect() throws ClassNotFoundException, SQLException {
        PreparedStatement preparedStatement = null;
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
            System.out.println("We are connected in PrepareStatementExample");
            String insert = "insert into education(name, job) values (?,?) ";
            preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, "Alina");
            preparedStatement.setString(2, "Marketer");
            preparedStatement.execute();
        } finally {
            preparedStatement.close();
        }

    }
}
