package designpatterns.decorator;

public class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void work()
    {
        System.out.println("Employee "+name+" "+surname+" is working");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
