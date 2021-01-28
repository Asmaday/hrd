package by.company.hrd.dao;

import by.company.hrd.domain.Employee;

import by.company.hrd.domain.enumeration.EducationLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    @Query("SELECT er FROM Employee er JOIN FETCH er.position p JOIN FETCH er.department d" +
            " JOIN FETCH er.education ed WHERE er.personNumber = :personNumber OR " +
            "er.firstName = :firstName OR er.surName = :surName OR er.patronymic = :patronymic " +
            "OR p.idPosition = :idPosition OR d.idDepartment = :idDepartment")
    List<Employee> findEmployee(@Param("personNumber")int personNumber,
                                @Param("firstName")String firstName,
                                @Param("surName")String surName,
                                @Param("patronymic")String patronymic,
                                @Param("idPosition")Integer idPosition,
                                @Param("idDepartment")Integer idDepartment);



    // вытягивание сотрудников по фильтру: образование EducationLevel enum класс.
//    @Query("SELECT e FROM Employee e JOIN FETCH e.education ed " +
//            "JOIN FETCH ed.institutionEducation ie WHERE ed.educationLevel = :educationLevel")
    @Query("SELECT e FROM Employee e JOIN FETCH e.education ed " +
            " WHERE ed.educationLevel = :educationLevel")
    List<Employee> findEducation(@Param("educationLevel") EducationLevel educationLevel);
    // сотрудники прошедшие какаие-нибудь курсы
    @Query("SELECT er FROM Employee er JOIN FETCH er.training tr JOIN FETCH er.position p JOIN FETCH er.department d " +
            "WHERE er.personNumber = :personNumber OR d.idDepartment = :idDepartment")
    List<Employee> findTraning(@Param("personNumber") int personNumber, @Param("idDepartment")Integer idDepartment);

    //отпуска сотрудников
    @Query("SELECT er FROM Employee er JOIN FETCH er.holiday h JOIN FETCH er.position p JOIN FETCH er.department d " +
            "WHERE er.personNumber = :personNumber OR d.idDepartment=:idDepartment")
    List<Employee> findHoliday(@Param("personNumber") int personNumber, @Param("idDepartment") Integer idDepartment);


}