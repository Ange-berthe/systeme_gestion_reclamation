package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.MotifReclamation;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class MotifReclamationControllers {
	
	@Autowired
	Iservice service;
	private MotifReclamation motifReclamation = new MotifReclamation();
	private List<MotifReclamation> listMotifReclamation = new ArrayList<MotifReclamation>();
	private MotifReclamation selectedMotifReclamation = new MotifReclamation();
	
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	
	public void enregistrer() {
		service.addObject(motifReclamation);
	}
	
	public void selectionnerLigne() {
		setMotifReclamation(selectedMotifReclamation);
		this.btnEnregistrer.setDisabled(true);
	}
	
	public MotifReclamation getMotifReclamation() {
		return motifReclamation;
	}
	public void setMotifReclamation(MotifReclamation motifReclamation) {
		this.motifReclamation = motifReclamation;
	}
	
	@SuppressWarnings("unchecked")
	public List<MotifReclamation> getListMotifReclamation() {
		listMotifReclamation = service.getObjects("MotifReclamation");
		System.out.println("==============Taille de la liste:" +listMotifReclamation.size());
		return listMotifReclamation;
	}
	public void setListMotifReclamation(List<MotifReclamation> listMotifReclamation) {
		this.listMotifReclamation = listMotifReclamation;
	}
	public MotifReclamation getSelectedMotifReclamation() {
		return selectedMotifReclamation;
	}
	public void setSelectedMotifReclamation(MotifReclamation selectedMotifReclamation) {
		this.selectedMotifReclamation = selectedMotifReclamation;
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
