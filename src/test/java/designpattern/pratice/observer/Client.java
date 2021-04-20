package designpattern.pratice.observer;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        // 3개까지의 점수만 출력함
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        scoreRecord.setDataSheetView(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);

            // 10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
            scoreRecord.addScore(score);
        }
    }
}
