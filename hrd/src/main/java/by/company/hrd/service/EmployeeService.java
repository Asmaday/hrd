package by.company.hrd.service;

import by.company.hrd.dao.*;
import by.company.hrd.domain.*;
import by.company.hrd.domain.enumeration.Gender;
import by.company.hrd.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EducationRepository educationRepository;
    @Autowired
    private FamilyRepository familyRepository;
    @Autowired
    private HolidayRepository holidayRepository;
    @Autowired
    private InstitutionEducationRepository institutionEducationRepository;
    @Autowired
    private PassportRepository passportRepository;
    @Autowired
    private ProtectionWorkRepository protectionWorkRepository;
    @Autowired
    private TraningRepository traningRepository;
    @Autowired
    private WorkerCategoryRepository workerCategoryRepository;

    public List<EmployeeResponse> getEmployeeInfo(EmployeeRequest request) {
        List<Employee> employee = employeeRepository.findEmployee(request.getPersonNumber(),
                request.getFirstName(),
                request.getSurName(),
                request.getPatronymic(),
                request.getIdPosition(),
                request.getIdDepartment());
        if (employee.isEmpty()) {
            return Collections.emptyList();
        }
        return employee.stream().map(e -> getResponse(e)).collect(Collectors.toList());
    }

    private EmployeeResponse getResponse(Employee employee) {
        EmployeeResponse wr = new EmployeeResponse();
        Education education = new Education();
        // employee
        wr.setPersonNumber(employee.getPersonNumber());
        wr.setFirstName(employee.getFirstName());
        wr.setSurName(employee.getSurName());
        wr.setPatronymic(employee.getPatronymic());
        wr.setDepartmentName(employee.getDepartment().getDepartmentName());
        wr.setPositionName(employee.getPosition().getPositionName());
        wr.setGender(employee.getGender());
        wr.setDateBirth(employee.getDateBirth());
        wr.setNationality(employee.getNationality());
        wr.setMaritalStatus(employee.getMaritalStatus());
        wr.setAddress(employee.getAddress());
        wr.setJobPhone(employee.getJobPhone());
        wr.setMobilePhone(employee.getMobilePhone());
        wr.setHomePhone(employee.getHomePhone());
        wr.setEmploymentDate(employee.getEmploymentDate());
        wr.setStatusEmployee(employee.getStatusEmployee());
        // Education
        wr.setEducationType(education.getEducationType());
        return wr;
    }

    public void addEmployee(AddEmployeeFullRequest request) {
        Employee employee = new Employee();
        Education education = new Education();
        Family family = new Family();
        Holiday holiday = new Holiday();
        Passport passport = new Passport();
        ProtectionWork protectionWork = new ProtectionWork();
        Training training = new Training();
        WorkerCategory workerCategory = new WorkerCategory();
        InstitutionEducation institutionEducation = new InstitutionEducation();
        // add Employee
        employee.setPersonNumber(request.getPersonNumber());
        employee.setFirstName(request.getFirstName());
        employee.setSurName(request.getSurName());
        employee.setPatronymic(request.getPatronymic());
        Position position = positionRepository.getOne(request.getIdPosition());
        employee.setPosition(position);
        Department department = departmentRepository.getOne(request.getIdDepartment());
        employee.setDepartment(department);
        employee.setGender(request.getGender());
        employee.setDateBirth(request.getDateBirth());
        employee.setNationality(request.getNationality());
        employee.setMaritalStatus(request.getMaritalStatus());
        employee.setAddress(request.getAddress());
        employee.setJobPhone(request.getJobPhone());
        employee.setMobilePhone(request.getMobilePhone());
        employee.setHomePhone(request.getHomePhone());
        employee.setEmploymentDate(request.getEmploymentDate());
        employee.setStatusEmployee(request.getStatusEmployee());
        // add Education
        education.setEducationLevel(request.getEducationLevel());
        education.setEducationType(request.getEducationType());
        employee.setEducation(education);
        // add Family
        family.setFirstNameChild(request.getFirstNameChild());
        family.setSurNameChild(request.getSurNameChild());
        family.setPatronymicChild(request.getPatronymicChild());
        family.setDateBirthChild(request.getDateBirthChild());
        employee.setFamily(family);
        // add Holiday
        holiday.setHolidayType(request.getHolidayType());
        holiday.setDateStart(request.getDateStart());
        holiday.setDateEnd(request.getDateEnd());
        holiday.setReasonHoliday(request.getReasonHoliday());
        employee.setHoliday(holiday);
        // add InstitutionEducation
        institutionEducation.setInstitutionEducationName(request.getInstitutionEducationName());
        employee.setInstitutionEducation(institutionEducation);
        // add Passport
        passport.setPassportNumber(request.getPassportNumber());
        passport.setIssueDepartment(request.getIssueDepartment());
        passport.setIssueDate(request.getIssueDate());
        employee.setPassport(passport);
        // add ProtectionWork
        protectionWork.setProtectionWorkDate(request.getProtectionWorkDate());
        protectionWork.setResult(request.getResultPrWork());
        protectionWork.setReason(request.getReasonPrWork());
        employee.setProtectionWork(protectionWork);
        // Training
        training.setTrainingDate(request.getTrainingDate());
        training.setTrainingName(request.getTrainingName());
        employee.setTraining(training);
        // WorkerCategory
        workerCategory.setWorkerCategoryDate(request.getWorkerCategoryDate());
        workerCategory.setResult(request.getResultWorkerrCategory());
        workerCategory.setReason(request.getReasonWorkerCategory());
        employee.setWorkerCategory(workerCategory);
        employeeRepository.save(employee);
        educationRepository.save(education);
        familyRepository.save(family);
        holidayRepository.save(holiday);
        institutionEducationRepository.save(institutionEducation);
        passportRepository.save(passport);
        protectionWorkRepository.save(protectionWork);
        traningRepository.save(training);
        workerCategoryRepository.save(workerCategory);
    }

    public List<EducationResponse> getEducationInfo(EducationRequest request) {
        List<Employee> employees = employeeRepository.findEducation(
                request.getEducationLevel());
        if (employees.isEmpty()) {
            return Collections.emptyList();
        }
        return employees.stream().map(e -> mapEmployeeToEducationResponse(e)).collect(Collectors.toList());
    }

    private EducationResponse mapEmployeeToEducationResponse(Employee employee) {
        EducationResponse wr = new EducationResponse();
        wr.setPersonNumber(employee.getPersonNumber());
        wr.setFirstName(employee.getFirstName());
        wr.setSurName(employee.getSurName());
        wr.setPatronymic(employee.getPatronymic());
        wr.setEducationLevel(employee.getEducation().getEducationLevel());
        return wr;
    }

    public List<TraningResponse> getTraningInfo(TraningRequest request) {
        List<Employee> employees = employeeRepository.findTraning(
                request.getPersonNumber(),
                request.getIdDepartment());
        if(employees.isEmpty()) {
            return Collections.emptyList();
        }
        return employees.stream().map(e -> mapEmployeeToTraningResponse(e)).collect(Collectors.toList());
    }

    private TraningResponse mapEmployeeToTraningResponse(Employee employee) {
        TraningResponse tr = new TraningResponse();
        tr.setPersonNumber(employee.getPersonNumber());
        tr.setFirstName(employee.getFirstName());
        tr.setSurName(employee.getSurName());
        tr.setPatronymic(employee.getPatronymic());
        tr.setPositionName(employee.getPosition().getPositionName());
        tr.setDepartmentName(employee.getDepartment().getDepartmentName());
        tr.setTrainingName(employee.getTraining().getTrainingName());
        return tr;
    }

    public List<HolidayResponse> getHolidayInfo(HolidayRequest request) {
        List<Employee> employees = employeeRepository.findHoliday(request.getPersonNumber(),request.getIdDepartment());
        if(employees.isEmpty()) {
            return Collections.emptyList();
        }
        return employees.stream().map(e -> mapEmployeeToHolidayResponse(e)).collect(Collectors.toList());
    }

    private HolidayResponse mapEmployeeToHolidayResponse(Employee employee) {
        HolidayResponse hr = new HolidayResponse();
        hr.setPersonNumber(employee.getPersonNumber());
        hr.setFirstName(employee.getFirstName());
        hr.setSurName(employee.getSurName());
        hr.setPatronymic(employee.getPatronymic());
        hr.setPositionName(employee.getPosition().getPositionName());
        hr.setDepartmentName(employee.getDepartment().getDepartmentName());
        hr.setHolidayType(employee.getHoliday().getHolidayType());
        return hr;
    }


//    public void updateEmployee(AddEmployeeFullRequest request) {
//        Employee employee = employeeRepository.findEmployee(request.getPersonNumber());
//        employee.setFirstName(request.getFirstName());
//        employee.setSurName(request.getSurName());
//        employee.setPatronymic(request.getPatronymic());
//        Positions position = positionRepository.getOne(2);
//        employee.setPositions(position);
//        employeeRepository.save(employee);
//    }
}
