package com.company;

import java.util.Arrays;

/**
 * 部门类
 * @author sanye
 * @version 1.0
 * @date 2020/9/4 3:47 下午
 */
public class Department {

    private  String  deptId;
    private  String  deptName;
    private  Employee[] employees = new Employee[100];
    public int EmployeeNum = 0;

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    //发薪水
    public void Payoff(Employee[] employees){
        for(int i = 0; i<employees.length; i++){
            employees[i].balance += employees[i].salary;
            System.out.println(employees[i].getEmpId()+"员工发了薪水"+employees[i].salary);
        }
    }

    //涨工资
    public void IncreaseSalary(Employee employee,int addnum){
        employee.salary += addnum;
        System.out.println("新工资为"+employee.salary);
    }

    //新增员工
    public void AddEmployee(Employee NewOne,Department department){
        if(department.EmployeeNum >= 100)
            System.out.println("员工人数已满");
        department.employees[department.EmployeeNum] = NewOne;
        System.out.println(NewOne.getEmpName()+"员工新增成功");
        department.EmployeeNum++;

    }
}