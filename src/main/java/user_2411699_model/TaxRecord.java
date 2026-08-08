package user_2411699_model;

import java.time.LocalDate;

public class TaxRecord {
    private final String transactionId, description, supplierName;
    private final double taxableAmount;
    private final LocalDate transactionDate;
    private double vatAmount, taxAmount;
    private String paymentStatus, filingReference;

    public TaxRecord(String transactionId, String description, String supplierName, double taxableAmount, LocalDate transactionDate, double vatAmount, double taxAmount, String paymentStatus) {
        this.transactionId = transactionId;
        this.description = description;
        this.supplierName = supplierName;
        this.taxableAmount = taxableAmount;
        this.transactionDate = transactionDate;
        this.vatAmount = vatAmount;
        this.taxAmount = taxAmount;
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDescription() {
        return description;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public double getTaxableAmount() {
        return taxableAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getTotalPayable() {
        return vatAmount + taxAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getFilingReference() {
        return filingReference;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setFilingReference(String filingReference) {
        this.filingReference = filingReference;
    }

    @Override
    public String toString() {
        return "TaxRecord{" +
                "transactionId='" + transactionId + '\'' +
                ", taxableAmount=" + taxableAmount +
                ", vatAmount=" + vatAmount +
                ", taxAmount=" + taxAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
