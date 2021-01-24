package by.company.hrd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "holiday")
@Entity
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_holiday")
    private int idHoliday;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @Column(name = "holiday_type")
    private String holidayType;
    @Column(name = "date_start")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateStart;
    @Column(name = "date_end")
    @JsonFormat(pattern="dd.MM.yyyy")
    private LocalDate dateEnd;
    @Column(name = "reason")
    private String reasonHoliday;

    public int getIdHoliday() {
        return idHoliday;
    }

    public void setIdHoliday(int idHoliday) {
        this.idHoliday = idHoliday;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
}
