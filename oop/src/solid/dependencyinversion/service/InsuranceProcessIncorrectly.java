package solid.dependencyinversion.service;

import solid.dependencyinversion.MySqlConnection;
import solid.dependencyinversion.Policy;

import java.time.LocalDate;
import java.util.List;

/*
Dependency Inversion - зависимости внутри системы строятся на основе абстракций. Модули верхнего уровня не зависят от модулей нижнего уровня.
Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
В данном примере мы зависим от поставщика данных в виде MySqlRepository, модуль верхнего уровня зависит от модуля нижнего уровня, абстракция отсутствует.
 */

public class InsuranceProcessIncorrectly {

    public class InsuranceService {
        private List<SendMessage> sendMessages;
        private MySqlRepository mySqlRepository;

        public void process(Policy policy) {
            LocalDate localDateNow = mySqlRepository.getDate();
            if (policy.getLocalDate().isBefore(localDateNow)) {
                sendMessages.forEach(sendMessage -> sendMessage.sendMessage(policy));
            }
        }
    }

    public class MySqlRepository {

        public LocalDate getDate() {
            MySqlConnection connection = new MySqlConnection("database.url");
            // идем в бд, от туда дергаем дату полиса
            return connection.getLocalDate();
        }
    }

    public interface SendMessage {
        void sendMessage(Policy policy);
    }

    public class EmailMessage implements InsuranceProcessCorrectly.SendMessage {
        @Override
        public void sendMessage(Policy policy) {
            String name = policy.getUser().getName();
            String email = policy.getUser().getEmail();
            System.out.println("Просрочено");
// Шлем письмо клиенту на email, что полис просрочен
        }
    }

    public class MobilePhoneMessage implements InsuranceProcessCorrectly.SendMessage {
        @Override
        public void sendMessage(Policy policy) {
            String name = policy.getUser().getName();
            String phoneNumber = policy.getUser().getPhoneNumber();
            System.out.println("Просрочено");
            // Шлем письмо клиенту на мобильный, что полис просрочен
        }
    }
}
