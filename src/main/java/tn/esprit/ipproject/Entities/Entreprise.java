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
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEntreprise;

    @NonNull
    String nom;

    @NonNull
    String adresse;

    @OneToMany
    Set<Equipe> equipes;
}
