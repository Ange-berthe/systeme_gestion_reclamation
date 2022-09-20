package com.upb.controllers;

import com.upb.service.Iservice;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import com.upb.model.Genre;

@Component
@Scope("session")
public class GenreControllers {
	
	@Autowired
	Iservice service;
	private Genre genre = new Genre();
	private List<Genre> listgenre = new ArrayList<Genre>();
	private Genre selctedGenre = new Genre();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnAnnuler = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	
	public void enregistrer() {
		//pousser en base de données
		service.addObject(genre);
	}
	
	
	public Genre getGenre() {
		return genre;
		
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
		
	}
	
	public void selectionnerLigne() {
		setGenre(selctedGenre);
		this.btnEnregistrer.setDisabled(true);
	}
	
	@SuppressWarnings("unchecked")
	public List<Genre> getListgenre() {
		listgenre = service.getObjects("Genre");
		System.out.println("============== Taille de la liste:"+listgenre.size());
		return listgenre;
		
	}
	public void setListgenre(List<Genre> listgenre) {
		this.listgenre = listgenre;
		
	}
	public CommandButton getBtnEnregistrer() {
		return btnEnregistrer;
		
	}
	public void setBtnEnregistrer(CommandButton btnEnregistrer) {
		this.btnEnregistrer = btnEnregistrer;
		
	}
	public CommandButton getBtnModifier() {
		return btnModifier;
		
	}
	public void setBtnModifier(CommandButton btnModifier) {
		this.btnModifier = btnModifier;
		
	}
	public CommandButton getBtnAnnuler() {
		return btnAnnuler;
		
	}
	public void setBtnAnnuler(CommandButton btnAnnuler) {
		this.btnAnnuler = btnAnnuler;
		
	}
	public CommandButton getBtnSupprimer() {
		return btnSupprimer;
		
	}
	public void setBtnSupprimer(CommandButton btnSupprimer) {
		this.btnSupprimer = btnSupprimer;
		
	}


	public Genre getSelctedGenre() {
		return selctedGenre;
		
	}


	public void setSelctedGenre(Genre selctedGenre) {
		this.selctedGenre = selctedGenre;
		
	}

}
