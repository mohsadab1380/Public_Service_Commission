package user_2411699_model_class;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReconciliationSummary {
    private final String summaryId;
    private final LocalDate fromDate, toDate;
    private final int totalRecords, matchedRecords, mismatchedRecords, duplicateRecords, failedRecords, pendingRecords;
    private final double totalAmount;
    private final int accountantId;
    private final LocalDateTime generatedAt;

    public ReconciliationSummary(String summaryId, LocalDate fromDate, LocalDate toDate, int totalRecords, int matchedRecords, int mismatchedRecords, int duplicateRecords, int failedRecords, int pendingRecords, double totalAmount, int accountantId, LocalDateTime generatedAt) {
        this.summaryId = summaryId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalRecords = totalRecords;
        this.matchedRecords = matchedRecords;
        this.mismatchedRecords = mismatchedRecords;
        this.duplicateRecords = duplicateRecords;
        this.failedRecords = failedRecords;
        this.pendingRecords = pendingRecords;
        this.totalAmount = totalAmount;
        this.accountantId = accountantId;
        this.generatedAt = generatedAt;
    }

    public String getSummaryId() {
        return summaryId;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public int getMatchedRecords() {
        return matchedRecords;
    }

    public int getMismatchedRecords() {
        return mismatchedRecords;
    }

    public int getDuplicateRecords() {
        return duplicateRecords;
    }

    public int getFailedRecords() {
        return failedRecords;
    }

    public int getPendingRecords() {
        return pendingRecords;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getAccountantId() {
        return accountantId;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    @Override
    public String toString() {
        return "Reconciliation Summary Report\n" +
                "Summary ID: " + summaryId + "\n" +
                "Period: " + fromDate + " to " + toDate + "\n" +
                "Total Records: " + totalRecords + "\n" +
                "Matched: " + matchedRecords + "\n" +
                "Mismatched: " + mismatchedRecords + "\n" +
                "Duplicate: " + duplicateRecords + "\n" +
                "Failed: " + failedRecords + "\n" +
                "Pending: " + pendingRecords + "\n" +
                "Total Amount: " + totalAmount + " BDT\n" +
                "Accountant ID: " + accountantId + "\n" +
                "Generated At: " + generatedAt;
    }
}
