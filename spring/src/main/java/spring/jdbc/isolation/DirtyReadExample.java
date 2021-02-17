package spring.jdbc.isolation;

import lombok.SneakyThrows;

import java.sql.*;

//Dirty Read Example, в postgresql read_uncommitted защищает от грязного чтения, но в дргуих бд, например Mysql допускается.

public class DirtyReadExample {
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
        DirtyReadExample isolationExample = new DirtyReadExample();
        isolationExample.run();
    }

    private void run() throws SQLException, ClassNotFoundException, InterruptedException {
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            statement.execute("update education set job ='pilot' where id =1");
            new Other().start();
            Thread.sleep(5000);
            connection.rollback();
        }
    }

    class Other extends Thread {

        @SneakyThrows
        @Override
        public void run() {
            try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
                 Statement statement = connection.createStatement()) {
                connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
                connection.setAutoCommit(false);
                ResultSet resultSet = statement.executeQuery("select * from education");
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name") + " " + resultSet.getString("job"));
                }
            }
        }
    }
}
