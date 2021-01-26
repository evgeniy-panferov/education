package solid.openclose.service;

import solid.openclose.MySqlConnection;
import solid.openclose.Policy;

import java.time.LocalDate;

/*
В этом классе мы нарушаем open-close principle, при добавлении новой реализации уведомления пользователя нам нужно лезть
в класс сервиса и добавлять метод.
 - Что у нас получается ?
 - Мы добавили новую реализацию, но эта реализация потребовала изменение в другом классе InsuranceService - сервисе.
 - Тут же мы имеем проблемы с MySqlRepository, от него зависит класс сервиса, нарушаем Dependency Inversion,
  тут высокоуровневый класс имеет зависимость от низкоуровневого MySqlRepository.
 */

public class InsuranceProcessIncorrectly {

    public class InsuranceService {
        private MySqlRepository mySqlRepository;
        private MessageSender sendMessage;

        public void process(Policy policy) {

            LocalDate localDateNow = mySqlRepository.getDate();

            if (policy.getLocalDate().isBefore(localDateNow)) {
                    sendMessage.sendEmailMessage(policy);
                    sendMessage.sendPhoneMessage(policy);
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

    public class MessageSender {

        public void sendEmailMessage(Policy policy) {
            String name = policy.getUser().getName();
            String email = policy.getUser().getEmail();
            System.out.println("Просрочено");
// Шлем письмо клиенту на email, что полис просрочен
        }

        public void sendPhoneMessage(Policy policy) {
            String name = policy.getUser().getName();
            String phoneNumber = policy.getUser().getPhoneNumber();
            System.out.println("Просрочено");
        }
    }
}
