package by.company.hrd.domain;


import by.company.hrd.domain.enumeration.Result;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "protectionWork")
@Entity
public class ProtectionWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_protection_work")
    private int idProtectionWork;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @Column(name = "protection_work_date")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate protectionWorkDate;
    @Column(name = "result")
    @Enumerated
    private Result resultPrWork;
    @Column(name = "reason")
    private String reasonPrWork;

    public int getIdProtectionWork() {
        return idProtectionWork;
    }

    public void setIdProtectionWork(int idProtectionWork) {
        this.idProtectionWork = idProtectionWork;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getProtectionWorkDate() {
        return protectionWorkDate;
    }

    public void setProtectionWorkDate(LocalDate protectionWorkDate) {
        this.protectionWorkDate = protectionWorkDate;
    }

    public Result getResult() {
        return resultPrWork;
    }

    public void setResult(Result result) {
        this.resultPrWork = result;
    }

    public String getReason() {
        return reasonPrWork;
    }

    public void setReason(String reason) {
        this.reasonPrWork = reason;
    }
}
