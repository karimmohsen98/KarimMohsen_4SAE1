package com.esprit.karimmohsen4sae1.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient ;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dataNaissaince;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;
    @Enumerated(EnumType.STRING)
    private Profession profession;

    @JsonIgnore
    @OneToMany(mappedBy = "clientFacture")
    private List<Facture> factureListClient;
}
