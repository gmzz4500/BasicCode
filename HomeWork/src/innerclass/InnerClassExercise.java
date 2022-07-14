package innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
        Cellphone cellPhone = new Cellphone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
