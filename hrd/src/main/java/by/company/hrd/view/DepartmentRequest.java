package by.company.hrd.view;

public class DepartmentRequest {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentRequest{" +
                "departmentnName='" + departmentName + '\'' +
                '}';
    }
}
