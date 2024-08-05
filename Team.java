import java.util.Random;
import java.util.Scanner;

/**
 * チームを管理するクラス
 * 
 * @author K.Fujita
 */
public abstract class Team extends Object {
    protected String name;
    protected int goals;
    protected double scoringProbability; // ゴールを決める確率

    /**
     * Teamオブジェクトの初期化
     * 
     * @param name
     * @param scoringProbability
     */
    public Team(double scoringProbability) {
        this.goals = 0;
        this.scoringProbability = scoringProbability;
    }

    /**
     * 
     */
    public abstract void play();

    /**
     * 両チームの名前を設定する処理
     * 
     * @param sc
     */
    public void setTeamName(Scanner sc) {
        this.name = sc.nextLine();
    }
    
    /**
     * 生成されたランダムな値が、チームの得点確率(scoringProbability)
     * よりも小さいかどうかを確認する
     */
    public void attemptToScore() {
        Random random = new Random();
        int attempts = 5; //両チームのチャンスの数

        for (int i = 0; i < attempts; i++) {
            if (random.nextDouble() < this.scoringProbability){
                scoreGoals(1); //１ずつ増加
            }
        }
    }

    /**
     * チームがゴールを決めた際に呼び出される処理
     * 
     * チームのゴール数を指定された数だけ増加させるメソッド
     */
    public void scoreGoals(int numberOfGoals) {
        if(numberOfGoals > 0) {
            this.goals += numberOfGoals;
        }
    }

    /**
     * チームの得点数を取得するメソッド
     * 
     * @return
     */
    public int getGoals() {
        return this.goals;
    }

    /**
     * チーム名を取得するメソッド
     * 
     * @return
     */
    public String getName() {
        return this.name;
    }
}