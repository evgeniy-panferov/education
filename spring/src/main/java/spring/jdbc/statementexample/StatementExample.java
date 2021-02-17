package spring.jdbc.statementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample extends AbstractStatement {

    public void connect() throws ClassNotFoundException, SQLException {
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            System.out.println("We are connected in StatementExample");
            statement.executeUpdate("drop table if exists education ");
            statement.executeUpdate("create table education(id serial not null primary key, name varchar(50) not null," +
                    "job varchar(50) not null )");
            statement.executeUpdate("insert into education(name, job) values ('Vasya', 'Welder')");
            statement.executeUpdate("insert into education(name, job) values ('Tolya', 'Locksmith')");
            statement.executeUpdate("insert into education(name, job) values ('Kate', 'Cook')");
            statement.executeUpdate("insert into education(name, job) values ('Nastya', 'Seller')");
        }
    }
}
