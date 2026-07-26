package user_2411699_model_class;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FinancialReport {
    private final String reportId, reportType, content;
    private final LocalDate fromDate, toDate;
    private final double totalIncome, totalExpense;
    private final int accountantId;
    private final LocalDateTime generatedAt;
    private String filePath;

    public FinancialReport(String reportId, String reportType, LocalDate fromDate, LocalDate toDate, double totalIncome, double totalExpense, String content, int accountantId, LocalDateTime generatedAt) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.content = content;
        this.accountantId = accountantId;
        this.generatedAt = generatedAt;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReportType() {
        return reportType;
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

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getBalance() {
        return totalIncome - totalExpense;
    }

    public int getAccountantId() {
        return accountantId;
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
        return "FinancialReport{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", period=" + fromDate + " to " + toDate +
                ", generatedAt=" + generatedAt +
                '}';
    }
}
