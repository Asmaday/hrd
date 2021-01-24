package by.company.hrd.rest;

import by.company.hrd.service.EmployeeService;
import by.company.hrd.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(value = "/employee/filter")
    public List<EmployeeResponse> getEmployeeInfo(@RequestBody EmployeeRequest request) {
        return employeeService.getEmployeeInfo(request);
    }
    @PostMapping(value = "/employee")
    public void insertEmployee(@RequestBody AddEmployeeFullRequest request) {
        employeeService.addEmployee(request);
    }

    @PostMapping(value = "/education")
    public List<EducationResponse> getEducationInfo(@RequestBody EducationRequest request) {
        return employeeService.getEducationInfo(request);
    }
    @PostMapping(value = "/traning")
    public List<TraningResponse> getTraningInfo(@RequestBody TraningRequest request) {
        return employeeService.getTraningInfo(request);
    }
    @PostMapping(value = "/holiday")
    public List<HolidayResponse> getHolidayInfo(@RequestBody HolidayRequest request) {
        return employeeService.getHolidayInfo(request);
    }
//    @PostMapping(value = "/employee/update")
//    public void updateEmployee(@RequestBody EmployeeRequest request) {
//        employeeService.updateEmployee(request);
//    }


}
