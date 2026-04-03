package tn.esprit.ipproject.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

// the import form jpa
// needs to be annotated
@Entity
@Table(name ="projet")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idProject;
    @NonNull
     String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes;

}
