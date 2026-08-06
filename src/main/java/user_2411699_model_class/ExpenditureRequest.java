package user_2411699_model_class;

import java.time.LocalDate;

public class ExpenditureRequest {
    private final String requestId, department, purpose, requestedBy, financialPeriod;
    private final double amount;
    private final LocalDate requestDate;
    private final boolean approvalAuthorityVerified;
    private String status;

    public ExpenditureRequest(String requestId, String department, String purpose, String requestedBy, String financialPeriod, double amount, LocalDate requestDate, boolean approvalAuthorityVerified, String status) {
        this.requestId = requestId;
        this.department = department;
        this.purpose = purpose;
        this.requestedBy = requestedBy;
        this.financialPeriod = financialPeriod;
        this.amount = amount;
        this.requestDate = requestDate;
        this.approvalAuthorityVerified = approvalAuthorityVerified;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public String getFinancialPeriod() {
        return financialPeriod;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public boolean isApprovalAuthorityVerified() {
        return approvalAuthorityVerified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ExpenditureRequest{" +
                "requestId='" + requestId + '\'' +
                ", department='" + department + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
