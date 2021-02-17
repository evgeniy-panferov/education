package spring.jdbc.statementexample;

public abstract class AbstractStatement implements CommonStatement {
    protected String userName = "User";
    protected String password = "123";
    protected String connectionUrl = "jdbc:postgresql://localhost:5432/education";
    Class<?> aClass;

    {
        try {
            aClass = Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
