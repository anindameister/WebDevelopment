package fr.telecom_st_etienne.fx.series.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Interet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	@ManyToMany(mappedBy="interets")
	private List<Utilisateur> utilisateurs;
}
