package sample;

public class Switch {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var score = 8;
        
        switch(score / 10) {
            case 10 -> System.out.print("満点！すごい！！");
            case 9,8 -> System.out.print("いいね！満点目指して頑張ろう！");
            case 7,6 -> System.out.print("合格！さらに上を！");
            default -> System.out.print("もう一回！！");
        }
    }

}
