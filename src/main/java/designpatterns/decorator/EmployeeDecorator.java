package designpatterns.decorator;

public abstract class EmployeeDecorator extends Employee{
    Employee employee;

    public EmployeeDecorator(String name, String surname) {
        super(name, surname);
    }

    public void work(){
    System.out.println("Employee is working");
        }

    public void workAsManager(){
        System.out.println("Manager is working");
    }

    public void workAsDirector(){
        System.out.println("Director is working ");
    }
}
