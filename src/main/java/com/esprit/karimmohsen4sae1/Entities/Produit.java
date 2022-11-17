package com.esprit.karimmohsen4sae1.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToOne
    private Stock stock;

    @OneToOne
    private DetailFacture detailFacture;

    @OneToMany(mappedBy = "produitFacture")
    private List<DetailFacture> detailFacturesList;

    @ManyToOne
    private Rayon rayon;

    @ManyToMany
    private List<Fournisseur> fournisseursList;
}
