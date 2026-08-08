package user_2411699_model;

import java.io.Serializable;

public class AuditRecord implements Serializable {
    private final String voucherId, transactionId;
    private final double amount;
    private String AuditStatus;

    public AuditRecord(String voucherId, String transactionId, double amount, String auditStatus) {
        this.voucherId = voucherId;
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getAuditStatus() {
        return AuditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.AuditStatus = AuditStatus;
    }

    @Override
    public String toString() {
        return "AuditRecord{" +
                "voucherId='" + voucherId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", AuditStatus='" + AuditStatus + '\'' +
                '}';
    }
}