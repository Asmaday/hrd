package by.company.hrd.dao;

import by.company.hrd.domain.ProtectionWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProtectionWorkRepository extends JpaRepository<ProtectionWork, Integer> {
    //Запрос на отображение прохождения охраны труда
    @Query("SELECT pr FROM ProtectionWork pr JOIN FETCH pr.employee e JOIN FETCH e.position p JOIN FETCH e.department d" +
            " WHERE e.personNumber = :personNumber OR " +
            "e.firstName = :firstName OR e.surName = :surName OR e.patronymic = :patronymic" +
            " OR p.idPosition = :idPosition OR d.idDepartment = :idDepartment")
    List<ProtectionWork> findProtectionWork(@Param("personNumber")int personNumber,
                                @Param("firstName")String firstName,
                                @Param("surName")String surName,
                                @Param("patronymic")String patronymic,
                                @Param("idPosition")Integer idPosition,
                                @Param("idDepartment")Integer idDepartment);
}
