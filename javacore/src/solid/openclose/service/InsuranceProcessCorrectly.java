package solid.openclose.service;


import solid.openclose.MySqlConnection;
import solid.openclose.Policy;

import java.time.LocalDate;
import java.util.List;

/*
open-close principle, программные сущности (классы, модули, функции и т. п.) должны быть открыт для расширения, но закрыты для изменения.
Тут мы используем интерфейс для решения нашей проблемы.
Получается мы можем расширять функциональность, в области отправки сообщений, не внося при этом изменения в самом классе, из которого происходит вызов.
Решаем проблему с Dependency Inversion, путем создания интерфейса, теперь InsuranceService - модуль верхнего уровня не зависит от модуля нижнего уровня, он зависит от абстракции.
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