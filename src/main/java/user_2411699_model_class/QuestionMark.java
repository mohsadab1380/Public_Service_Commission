package user_2411699_model_class;

public class QuestionMark {
    private final int questionNo, maxMark;
    private Integer obtainedMark;

    public QuestionMark(int questionNo, int maxMark, Integer obtainedMark) {
        this.questionNo = questionNo;
        this.maxMark = maxMark;
        this.obtainedMark = obtainedMark;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public Integer getObtainedMark() {
        return obtainedMark;
    }

    public void setObtainedMark(Integer obtainedMark) {
        this.obtainedMark = obtainedMark;
    }

    @Override
    public String toString() {
        return "Q" + questionNo + ": " + (obtainedMark == null ? "-" : obtainedMark) + "/" + maxMark;
    }
}
