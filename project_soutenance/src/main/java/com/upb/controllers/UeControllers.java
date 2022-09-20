package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Semestre;
import com.upb.model.Ue;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class UeControllers {
	
	@Autowired
	Iservice service;
	private Ue ue = new Ue();
	private Semestre semestre = new Semestre();
	private List<Ue> listUe = new ArrayList<>();
	private Ue selectedUe = new Ue();
	private int idSemestre;
	private List<Semestre> listSemestre = new ArrayList<Semestre>();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	public void enregistrer() {
		System.out.println("lencement de la methode");
		semestre = (Semestre) service.getObjectById(idSemestre, "Semestre");
		ue.setSemestre(semestre);
		this.service.addObject(ue);
	}
	
	public void selectionnerLigne() {
		setUe(selectedUe);
		this.btnEnregistrer.setDisabled(true);
	}
	public Ue getUe() {
		return ue;
	}
	public void setUe(Ue ue) {
		this.ue = ue;
	}
	
	@SuppressWarnings("unchecked")
	public List<Ue> getListUe() {
		listUe = service.getObjects("Ue");
		System.out.println("===========Taille de la liste:" +listUe.size());
		return listUe;
	}
	public void setListUe(List<Ue> listUe) {
		this.listUe = listUe;
	}
	public Ue getSelectedUe() {
		return selectedUe;
	}
	public void setSelectedUe(Ue selectedUe) {
		this.selectedUe = selectedUe;
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

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	@SuppressWarnings("unchecked")
	public List<Semestre> getListSemestre() {
		listSemestre = service.getObjects("Semestre");
		System.out.println("===========Taille de la liste:" +listSemestre.size());
		return listSemestre;
	}

	public void setListSemestre(List<Semestre> listSemestre) {
		this.listSemestre = listSemestre;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

}
