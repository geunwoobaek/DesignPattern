package designpattern.pratice.observer;

import java.util.*;

public class ScoreRecord {
    private List<Integer> scores=new ArrayList<Integer>();
    private DataSheetView dataSheetView; //점수 출력하기 위한 클래스

    public List<Integer> getScores() {
        return scores;
    }

    public void addScore(int score) {
        scores.add(score);
        dataSheetView.update();
    }

    public DataSheetView getDataSheetView() {
        return dataSheetView;
    }

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }
}
class DataSheetView{
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public ScoreRecord getScoreRecord() {
        return scoreRecord;
    }

    public void setScoreRecord(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScores(); // 점수를 조회함
        displayScores(record, viewCount); // 조회된 점수를 viewCount 만큼만 출력함
    }
    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
