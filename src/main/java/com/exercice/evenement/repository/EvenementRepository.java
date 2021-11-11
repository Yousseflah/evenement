package com.exercice.evenement.repository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exercice.evenement.entity.Evenement;

@Repository
public interface EvenementRepository extends CrudRepository<Evenement, Long>{
	
	//static ZonedDateTime start_date = LocalDateTime.parse("2021-11-15 at 12:00", DateTimeFormatter.ofPattern("uuuu-MM-dd at HH:mm")).atZone(ZoneId.of("EST"));
	//static ZonedDateTime end_date = LocalDateTime.parse("2021-11-18 at 18:00", DateTimeFormatter.ofPattern("uuuu-MM-dd at HH:mm")).atZone(ZoneId.of("EST"));
	
	


}
