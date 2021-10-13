package designpatterns.decorator;

import java.util.List;

public class Director extends Manager{
    private String name;
    private String surname;

    public Director(String name, String surname, List<Employee> employees) {
        super(name, surname, employees);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Director "+name+" "+surname+" is working as employee\n");
    }


    public void workAsManager() {
        System.out.println("Director "+name+" "+surname+" is working as manager\n");
    }

    public void workAsDirector() {
        System.out.println("Director "+name+" "+surname+" is working as director\n");
    }
}
