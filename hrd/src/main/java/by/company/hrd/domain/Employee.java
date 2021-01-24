package by.company.hrd.domain;

import by.company.hrd.domain.enumeration.Gender;
import by.company.hrd.domain.enumeration.MaritalStatus;
import by.company.hrd.domain.enumeration.StatusEmployee;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "employee")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer idEmployee;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_position")
    private Position position;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_department")
    private Department department;
    @Column(name = "person_number")
    private int personNumber;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "gender")
    @Enumerated
    private Gender gender;
    @Column(name = "date_birth")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateBirth;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "marital_status")
    @Enumerated
    private MaritalStatus maritalStatus;
    @Column(name = "address")
    private String address;
    @Column(name = "job_phone")
    private String jobPhone;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "home_phone")
    private String homePhone;
    @Column(name = "employment_date")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate employmentDate;
    @Column(name = "status_employee")
    @Enumerated
    private StatusEmployee statusEmployee;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private Education education;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private InstitutionEducation institutionEducation;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private Training training;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private Holiday holiday;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private Family family;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private ProtectionWork protectionWork;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private WorkerCategory workerCategory;
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "employee")
    private Passport passport;

    public InstitutionEducation getInstitutionEducation() {
        return institutionEducation;
    }

    public void setInstitutionEducation(InstitutionEducation institutionEducation) {
        this.institutionEducation = institutionEducation;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public StatusEmployee getStatusEmployee() {
        return statusEmployee;
    }

    public void setStatusEmployee(StatusEmployee statusEmployee) {
        this.statusEmployee = statusEmployee;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public ProtectionWork getProtectionWork() {
        return protectionWork;
    }

    public void setProtectionWork(ProtectionWork protectionWork) {
        this.protectionWork = protectionWork;
    }

    public WorkerCategory getWorkerCategory() {
        return workerCategory;
    }

    public void setWorkerCategory(WorkerCategory workerCategory) {
        this.workerCategory = workerCategory;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public Education getEducation() {
        return education;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }
}
