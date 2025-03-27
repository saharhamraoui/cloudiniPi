package esprit.tn.pidev.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur extends User{

    private String contact;
    @OneToMany(mappedBy = "fournisseur")
    private List<Medicament> medicaments= new ArrayList<>();

}