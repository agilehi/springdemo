package com.suftz.bean;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 11:53
 */
public class Employee {
    private String empName;
    private Department dept;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Employee() {
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public Employee(String empName, Department dept) {
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", dept=" + dept +
                '}';
    }
}
