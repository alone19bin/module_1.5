package main.java.org.Nikolaev.oop.Mediator;

public class OneCProgrammMeatingRunner {
    public static void main(String[] args) {
        OneCProgrammMeating oneCProgrammMeating = new OneCProgrammMeating();

        Employee generalAccountant = new GeneralAccountant(oneCProgrammMeating, "GeneralAccountant");
        Employee accountant1 = new Accountant(oneCProgrammMeating, "Accountant1");
        Employee accountant2 = new Accountant(oneCProgrammMeating, "Accountant2");

        oneCProgrammMeating.setGeneralAccountant(generalAccountant);
        oneCProgrammMeating.addEmployeeToEmployee(accountant1);
        oneCProgrammMeating.addEmployeeToEmployee(accountant2);

        accountant1.sendMessage("i am a accountant1");
        generalAccountant.sendMessage("I am a general accountant");
    }
}
