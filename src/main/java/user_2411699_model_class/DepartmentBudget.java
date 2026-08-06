package user_2411699_model_class;

public class DepartmentBudget {
    private final String department, financialPeriod;
    private final double allocatedBudget;
    private double usedBudget;

    public DepartmentBudget(String department, String financialPeriod, double allocatedBudget, double usedBudget) {
        this.department = department;
        this.financialPeriod = financialPeriod;
        this.allocatedBudget = allocatedBudget;
        this.usedBudget = usedBudget;
    }

    public String getDepartment() {
        return department;
    }

    public String getFinancialPeriod() {
        return financialPeriod;
    }

    public double getAllocatedBudget() {
        return allocatedBudget;
    }

    public double getUsedBudget() {
        return usedBudget;
    }

    public double getRemainingBudget() {
        return allocatedBudget - usedBudget;
    }

    public void setUsedBudget(double usedBudget) {
        this.usedBudget = usedBudget;
    }

    @Override
    public String toString() {
        return "DepartmentBudget{" +
                "department='" + department + '\'' +
                ", financialPeriod='" + financialPeriod + '\'' +
                ", allocatedBudget=" + allocatedBudget +
                ", usedBudget=" + usedBudget +
                ", remainingBudget=" + getRemainingBudget() +
                '}';
    }
}
