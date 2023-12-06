package main.java.org.Nikolaev.oop.Mediator;

import java.util.ArrayList;
import java.util.List;

public class OneCProgrammMeating implements OneCProgramm{
    Employee generalAccountant;
    List<Employee> employees = new ArrayList<>();

    public void setGeneralAccountant(Employee generalAccountant) {
        this.generalAccountant = generalAccountant;
    }
    public void addEmployeeToEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void sendMassage(String message, Employee employee) {
            for (Employee em: employees) {
                if(em != employee) {
                    em.getMessage(message);
                }
            }
            generalAccountant.getMessage(message);
    }
}
