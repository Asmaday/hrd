package by.company.hrd.domain;

import by.company.hrd.domain.enumeration.EducationLevel;
import by.company.hrd.domain.enumeration.EducationType;

import javax.persistence.*;

@Table(name = "education")
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_education")
    private int idEducation;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;
//    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_institution_education")
//    private InstitutionEducation institutionEducation;
    @Column(name = "education_type")
    @Enumerated
    private EducationType educationType;
    @Column(name = "education_level")
    @Enumerated
    private EducationLevel educationLevel;

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

//    public InstitutionEducation getInstitutionEducation() {
//        return institutionEducation;
//    }
//
//    public void setInstitutionEducation(InstitutionEducation institutionEducation) {
//        this.institutionEducation = institutionEducation;
//    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }
}
