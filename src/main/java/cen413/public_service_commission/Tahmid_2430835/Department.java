package cen413.public_service_commission.Tahmid_2430835;

import java.io.Serializable;

public class Department implements Serializable {
    final private String departmentName;
     private int totalCirculars;

    public Department(String departmentName, int totalCirculars) {
        this.departmentName = departmentName;
        this.totalCirculars = totalCirculars;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getTotalCirculars() {
        return totalCirculars;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", totalCirculars=" + totalCirculars +
                '}';
    }
}

