package fr.telecom_st_etienne.fx.series.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.telecom_st_etienne.fx.series.business.Saison;
import fr.telecom_st_etienne.fx.series.business.Serie;
import fr.telecom_st_etienne.fx.series.dao.SaisonDao;
import fr.telecom_st_etienne.fx.series.service.SaisonService;

@Service
public class SaisonServiceImpl implements SaisonService {

	@Autowired // Asks the framework to inject a DAO object in the service
	private SaisonDao saisonDao;
	
	@Override
	public Saison ajouterSaison(String nom, Serie serie) {
		Saison saison = new Saison();
		saison.setNom(nom);
		saison.setSerie(serie);
		saisonDao.save(saison);
		return saison;
	}

	@Override
	public List<Saison> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
