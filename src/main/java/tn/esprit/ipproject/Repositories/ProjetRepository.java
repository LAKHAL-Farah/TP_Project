package tn.esprit.ipproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ipproject.Entities.Project;
// it automatically considered it bean because we used the jpa
@Repository
public interface ProjetRepository extends JpaRepository<Project,Long> {

}
