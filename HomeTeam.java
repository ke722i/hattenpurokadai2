/**
 * ホームチームを管理するクラス
 * 
 * @author K.Fujita
 */
public class HomeTeam extends Team {

    public HomeTeam(double scoringProbability) {
        super(scoringProbability);
    }

    @Override
    public void play() {
        System.out.println(name + "チームはホームでプレイしている");
        attemptToScore(); //ゴールを決める確率の処理を呼び出す
    }
}