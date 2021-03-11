package by.company.hrd.service;

import by.company.hrd.dao.DepartmentRepository;
import by.company.hrd.domain.Department;
import by.company.hrd.view.DepartmentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public void addDepartment(DepartmentRequest request){
        Department department = new Department();
        department.setDepartmentName(request.getDepartmentName());
        departmentRepository.save(department);
    }
}
