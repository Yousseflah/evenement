package com.exercice.evenement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercice.evenement.entity.Evenement;
import com.exercice.evenement.service.EvenementService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@RestController
@RequestMapping(path="/evenements")
public class EvenementController {
	
	@Autowired
	EvenementService evenementService;
	
	
	@GetMapping(path="/")
	public List<Evenement> getAllEvents(){
		log.info("Lister tous les évenements");
		return evenementService.getEvents();
	}

	
	@GetMapping(path="/{id}")
	public Evenement getEvent(@PathVariable Long id) {
		log.info("Lister l'événement numero " + id);
		return evenementService.getEvent(id);
	}
	
	@PostMapping(path="/add")
	public @ResponseBody Evenement addEvent(@Valid @RequestBody Evenement evenement) {
		log.info("ajouter l'événement " + evenement.getNom());
		return evenementService.addEvent(evenement);
	}
	

}
