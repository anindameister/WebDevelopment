package fr.telecom_st_etienne.fx.series.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.telecom_st_etienne.fx.series.business.Serie;
import fr.telecom_st_etienne.fx.series.service.SaisonService;
import fr.telecom_st_etienne.fx.series.service.SerieService;

@Controller
@RequestMapping("/")
public class SeriesController {

	@Autowired
	private SerieService serieService;

	@Autowired
	private SaisonService saisonService;
	
	@RequestMapping(value = { "/index", "/" })
	public ModelAndView accueil() {
		ModelAndView mav = new ModelAndView();
		// This will use the index.jsp view
		mav.setViewName("index");
		// Let's add objects to the ModelAndView
		mav.addObject("series", serieService.recupererSeries());
		return mav;
	}
		
	
	 @PostConstruct
	 private void init() {
		 System.out.println("Invocation de la méthode init()");
		 if (serieService.recupererSeries().isEmpty()) {
			 Serie serie1 = serieService.ajouterSerie("Umbrella Academy", 40f);
			 Serie serie2 = serieService.ajouterSerie("Game of Thrones", 60f);
			 saisonService.ajouterSaison("Saison 1", serie1);
			 saisonService.ajouterSaison("Saison 1", serie2);
		}
		 
	 }
}