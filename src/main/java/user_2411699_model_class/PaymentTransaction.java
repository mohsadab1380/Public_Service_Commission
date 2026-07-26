package user_2411699_model_class;

import java.time.LocalDate;

public class PaymentTransaction {
    private final String applicantId, transactionId;
    private final String applicantName;
    private double amount;
    private LocalDate paymentDate;
    private String status;

    public PaymentTransaction(String applicantId, String applicantName, String transactionId, double amount, LocalDate paymentDate, String status) {
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "applicantId='" + applicantId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", status='" + status + '\'' +
                '}';
    }
}
