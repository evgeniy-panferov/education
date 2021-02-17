package spring.jdbc.isolation;

import lombok.SneakyThrows;

import java.sql.*;

public class NonRepeatableRead {
    private String userName = "User";
    private String password = "123";
    private String connectionUrl = "jdbc:postgresql://localhost:5432/education";

    {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException {
        NonRepeatableRead isolationExample = new NonRepeatableRead();
        isolationExample.run();
    }

    private void run() throws SQLException, ClassNotFoundException, InterruptedException {
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            ResultSet resultSet = statement.executeQuery("select * from education");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getString("job"));
            }

            new Other().start();
            System.out.println("-------------------");
            Thread.sleep(2000);

            ResultSet resultSet2 = statement.executeQuery("select * from education");
            while (resultSet2.next()) {
                System.out.println(resultSet2.getString("name") + " " + resultSet2.getString("job"));
            }
        }
    }

    class Other extends Thread {

        @SneakyThrows
        @Override
        public void run() {
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
                 Statement statement = connection.createStatement()) {
                connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
                connection.setAutoCommit(false);
                statement.executeUpdate("update education set job = 'Driver' where id=1");
                connection.commit();
            }
        }
    }
}
