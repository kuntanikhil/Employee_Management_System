package com.example.employee_management.Controller;

import com.example.employee_management.Model.Employee;
import com.example.employee_management.Service.EmployeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final  EmployeService empservice;
    private final Employee e;
    public EmployeeController(EmployeService empservice, Employee e){
        this.empservice=empservice;
        this.e = e;
    }



    @GetMapping
    public ResponseEntity<List<Employee>> GetEmployees(){
        List<Employee> employees = empservice.getemployees();

        if (employees.isEmpty()) {
            return  ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getemployeebyID(@PathVariable Integer id){
        Employee emp = empservice.getemployeebyID(id);
        if(emp==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(emp);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
        if (e != null) {
            empservice.addEmployee(e);
            return ResponseEntity.ok(e);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployeebyID(@RequestBody Employee emp){
        Employee e = empservice.getemployeebyID(emp.getEMP_ID());
        if(e!=null){
            empservice.updateemployee(emp);
            return ResponseEntity.ok(emp);
        }
        else{
           return  ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteempbyID(@PathVariable Integer id){
        Employee e = empservice.getemployeebyID(id);
        if(e!=null){
            empservice.deleteemployee(e);
            return ResponseEntity.ok("Removed");
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deleteALL(){
        empservice.deleteALL();
        return ResponseEntity.ok("CLEANED");
    }
}
