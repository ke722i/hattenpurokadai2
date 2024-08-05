/**
 * サッカーの試合を管理するクラス
 * 
 * @author K.Fujita
 */
public class Match extends Object {
    private Team homeTeam;
    private Team awayTeam;

    /**
     * Matchオブジェクトの初期化
     * 
     * @param homeTeam
     * @param awayTeam
     */
    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    /**
     * 試合開始の処理
     */
    public void start() {
        System.out.println(this.homeTeam.getName() + "対" + this.awayTeam.getName() + "の試合が始まりました！");
        
        this.homeTeam.play(); //試合のシムレイション
        this.awayTeam.play(); //試合のシムレイション

        this.printScores(); //スコアを出力する

        this.printResult(); //試合結果を出力する
    }

    /**
     * 両チームのゴール数を出力
     */
    private void printScores() {
        System.out.println(this.homeTeam.getName() + "が" + this.homeTeam.getGoals() + "点を決めた");
        System.out.println(this.awayTeam.getName() + "が" + this.awayTeam.getGoals() + "点を決めた");
    }
    
    /**
     * 試合結果を出力
     */
    private void printResult() {
        int homeGoals = this.homeTeam.getGoals();
        int awayGoals = this.awayTeam.getGoals();

        if (homeGoals > awayGoals) {
            System.out.println(this.homeTeam.getName() + "の勝利");
        } else if (homeGoals < awayGoals) {
            System.out.println(this.awayTeam.getName() + "の勝利");
        } else {
            System.out.println("同点");
        }
    }
}