package solid.singleresponsibility.service;

/*
Все примеры можно разнести по разным классам, пишу так для упрощения
Single Responsibility, каждый объект должен иметь одну ответственность и эта ответственность должна быть полностью инкапсулирована в класс.
В примере ниже имеем нарушения данного принципа, в одном классе у нас есть три причины для изменения:
1) Процесс обработки заказа
2) Процесс сохранения заказа в БД
3) Процесс отправки сообщения пользователю по email.
 */

import solid.singleresponsibility.MySqlConnection;
import solid.singleresponsibility.Policy;

import java.time.LocalDate;

public class InsuranceProcessIncorrectly {

    public class InsuranceService {
        public void process(Policy policy) {
            LocalDate localDateNow = getDate(policy);
            if (policy.getLocalDate().isAfter(localDateNow)) {
                sendEmailMessage(policy);
            }
        }
    }

    private LocalDate getDate(Policy policy) {
        MySqlConnection connection = new MySqlConnection("database.url");
        // идем в бд, от туда дергаем дату полиса
        return LocalDate.now();
    }

    private void sendEmailMessage(Policy policy) {
        String name = policy.getUser().getName();
        String email = policy.getUser().getEmail();
        // Шлем письмо клиенту, что полис просрочен
    }
}
