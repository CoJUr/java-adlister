package models;

import java.io.Serializable;
import java.util.Date;

public class Salaries implements Serializable {

    private long empNo;
    private Date fromDate;
    private Date toDate;
    private double salary;

    public Salaries() {
    }

    public Salaries(long empNo, Date fromDate, Date toDate, double salary) {
        this.empNo = empNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.salary = salary;
    }

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
