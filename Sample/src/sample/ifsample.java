package sample;

public class ifsample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        var score = 60;
        
        if (score >= 60) {
            System.out.println("合格だ！");
        } else if (score<60 && score >= 50) {
            System.out.println("あと一息！がんばれ！！");
     
        } else {
            System.out.println("残念…。勉強してリトライだ！！");
        }
        
    }

}
