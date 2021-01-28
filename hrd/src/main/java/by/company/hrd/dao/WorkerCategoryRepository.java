package by.company.hrd.dao;

import by.company.hrd.domain.WorkerCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerCategoryRepository extends JpaRepository<WorkerCategory, Integer> {
}
