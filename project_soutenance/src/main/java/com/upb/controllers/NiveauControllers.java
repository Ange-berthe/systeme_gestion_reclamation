package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Niveau;
import com.upb.service.Iservice;


@Component
@Scope("session")
public class NiveauControllers {
	
	@Autowired
	Iservice service;
	private Niveau niveau = new Niveau();
	private List<Niveau> listNiveau = new ArrayList<Niveau>();
	private Niveau selectedNiveau = new Niveau();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	public void enregistrer() {
		service.addObject(niveau);
	}
	
	public void selectionnerLigne() {
		setNiveau(selectedNiveau);
		this.btnEnregistrer.setDisabled(true);
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	@SuppressWarnings("unchecked")
	public List<Niveau> getListNiveau() {
		listNiveau = service.getObjects("Niveau");
		return listNiveau;
	}
	public void setListNiveau(List<Niveau> listNiveau) {
		this.listNiveau = listNiveau;
	}
	public Niveau getSelectedNiveau() {
		return selectedNiveau;
	}
	public void setSelectedNiveau(Niveau selectedNiveau) {
		this.selectedNiveau = selectedNiveau;
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
