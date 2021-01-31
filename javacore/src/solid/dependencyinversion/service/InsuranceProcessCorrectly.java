package solid.dependencyinversion.service;


import solid.dependencyinversion.ApiTemplate;
import solid.dependencyinversion.MySqlConnection;
import solid.dependencyinversion.Policy;

import java.time.LocalDate;
import java.util.List;

/*
Для решения не соответствия принципу Dependency Inversion, мы создали интерфейс SendMessage.
Теперь верхний модуль InsuranceService, зависит от абстракции в виде интерфейса, как и нижний модуль.
 */
public class InsuranceProcessCorrectly {

    public class InsuranceService {
        private List<SendMessage> sendMessages;
        private Repository repository;

        public void process(Policy policy) {
            LocalDate localDateNow = repository.getDate();
            if (policy.getLocalDate().isBefore(localDateNow)) {
                sendMessages.forEach(sendMessage -> sendMessage.sendMessage(policy));
            }
        }
    }

    public interface Repository {
        LocalDate getDate();
    }

    public class MySqlRepository implements Repository {

        @Override
        public LocalDate getDate() {
            MySqlConnection connection = new MySqlConnection("database.url");
            // идем в бд, от туда дергаем дату полиса
            return connection.getLocalDate();
        }
    }

    public class Api implements Repository {

        @Override
        public LocalDate getDate() {
            ApiTemplate connection = new ApiTemplate("api.ru");
            // идем в а сторонний сервис,и от туда дергаем дату полиса
            return connection.getLocalDate();
        }
    }

    public interface SendMessage {
        void sendMessage(Policy policy);
    }

    public class EmailMessage implements SendMessage {
        @Override
        public void sendMessage(Policy policy) {
            String name = policy.getUser().getName();
            String email = policy.getUser().getEmail();
            System.out.println("Просрочено");
// Шлем письмо клиенту на email, что полис просрочен
        }
    }

    public class MobilePhoneMessage implements SendMessage {
        @Override
        public void sendMessage(Policy policy) {
            String name = policy.getUser().getName();
            String phoneNumber = policy.getUser().getPhoneNumber();
            System.out.println("Просрочено");
            // Шлем письмо клиенту на мобильный, что полис просрочен
        }
    }
}