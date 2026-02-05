package com.example.employee_management.Service;

import com.example.employee_management.Model.Employee;
import com.example.employee_management.Repository.EmployeeRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeService {


    private final EmployeeRepo employeeRepo;
    private final Employee e;
    public EmployeService(EmployeeRepo employeeRepo, Employee e) {
        this.employeeRepo = employeeRepo;
        this.e = e;
    }


    public  List<Employee> getemployees() {
       return employeeRepo.findAll();
    }


    public Employee getemployeebyID(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public void addEmployee(Employee emp) {
        Integer id = emp.getEMP_ID();
        if(id!=null){
            emp.setEMP_ID(id);

        }
        employeeRepo.save(emp);
    }

    public void updateemployee(Employee emp) {
        employeeRepo.save(emp);
    }

    public void deleteemployee(Employee e) {
        employeeRepo.delete(e);
    }

    public void deleteALL() {
        employeeRepo.deleteAll();
    }
}
