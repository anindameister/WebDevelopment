package fr.telecom_st_etienne.fx.series.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.telecom_st_etienne.fx.series.business.Episode;

public interface EpisodeDao extends JpaRepository<Episode, Long> {

}
