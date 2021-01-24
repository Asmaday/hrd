package by.company.hrd.view;

import by.company.hrd.domain.InstitutionEducation;
import by.company.hrd.domain.enumeration.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class AddEmployeeFullRequest {
    // Employee
    private int personNumber;
    private String firstName;
    private String surName;
    private String patronymic;
    private int idDepartment;
    private int idPosition;
    private Gender gender;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateBirth;
    private String nationality;
    private MaritalStatus maritalStatus;
    private String address;
    private String jobPhone;
    private String mobilePhone;
    private String homePhone;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate employmentDate;
    private StatusEmployee statusEmployee;
    // Education
    private EducationType educationType;
    private EducationLevel educationLevel;
    // Family
    private String firstNameChild;
    private String surNameChild;
    private String patronymicChild;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateBirthChild;
    // Holiday
    private String holidayType;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateStart;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateEnd;
    private String reasonHoliday;
    // InstitutionEducation
    private String institutionEducationName;
    // Passport
    private String passportNumber;
    private String issueDepartment;
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate issueDate;
    // ProtectionWork
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate protectionWorkDate;
    private Result resultPrWork;
    private String reasonPrWork;
    // Training
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate trainingDate;
    private String trainingName;
    // WorkerCategory
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate workerCategoryDate;
    private Result resultWorkerrCategory;
    private String reasonWorkerCategory;

    public Result getResultPrWork() {
        return resultPrWork;
    }

    public void setResultPrWork(Result resultPrWork) {
        this.resultPrWork = resultPrWork;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobPhone() {
        return jobPhone;
    }

    public void setJobPhone(String jobPhone) {
        this.jobPhone = jobPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public StatusEmployee getStatusEmployee() {
        return statusEmployee;
    }

    public void setStatusEmployee(StatusEmployee statusEmployee) {
        this.statusEmployee = statusEmployee;
    }

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getFirstNameChild() {
        return firstNameChild;
    }

    public void setFirstNameChild(String firstNameChild) {
        this.firstNameChild = firstNameChild;
    }

    public String getSurNameChild() {
        return surNameChild;
    }

    public void setSurNameChild(String surNameChild) {
        this.surNameChild = surNameChild;
    }

    public String getPatronymicChild() {
        return patronymicChild;
    }

    public void setPatronymicChild(String patronymicChild) {
        this.patronymicChild = patronymicChild;
    }

    public LocalDate getDateBirthChild() {
        return dateBirthChild;
    }

    public void setDateBirthChild(LocalDate dateBirthChild) {
        this.dateBirthChild = dateBirthChild;
    }

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getReasonHoliday() {
        return reasonHoliday;
    }

    public void setReasonHoliday(String reasonHoliday) {
        this.reasonHoliday = reasonHoliday;
    }

    public String getInstitutionEducationName() {
        return institutionEducationName;
    }

    public void setInstitutionEducationName(String institutionEducationName) {
        this.institutionEducationName = institutionEducationName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getProtectionWorkDate() {
        return protectionWorkDate;
    }

    public void setProtectionWorkDate(LocalDate protectionWorkDate) {
        this.protectionWorkDate = protectionWorkDate;
    }

    public String getReasonPrWork() {
        return reasonPrWork;
    }

    public void setReasonPrWork(String reasonPrWork) {
        this.reasonPrWork = reasonPrWork;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public LocalDate getWorkerCategoryDate() {
        return workerCategoryDate;
    }

    public void setWorkerCategoryDate(LocalDate workerCategoryDate) {
        this.workerCategoryDate = workerCategoryDate;
    }

    public Result getResultWorkerrCategory() {
        return resultWorkerrCategory;
    }

    public void setResultWorkerrCategory(Result resultWorkerrCategory) {
        this.resultWorkerrCategory = resultWorkerrCategory;
    }

    public String getReasonWorkerCategory() {
        return reasonWorkerCategory;
    }

    public void setReasonWorkerCategory(String reasonWorkerCategory) {
        this.reasonWorkerCategory = reasonWorkerCategory;
    }
}
