package esprit.tn.pidev.Repositories;

import esprit.tn.pidev.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
