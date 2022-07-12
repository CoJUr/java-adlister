package models;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

    private long empNo;
    private String firstName;
    private String lastname;
    private char gender;
    private Date birthDate;
    private Date hireDate;

    public Employee() {}

    public long getEmpNo() {
        return empNo;
    }

    public Employee(long empNo, String firstName, String lastname, char gender, Date birthDate, Date hireDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}


