package user_2411699_model_class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AuditRecord {
    private final String voucherId, transactionId, headOfAccount;
    private final double amount;
    private final LocalDate recordDate;
    private final ArrayList<String> supportingDocuments;
    private String auditStatus, auditRemarks;

    public AuditRecord(String voucherId, String transactionId, String headOfAccount, double amount, LocalDate recordDate, ArrayList<String> supportingDocuments, String auditStatus) {
        this.voucherId = voucherId;
        this.transactionId = transactionId;
        this.headOfAccount = headOfAccount;
        this.amount = amount;
        this.recordDate = recordDate;
        this.supportingDocuments = supportingDocuments;
        this.auditStatus = auditStatus;
    }

    public String getVoucherId() {

        return voucherId;
    }

    public String getTransactionId() {

        return transactionId;
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

    public ArrayList<String> getSupportingDocuments() {

        return supportingDocuments;
    }

    public String getAuditStatus() {

        return auditStatus;
    }

    public String getAuditRemarks() {

        return auditRemarks;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public void setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
    }

    @Override
    public String toString() {
        return "AuditRecord{" +
                "voucherId='" + voucherId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", auditStatus='" + auditStatus + '\'' +
                '}';
    }
}
