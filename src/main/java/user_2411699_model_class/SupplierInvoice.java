package user_2411699_model_class;

import java.time.LocalDate;

public class SupplierInvoice {
    private final String invoiceId, supplierName, procurementReference;
    private final double amount;
    private final LocalDate invoiceDate, dueDate;
    private boolean procurementApproved, deliveryConfirmed;
    private String paymentStatus;

    public SupplierInvoice(String invoiceId, String supplierName, String procurementReference, double amount, LocalDate invoiceDate, LocalDate dueDate, boolean procurementApproved, boolean deliveryConfirmed, String paymentStatus) {
        this.invoiceId = invoiceId;
        this.supplierName = supplierName;
        this.procurementReference = procurementReference;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.procurementApproved = procurementApproved;
        this.deliveryConfirmed = deliveryConfirmed;
        this.paymentStatus = paymentStatus;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProcurementReference() {
        return procurementReference;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isProcurementApproved() {
        return procurementApproved;
    }

    public boolean isDeliveryConfirmed() {
        return deliveryConfirmed;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setProcurementApproved(boolean procurementApproved) {
        this.procurementApproved = procurementApproved;
    }

    public void setDeliveryConfirmed(boolean deliveryConfirmed) {
        this.deliveryConfirmed = deliveryConfirmed;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "SupplierInvoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}

