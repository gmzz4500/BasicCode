package oop;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理管理员工~");
    }

    @Override
    public double getAnnual() {
        return bonus + super.getAnnual();
    }
}
