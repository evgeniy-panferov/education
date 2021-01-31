package solid.openclose;

import java.time.LocalDate;

public class MySqlConnection {

    private String dbName;

    public MySqlConnection(String dbName) {
        this.dbName = dbName;
    }

    public LocalDate getLocalDate() {
        return LocalDate.now();
    }
}
