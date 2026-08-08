package user_2411699_model;

public class EvaluationProgress {
    private final String examName, subject, reportPeriod;

    public EvaluationProgress(String examName, String subject, String reportPeriod) {
        this.examName = examName;
        this.subject = subject;
        this.reportPeriod = reportPeriod;
    }


    public String getExamName() {
        return examName;
    }

    public String getSubject() {
        return subject;
    }

    public String getReportPeriod() {
        return reportPeriod;
    }


    @Override
    public String toString() {
        return "Evaluation Progress Report\n" +
                "Examination: " + examName + "\n" +
                "Subject: " + subject + "\n" +
                "Report Period: " + reportPeriod;
    }
}
