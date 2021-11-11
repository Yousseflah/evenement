package com.exercice.evenement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercice.evenement.entity.Evenement;
import com.exercice.evenement.exception.ResourceNotFoundException;
import com.exercice.evenement.repository.EvenementRepository;

@Service
public class EvenementService {
	
	@Autowired
	private EvenementRepository evenementRepository;
	
	public List<Evenement> getEvents(){
		List<Evenement> evenements = new ArrayList<>();
		evenementRepository.findAll().forEach(evenements::add);
		return evenements;
	}
	
	public Evenement getEvent(Long id) {
		return evenementRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Evenement " + id + "not found"));
	}
	
	public Evenement addEvent(Evenement ev) {
		return evenementRepository.save(ev);
	}
}
