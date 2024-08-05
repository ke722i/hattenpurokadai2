import java.util.Scanner;

/**
 * Main
 * 
 * @author K.Fujita
 */
public class Main extends Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //ホームチームの作成
        Team homeTeam = new HomeTeam(0.55); //ホームチームがゴールを決める確率（55％）
        System.out.println("ホームチームの名前を入力してください");
        homeTeam.setTeamName(sc);

        //アウェイチームの作成
        Team awayTeam = new AwayTeam(0.45); //アウェイチームがゴールを決める確率（45％）
        System.out.println("アウェイトームの名前を入力してください");
        awayTeam.setTeamName(sc);

        Match match = new Match(homeTeam, awayTeam);

        match.start();

        sc.close();
    }
}

/**
 * 他者レビュー
 * 
 * 後藤(R2SC06):点数が毎回ランダムに出るよう作られてるのが良い 
 */