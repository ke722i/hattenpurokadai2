/**
 * アウェイチームを管理するクラス
 * 
 * @author K.Fujita
 */
public class AwayTeam extends Team {

    public AwayTeam(double scoringProbability) {
        super(scoringProbability);
    }

    @Override
    public void play() {
        System.out.println(name + "チームはアウェイでプレイしている");
        attemptToScore(); //ゴールを決める確率の処理を呼び出す
    }
}