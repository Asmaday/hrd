package by.company.hrd.domain;

import javax.persistence.*;

@Table(name = "institutionEducation")
@Entity
public class InstitutionEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_institution_education")
    private int idInstitutionEducation;
    @Column(name = "institution_education_name")
    private String institutionEducationName;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    public int getIdInstitutionEducation() {
        return idInstitutionEducation;
    }

    public void setIdInstitutionEducation(int idInstitutionEducation) {
        this.idInstitutionEducation = idInstitutionEducation;
    }

    public String getInstitutionEducationName() {
        return institutionEducationName;
    }

    public void setInstitutionEducationName(String institutionEducationName) {
        this.institutionEducationName = institutionEducationName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
