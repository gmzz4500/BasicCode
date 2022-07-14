package com.yyds.homework;

public class HumanDemo {
    public static void main(String[] args) {
        BasketballPlayer bp = new BasketballPlayer("林书豪",25);
        bp.eat("牛肉");
        bp.sleep();
        bp.Study();
        bp.studyEnglish();
        BasketballTrainer bt = new BasketballTrainer("姚明", 40);
        bt.eat("鸡肉");
        bt.sleep();
        bt.teach();
        bt.studyEnglish();
        PingPongPlayer ppp = new PingPongPlayer("孙颖莎", 20);
        ppp.eat("鸭肉");
        ppp.sleep();
        PingPongTrainer ppt = new PingPongTrainer("刘胖子", 50);
        ppt.eat("猪肉");
        ppt.sleep();
        ppt.teach();

    }
}
