package solid.liskov.service;


import solid.liskov.MySqlConnection;
import solid.liskov.Policy;

import java.time.LocalDate;
import java.util.List;

/*
Если есть кусок кода, куда приходит базовый класс Parent, то в этот же кусок кода должен приходить класс наследник и при это не должно ни чего сломаться.
Если мы можем заменять типы своими подтипами, то иерархия корректна.
 - В чем проблема тут?
 - Проблема в том, что расширяющий класс, изменяет ожидаемое поведение клиента, т.е клиент ждет что сообщение будет отправлено, а мы собственноручно,
  как результат кидаем exception.
 - Получается что подтип родительского класса не может быть использован клиентом.
 */
public class InsuranceProcess {

    public class InsuranceService {
        protected List<SendMessage> sendMessages;
        protected Repository repository;

        public void process(Policy policy) {
            LocalDate localDateNow = repository.getDate();
            if (policy.getLocalDate().isBefore(localDateNow)) {
                sendMessages.forEach(sendMessage -> sendMessage.sendMessage(policy));
            }
        }
    }

    public class CustomInsuranceService extends InsuranceService {

        public void process(Policy policy) {
            LocalDate localDateNow = repository.getDate();
            if (policy.getLocalDate().isBefore(localDateNow)&& policy.getUser().getName().equals("Vasya")) {
                throw new IllegalStateException("Broked");
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