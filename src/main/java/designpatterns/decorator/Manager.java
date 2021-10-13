package designpatterns.decorator;

import java.util.List;

public class Manager extends Employee {
  private List<Employee> employees;

  public Manager(String name, String surname, List<Employee> employees) {
    super(name, surname);
    this.employees = employees;
  }

  @Override
  public void work() {
    super.work();
    System.out.println("Manager " + getName() + " " + getSurname() + " is working as manager\n");
  }

  public void makeEmployeesWork() {
    for (Employee employee : employees) {
      System.out.println(
          "Employee " + employee.getName() + " " + employee.getSurname() + " is made to work\n");
      employee.work();
    }
    System.out.println("Manager " + getName() + " " + getSurname() + " is working as manager\n");
  }
}
