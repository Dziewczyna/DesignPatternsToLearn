package designpatterns.decorator;

import java.util.List;

public class Runner {
    public static void main(String[] args){
        Employee employee1 = new Employee("Jan","Kowalski");
        employee1.work();

        Manager manager1 = new Manager("Janusz","Nowak", List.of(employee1));
        manager1.work();
        manager1.makeEmployeesWork();

        Director director1 = new Director("Grażyna","Zaradna", List.of(manager1));
        director1.work();
        director1.workAsManager();
        director1.workAsDirector();
    }

}
