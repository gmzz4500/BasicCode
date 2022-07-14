package oop;

public class CommEmployee extends Employee {
    public CommEmployee() {
    }

    public CommEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("员工上班~");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
