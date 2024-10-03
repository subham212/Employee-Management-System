package com.salary;

public class AddSalary {
	private String employeeName;
    private String employeeId;
    private double hra;         // House Rent Allowance
    private double da;          // Dearness Allowance
    private double wd;          // Working Days
    private double ma;          // Medical Allowance
    private double bonus;
    private double pf;          // Provident Fund
    private double basicSalary;

  
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getWd() {
        return wd;
    }

    public void setWd(double wd) {
        this.wd = wd;
    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "AddSalary [employeeName=" + employeeName + ", employeeId=" + employeeId + ", hra=" + hra + ", da=" + da
                + ", wd=" + wd + ", ma=" + ma + ", bonus=" + bonus + ", pf=" + pf + ", basicSalary=" + basicSalary
                + "]";
    }
}
