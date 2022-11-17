package com.esprit.karimmohsen4sae1.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int percentageRemise;
    private int montantRemise;

    @ManyToOne
    private Produit produitFacture;

    @ManyToOne
    private Facture factureDetail;
}
