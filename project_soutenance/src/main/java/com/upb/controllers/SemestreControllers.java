package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Semestre;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class SemestreControllers {
	
	@Autowired
	Iservice service;
	private Semestre semestre = new Semestre();
	private List<Semestre> listSemestre = new ArrayList<Semestre>();
	private Semestre selectedSemestre = new Semestre();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	public void enregistrer() {
		service.addObject(semestre);
	}
	
	public void selectionnerLigne() {
		setSemestre(selectedSemestre);
		this.btnEnregistrer.setDisabled(true);
		
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	@SuppressWarnings("unchecked")
	public List<Semestre> getListSemestre() {
		listSemestre = service.getObjects("Semestre");
		System.out.println("============Taille de la liste:" +listSemestre.size());
		return listSemestre;
	}
	public void setListSemestre(List<Semestre> listSemestre) {
		this.listSemestre = listSemestre;
	}
	public Semestre getSelectedSemestre() {
		return selectedSemestre;
	}
	public void setSelectedSemestre(Semestre selectedSemestre) {
		this.selectedSemestre = selectedSemestre;
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
