package fr.telecom_st_etienne.fx.series.business;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Please enter your email address")
	@Column(unique=true)
	@Email(message="Please enter an email address in the right format")
	private String email;
	
	@Size(min=5, message="Your password must contain at least 5 characters")
	private String motDePasse;
	
	@Lob
	@NotEmpty(message="Please tell us about you")
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Past(message="Your date of birth should be in the past...")
	private Date dateDeNaissance;
	
	private Date dateInscription;
	
	@ManyToMany
	@NotEmpty(message="Please select at least one interest")
	private List<Interet> interets;
}
