package user_2411699_model_class;

import java.time.LocalDate;

public class BankRecord {
    private final String transactionId, bankName;
    private final double amount;
    private final LocalDate settlementDate;

    public BankRecord(String transactionId, String bankName, double amount, LocalDate settlementDate) {
        this.transactionId = transactionId;
        this.bankName = bankName;
        this.amount = amount;
        this.settlementDate = settlementDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getBankName() {
        return bankName;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    @Override
    public String toString() {
        return "BankRecord{" +
                "transactionId='" + transactionId + '\'' +
                ", bankName='" + bankName + '\'' +
                ", amount=" + amount +
                ", settlementDate=" + settlementDate +
                '}';
    }
}
