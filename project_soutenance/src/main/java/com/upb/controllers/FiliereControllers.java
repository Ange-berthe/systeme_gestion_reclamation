package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Filiere;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class FiliereControllers {
	
	@Autowired
	Iservice service;
	private Filiere filiere = new Filiere();
	private List<Filiere> listFiliere = new ArrayList<Filiere>();
	private Filiere selectedFiliere = new Filiere();
			
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	
	
	public void Enregistrer() {
		service.addObject(filiere);
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	public void selectionnerLigne() {
		setFiliere(selectedFiliere);
		this.btnEnregistrer.setDisabled(true);
	}
	@SuppressWarnings("unchecked")
	public List<Filiere> getListFiliere() {
		listFiliere = service.getObjects("Filiere");
		System.out.println("===========Taille de la liste:" +listFiliere.size());
		return listFiliere;
	}
	public void setListFiliere(List<Filiere> listFiliere) {
		this.listFiliere = listFiliere;
	}
	public Filiere getSelectedFiliere() {
		return selectedFiliere;
	}
	public void setSelectedFiliere(Filiere selectedFiliere) {
		this.selectedFiliere = selectedFiliere;
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
	public CommandButton getBtnSupprimer() {
		return btnSupprimer;
	}
	public void setBtnSupprimer(CommandButton btnSupprimer) {
		this.btnSupprimer = btnSupprimer;
	}
	
}
