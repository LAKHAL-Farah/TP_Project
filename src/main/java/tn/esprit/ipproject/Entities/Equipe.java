package tn.esprit.ipproject.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NonNull
    String nom;
    @Enumerated(EnumType.STRING)
    Domaine domaine;

    @ManyToOne(cascade = CascadeType.ALL)
    Entreprise entreprise;


    @ManyToMany(cascade = CascadeType.ALL)
    Set<Project> projets;


}
