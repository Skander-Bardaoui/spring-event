package tn.esprit.spring.crud_event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.crud_event.model.Feedback;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByIdEvent(Long idEvent);
}
