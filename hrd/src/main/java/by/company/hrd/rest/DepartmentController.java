package by.company.hrd.rest;

import by.company.hrd.service.DepartmentService;
import by.company.hrd.view.DepartmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping(value = "/department")
    public void insertDepartment(@RequestBody DepartmentRequest request) {
        departmentService.addDepartment(request);
    }

}
