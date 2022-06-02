package com.example.spring_boot_student.Controller;

import com.example.spring_boot_student.service.EmployeeService;
import com.example.spring_boot_student.welcom.Message;
import com.example.spring_boot_student.exception.ResourseNotFoundException;
import com.example.spring_boot_student.modul.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    @Qualifier("Upusercase")
    private Message upsercase;
    @Autowired
    @Qualifier("MessageWelcom")
    private Message message1;




    @GetMapping("/")
    public String index()
    {
        return upsercase.text("meran ") +message1.text();
    }
    @GetMapping("employees")
    public List <Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) throws ResourseNotFoundException {
        Employee theEployee = employeeService.findById(employeeId);
        if (theEployee==null){
            throw new ResourseNotFoundException("employee id not found "+employeeId);
        }
        return theEployee;
    }
    @PostMapping("/employees")
    public Employee add(@RequestBody Employee theEmployee){
        theEmployee.setEmployeeId(0);
        employeeService.save(theEmployee);
        return theEmployee;
    }

    @PutMapping("/employees")
    public Employee save(@RequestBody Employee theEmployee ) {
        employeeService.save(theEmployee);
        return theEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String delete(@PathVariable int employeeId)
            throws ResourseNotFoundException
    {
        Employee tempEmployee = employeeService.findById(employeeId);
        if (tempEmployee==null){
            throw new ResourseNotFoundException("student is not found"+employeeId);

        }
        employeeService.deleted(employeeId);
        return "Delete Student id "+employeeId;}




}









