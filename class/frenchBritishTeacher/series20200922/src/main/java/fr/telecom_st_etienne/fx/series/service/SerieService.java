package fr.telecom_st_etienne.fx.series.service;

import java.util.List;

import fr.telecom_st_etienne.fx.series.business.Serie;

public interface SerieService {

	Serie ajouterSerie(String nom, float prixEnEuros);
	
	List<Serie> recupererSeries();
}
