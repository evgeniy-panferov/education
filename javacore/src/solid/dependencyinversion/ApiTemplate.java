package solid.dependencyinversion;

import java.time.LocalDate;

public class ApiTemplate {

    private String apiName;

    public ApiTemplate(String apiName) {
        this.apiName = apiName;
    }

    public LocalDate getLocalDate() {
        return LocalDate.now();
    }
}
