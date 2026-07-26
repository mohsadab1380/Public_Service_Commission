package user_2411699_model_class;

import java.time.LocalDate;

public class FinancialRecord {
    private final String recordId, category, description, headOfAccount;
    private final double amount;
    private final LocalDate recordDate;
    private boolean entryComplete;

    public FinancialRecord(String recordId, String category, String description, String headOfAccount, double amount, LocalDate recordDate, boolean entryComplete) {
        this.recordId = recordId;
        this.category = category;
        this.description = description;
        this.headOfAccount = headOfAccount;
        this.amount = amount;
        this.recordDate = recordDate;
        this.entryComplete = entryComplete;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getHeadOfAccount() {
        return headOfAccount;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public boolean isEntryComplete() {
        return entryComplete;
    }

    public void setEntryComplete(boolean entryComplete) {
        this.entryComplete = entryComplete;
    }

    @Override
    public String toString() {
        return "FinancialRecord{" +
                "recordId='" + recordId + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", recordDate=" + recordDate +
                '}';
    }
}
