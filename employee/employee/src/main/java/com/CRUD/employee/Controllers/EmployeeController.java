package com.CRUD.employee.Controllers;

                import com.CRUD.employee.Entity.Employee;
                import com.CRUD.employee.Services.EmployeeService;
                import org.springframework.beans.factory.annotation.Autowired;
                import org.springframework.http.ResponseEntity;
                import org.springframework.web.bind.annotation.*;

                import java.util.List;

                @RestController
                @RequestMapping("/api/employee")
                public class EmployeeController {

                    private final EmployeeService employeeService;

                    @Autowired
                    public EmployeeController(EmployeeService employeeService) {
                        this.employeeService = employeeService;
                    }

                    @GetMapping
                    public List<Employee> getAllEmployees() {
                        return employeeService.getAllEmployees();
                    }

                    @GetMapping("/{id}")
                    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
                        return employeeService.getEmployeeById(id)
                                .map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build());
                    }

                    @PostMapping
                    public Employee createEmployee(@RequestBody Employee employee) {
                        return employeeService.createEmployee(employee);
                    }

                    @PutMapping("/{id}")
                    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
                        try {
                            Employee updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
                            return ResponseEntity.ok(updatedEmployee);
                        } catch (RuntimeException e) {
                            return ResponseEntity.notFound().build();
                        }
                    }

                    @DeleteMapping("/{id}")
                    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
                        employeeService.deleteEmployee(id);
                        return ResponseEntity.noContent().build();
                    }
                }