package spring.jdbc.statementexample;

import java.sql.SQLException;

public interface CommonStatement {
    void connect() throws ClassNotFoundException, SQLException;
}
