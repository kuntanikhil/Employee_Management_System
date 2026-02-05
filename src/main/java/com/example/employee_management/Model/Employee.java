package com.example.employee_management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EMP_ID;
    private String EMP_NAME;
    private String EMAIL;
    private String DEPT;
    private Double SALARY;

    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getDEPT() {
        return DEPT;
    }

    public void setDEPT(String DEPT) {
        this.DEPT = DEPT;
    }

    public Double getSALARY() {
        return SALARY;
    }

    public void setSALARY(Double SALARY) {
        this.SALARY = SALARY;
    }
}
