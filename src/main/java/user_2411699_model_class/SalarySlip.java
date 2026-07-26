package user_2411699_model_class;

import java.time.LocalDateTime;

public class SalarySlip {
    private final String slipId;
    private final int employeeId;
    private final String employeeName, designation, payrollPeriod;
    private final double basicSalary, allowances, deductions, netSalary;
    private final String bankTransferStatus;
    private final LocalDateTime generatedAt;

    public SalarySlip(String slipId, int employeeId, String employeeName, String designation, String payrollPeriod, double basicSalary, double allowances, double deductions, double netSalary, String bankTransferStatus, LocalDateTime generatedAt) {
        this.slipId = slipId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.payrollPeriod = payrollPeriod;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.netSalary = netSalary;
        this.bankTransferStatus = bankTransferStatus;
        this.generatedAt = generatedAt;
    }

    public String getSlipId() {
        return slipId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPayrollPeriod() {
        return payrollPeriod;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public String getBankTransferStatus() {
        return bankTransferStatus;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    @Override
    public String toString() {
        return "Salary Slip\n" +
                "Slip ID: " + slipId + "\n" +
                "Employee: " + employeeName + " (ID " + employeeId + ")\n" +
                "Designation: " + designation + "\n" +
                "Payroll Period: " + payrollPeriod + "\n" +
                "Basic Salary: " + basicSalary + " BDT\n" +
                "Allowances: " + allowances + " BDT\n" +
                "Deductions: " + deductions + " BDT\n" +
                "Net Salary: " + netSalary + " BDT\n" +
                "Bank Transfer Status: " + bankTransferStatus + "\n" +
                "Generated At: " + generatedAt;
    }
}
