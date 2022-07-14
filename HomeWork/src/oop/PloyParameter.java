package oop;

public class PloyParameter {
    public static void main(String[] args) {
        CommEmployee ce = new CommEmployee("小明", 6000);
        Manager m = new Manager("老王", 10000, 5000);
        PloyParameter pp = new PloyParameter();
        pp.showEmpAnnual(ce);
        pp.testWork(ce);
        pp.showEmpAnnual(m);
        pp.testWork(m);


    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName() + "的年工资为: " + e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof CommEmployee){
            ((CommEmployee) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }

    }
}
