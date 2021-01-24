package by.company.hrd.domain;

import javax.persistence.*;

@Table(name = "position")
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_position")
    private int idPosition;
    @Column(name = "position_name")
    private String positionName;
    @OneToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "position")
    private Employee employee;

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String  getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
