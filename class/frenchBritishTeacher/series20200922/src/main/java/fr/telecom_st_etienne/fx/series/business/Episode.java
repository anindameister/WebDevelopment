package fr.telecom_st_etienne.fx.series.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Episode {

	@Id // indique la clé primaire de la table correspondante
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	@ManyToOne
	@NotNull(message="The episode must be linked to a season")
	private Saison saison;

	private int dureeEnMinutes;
}
