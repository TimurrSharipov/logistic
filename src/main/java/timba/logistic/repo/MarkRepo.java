package timba.logistic.repo;

import timba.logistic.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
