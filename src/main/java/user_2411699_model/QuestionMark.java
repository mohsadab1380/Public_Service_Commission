package user_2411699_model;

import java.io.Serializable;

public class QuestionMark implements Serializable {

    private int questionNo;
    private int maxMark;
    private int obtainedMark;

    public QuestionMark (int questionNo, int maxMark, int obtainedMark) {
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

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public void setObtainedMark(int obtainedMark) {
        this.obtainedMark = obtainedMark;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }

    public int getObtainedMark() {
        return obtainedMark;
    }

    @Override
    public String toString() {
        return "QuestionMark{" +
                "questionNo=" + questionNo +
                ", maxMark=" + maxMark +
                ", obtainedMark=" + obtainedMark +
                '}';
    }
}