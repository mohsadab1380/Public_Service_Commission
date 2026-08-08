package user_2411699_model;

import java.io.Serializable;

public class ExamPaymentRequest implements Serializable {
    private final String requestId, examName;
    private final double amount;
    private String  paymentStatus;

    public ExamPaymentRequest(String requestId, String examName, double amount, String paymentStatus) {
        this.requestId = requestId;
        this.examName = examName;
        this.amount = amount;
    }


    public String getRequestId() {
        return requestId;
    }

    public String getExamName() {
        return examName;
    }

    public double getAmount() {
        return amount;
    }


    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "ExamPaymentRequest{" +
                "requestId='" + requestId + '\'' +
                ", amount=" + amount +'\''+
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
