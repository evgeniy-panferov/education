package spring.jdbc.statementexample;

import java.sql.*;

public class CallableStatementExample extends AbstractStatement {

    public void connect() throws SQLException {
        CallableStatement callableStatement = null;
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
            System.out.println("We are connected in CallableStatementExample");
            String sql = "CALL insert_people(?,?)";
            callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1, "Peter");
            callableStatement.setString(2, "loader");
            callableStatement.execute();
        } finally {
            callableStatement.close();
        }
    }
}
