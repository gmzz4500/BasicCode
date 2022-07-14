package method;

public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod hm = new HspMethod();
        System.out.println(hm.showScore("milan", 90.1, 80.0));
        System.out.println(hm.showScore("terry", 90.1, 80.0, 10, 30.5, 70));
    }
}

class HspMethod {
    public String showScore(String name, double... score) {
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return name + "同学有" + score.length + "门课的总成绩为:" + totalScore;
    }
}