package user_2411699_model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FinancialReport implements Serializable {
    private final String recordId, reportType;
    private final double amount;
    private final LocalDate generatedAt;

    public FinancialReport(String recordId, String reportType, double amount,LocalDate generatedAt) {
        this.recordId = recordId;
        this.reportType = reportType;
        this.amount = amount;
        this.generatedAt = generatedAt;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getReportType() {
        return reportType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getGeneratedAt() {
        return generatedAt;
    }

    @Override
    public String toString() {
        return "FinancialReport{" +
                "recordId='" + recordId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", amount=" + amount +
                ", generatedAt=" + generatedAt +
                '}';
    }
}