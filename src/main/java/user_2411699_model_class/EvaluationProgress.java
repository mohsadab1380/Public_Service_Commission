package user_2411699_model_class;

public class EvaluationProgress {
    private final String examName, subject, reportPeriod;
    private final int totalAssignedScripts, evaluatedScripts, pendingScripts;
    private final double completionPercent, averageEvaluationMinutes;

    public EvaluationProgress(String examName, String subject, String reportPeriod, int totalAssignedScripts, int evaluatedScripts, int pendingScripts, double completionPercent, double averageEvaluationMinutes) {
        this.examName = examName;
        this.subject = subject;
        this.reportPeriod = reportPeriod;
        this.totalAssignedScripts = totalAssignedScripts;
        this.evaluatedScripts = evaluatedScripts;
        this.pendingScripts = pendingScripts;
        this.completionPercent = completionPercent;
        this.averageEvaluationMinutes = averageEvaluationMinutes;
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

    public int getTotalAssignedScripts() {
        return totalAssignedScripts;
    }

    public int getEvaluatedScripts() {
        return evaluatedScripts;
    }

    public int getPendingScripts() {
        return pendingScripts;
    }

    public double getCompletionPercent() {
        return completionPercent;
    }

    public double getAverageEvaluationMinutes() {
        return averageEvaluationMinutes;
    }

    @Override
    public String toString() {
        return "Evaluation Progress Report\n" +
                "Examination: " + examName + "\n" +
                "Subject: " + subject + "\n" +
                "Report Period: " + reportPeriod + "\n" +
                "Total Assigned Scripts: " + totalAssignedScripts + "\n" +
                "Evaluated Scripts: " + evaluatedScripts + "\n" +
                "Pending Scripts: " + pendingScripts + "\n" +
                "Completion Percentage: " + String.format("%.2f", completionPercent) + "%\n" +
                "Average Evaluation Time: " + String.format("%.1f", averageEvaluationMinutes) + " minutes";
    }
}
