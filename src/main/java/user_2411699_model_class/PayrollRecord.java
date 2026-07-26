package user_2411699_model_class;

public class PayrollRecord {
    private final int employeeId;
    private final String employeeName, designation, department, payrollPeriod;
    private double basicSalary, allowances, deductions;
    private int attendanceDays, workingDays, leaveDays, overtimeHours;
    private String approvalStatus, processingStatus;

    public PayrollRecord(int employeeId, String employeeName, String designation, String department, String payrollPeriod, double basicSalary, double allowances, double deductions, int attendanceDays, int workingDays, int leaveDays, int overtimeHours, String approvalStatus, String processingStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.department = department;
        this.payrollPeriod = payrollPeriod;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.attendanceDays = attendanceDays;
        this.workingDays = workingDays;
        this.leaveDays = leaveDays;
        this.overtimeHours = overtimeHours;
        this.approvalStatus = approvalStatus;
        this.processingStatus = processingStatus;
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

    public String getDepartment() {
        return department;
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

    public int getAttendanceDays() {
        return attendanceDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public double getNetSalary() {
        return basicSalary + allowances + (overtimeHours * 250.0) - deductions;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public void setAttendanceDays(int attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    @Override
    public String toString() {
        return "PayrollRecord{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", designation='" + designation + '\'' +
                ", payrollPeriod='" + payrollPeriod + '\'' +
                ", netSalary=" + getNetSalary() +
                ", processingStatus='" + processingStatus + '\'' +
                '}';
    }
}
