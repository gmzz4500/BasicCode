package com.yyds.test;

public class Demo {
    public static void main(String[] args) {
        BasketballPlayer bp = new BasketballPlayer("林书豪",25);
        bp.eat("牛肉");
        bp.sleep();
        bp.study();
        bp.learnEnglish();
        BasketballCoach bc = new BasketballCoach("姚明", 45);
        bc.eat("香肠");
        bc.sleep();
        bc.teach();
        bc.learnEnglish();
        PingPongPlayer ppp = new PingPongPlayer("孙颖莎", 20);
        ppp.eat("羊肉");
        ppp.sleep();
        ppp.study();
        PingPongCoach ppc = new PingPongCoach("刘胖子", 50);
        ppc.eat("猪肉");
        ppc.sleep();
        ppc.teach();
    }
}
