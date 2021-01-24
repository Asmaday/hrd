package by.company.hrd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "family")
@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_child")
    private int idEducation;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @Column(name = "first_name_child")
    private String firstNameChild;
    @Column(name = "sur_name_child")
    private String surNameChild;
    @Column(name = "patronymic_child")
    private String patronymicChild;
    @Column(name = "date_birth_child")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateBirthChild;

    public int getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(int idEducation) {
        this.idEducation = idEducation;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
}
