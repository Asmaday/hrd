package by.company.hrd.dao;

import by.company.hrd.domain.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//Запрос на отображение детей сотрудника
public interface FamilyRepository extends JpaRepository<Family, Integer> {
    @Query("SELECT f FROM Family f JOIN FETCH f.employee e " +
            " WHERE e.personNumber = :personNumber OR " +
            "e.firstName = :firstName OR e.surName = :surName OR e.patronymic = :patronymic")
    List<Family> findFamily(@Param("personNumber")int personNumber,
                            @Param("firstName")String firstName,
                            @Param("surName")String surName,
                            @Param("patronymic")String patronymic);
}