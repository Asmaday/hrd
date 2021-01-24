package by.company.hrd.domain;



import by.company.hrd.domain.enumeration.Result;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "workerCategory")
@Entity
public class WorkerCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker_category")
    private int idWorkerCategory;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @Column(name = "worker_category_date")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate workerCategoryDate;
    @Column(name = "result")
    @Enumerated
    private Result resultWorkerrCategory;
    @Column(name = "reason")
    private String reasonWorkerCategory;

    public int getIdWorkerCategory() {
        return idWorkerCategory;
    }

    public void setIdWorkerCategory(int idWorkerCategory) {
        this.idWorkerCategory = idWorkerCategory;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getWorkerCategoryDate() {
        return workerCategoryDate;
    }

    public void setWorkerCategoryDate(LocalDate workerCategoryDate) {
        this.workerCategoryDate = workerCategoryDate;
    }

    public Result getResult() {
        return resultWorkerrCategory;
    }

    public void setResult(Result result) {
        this.resultWorkerrCategory = result;
    }

    public String getReason() {
        return reasonWorkerCategory;
    }

    public void setReason(String reason) {
        this.reasonWorkerCategory = reason;
    }
}
