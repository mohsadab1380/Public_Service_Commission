package user_2411699_model_class;

import java.time.LocalDateTime;

public class PaymentVoucher {
    private final String voucherId, payeeName, purpose, reference;
    private final double amount;
    private final LocalDateTime createdAt;
    private String bankTransferStatus;

    public PaymentVoucher(String voucherId, String payeeName, String purpose, String reference, double amount, LocalDateTime createdAt, String bankTransferStatus) {
        this.voucherId = voucherId;
        this.payeeName = payeeName;
        this.purpose = purpose;
        this.reference = reference;
        this.amount = amount;
        this.createdAt = createdAt;
        this.bankTransferStatus = bankTransferStatus;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getReference() {
        return reference;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getBankTransferStatus() {
        return bankTransferStatus;
    }

    public void setBankTransferStatus(String bankTransferStatus) {
        this.bankTransferStatus = bankTransferStatus;
    }

    @Override
    public String toString() {
        return "Payment Voucher\n" +
                "Voucher ID: " + voucherId + "\n" +
                "Payee: " + payeeName + "\n" +
                "Purpose: " + purpose + "\n" +
                "Reference: " + reference + "\n" +
                "Amount: " + amount + " BDT\n" +
                "Created At: " + createdAt + "\n" +
                "Bank Transfer Status: " + bankTransferStatus;
    }
}
