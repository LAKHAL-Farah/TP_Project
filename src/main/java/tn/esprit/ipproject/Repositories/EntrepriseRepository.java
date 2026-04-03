package tn.esprit.ipproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ipproject.Entities.Entreprise;
import tn.esprit.ipproject.Entities.Project;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
