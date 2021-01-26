package Solid.singleresponsibility.service;


import Solid.singleresponsibility.MySqlConnection;
import Solid.singleresponsibility.Policy;

import java.time.LocalDate;

/*
Все примеры можно разнести по разным классам, пишу так для упрощения
Этот пример удовлетворяет принципу SingleResponsibility
Каждый класс отвечает за выполнение одной задачи
 */
public class InsuranceProcessCorrectly {

    public class InsuranceService {
        private Message message;
        private MySqlRepository mySqlRepository;

        public void process(Policy policy) {
            LocalDate localDateNow = mySqlRepository.getDate(policy);
            if (policy.getLocalDate().isBefore(localDateNow)) {
                message.sendEmailMessage(policy);
            }
        }
    }

    public class MySqlRepository {
        private LocalDate getDate(Policy policy) {
            MySqlConnection connection = new MySqlConnection("database.url");
            // идем в бд, от туда дергаем дату полиса
            return connection.getLocalDate();
        }
    }

    public class Message {

        private void sendEmailMessage(Policy policy) {
            String name = policy.getUser().getName();
            String email = policy.getUser().getEmail();
            System.out.println("Просрочено");
// Шлем письмо клиенту, что полис просрочен

        }
    }

}
