package by.company.hrd.dao;

import by.company.hrd.domain.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {
}
