package user_2411699_model_class;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EvaluationReport {
    private final String reportId, reportType, examName, content;
    private final LocalDate fromDate, toDate;
    private final int totalScripts, evaluatedScripts, pendingScripts, examinerId;
    private final double averageMarks;
    private final LocalDateTime generatedAt;
    private String filePath;

    public EvaluationReport(String reportId, String reportType, String examName, LocalDate fromDate, LocalDate toDate, int totalScripts, int evaluatedScripts, int pendingScripts, double averageMarks, String content, int examinerId, LocalDateTime generatedAt) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.examName = examName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalScripts = totalScripts;
        this.evaluatedScripts = evaluatedScripts;
        this.pendingScripts = pendingScripts;
        this.averageMarks = averageMarks;
        this.content = content;
        this.examinerId = examinerId;
        this.generatedAt = generatedAt;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public String getExamName() {
        return examName;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public int getTotalScripts() {
        return totalScripts;
    }

    public int getEvaluatedScripts() {
        return evaluatedScripts;
    }

    public int getPendingScripts() {
        return pendingScripts;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "EvaluationReport{" +
                "reportId='" + reportId + '\'' +
                ", examName='" + examName + '\'' +
                ", evaluatedScripts=" + evaluatedScripts +
                ", generatedAt=" + generatedAt +
                '}';
    }
}
