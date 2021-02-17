package spring.jdbc.statementexample;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class JdbcExample extends AbstractStatement {

    private List<CommonStatement> statementList;

    public JdbcExample(CommonStatement... statements) {
        this.statementList = Arrays.asList(statements);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcExample example = new JdbcExample(new StatementExample(), new PrepareStatementExample(), new CallableStatementExample());
        example.connect();

    }

    @Override
    public void connect() throws ClassNotFoundException, SQLException {
        for (CommonStatement statement : statementList) {
            statement.connect();
        }
    }
}
