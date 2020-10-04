package fr.telecom_st_etienne.fx.series.business;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Serie serie;
	
	@ManyToOne
	private Utilisateur utilisateur;

	private Date dateAchat;
}
