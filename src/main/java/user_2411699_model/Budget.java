package user_2411699_model;

import java.io.Serializable;

public class Budget implements Serializable {
    private final String department;
    private final double allocatedBudget;
    private double usedBudget;

    public Budget(String department, double allocatedBudget, double usedBudget) {
        this.department = department;
        this.allocatedBudget = allocatedBudget;
        this.usedBudget = usedBudget;
    }

    public String getDepartment() {
        return department;
    }

    public double getAllocatedBudget() {
        return allocatedBudget;
    }

    public double getUsedBudget() {
        return usedBudget;
    }

    public void setUsedBudget(double usedBudget) {
        this.usedBudget = usedBudget;
    }

    @Override
    public String toString() {
        return "DepartmentBudget{" +
                "department='" + department + '\'' +
                ", allocatedBudget=" + allocatedBudget +
                ", usedBudget=" + usedBudget +
                '}';
    }
}
