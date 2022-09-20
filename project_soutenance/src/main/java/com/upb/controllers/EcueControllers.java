package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Ecue;
import com.upb.model.Ue;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class EcueControllers {

	
	@Autowired
	Iservice service;
	private Ecue ecue = new Ecue();
	private Ue ue = new Ue();
	private List<Ecue> listEcue = new ArrayList<Ecue>();
	private Ecue selectedEcue = new Ecue();
	private String codeUe;
	private List<Ue> listUe = new ArrayList<Ue>();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	
	public void enregistrer() {
		ue = (Ue) service.getObjectById(codeUe, "Ue");
		ecue.setUe(ue);
		service.addObject(ecue);
	}
	
	public void selectionnerLigne() {
		setEcue(selectedEcue);
		this.btnEnregistrer.setDisabled(true);
	}
	public Ecue getEcue() {
		return ecue;
	}
	public void setEcue(Ecue ecue) {
		this.ecue = ecue;
	}
	public Ue getUe() {
		return ue;
	}
	public void setUe(Ue ue) {
		this.ue = ue;
	}
	
	@SuppressWarnings("unchecked")
	public List<Ecue> getListEcue() {
		listEcue = service.getObjects("Ecue");
		System.out.println("==========Taille de la liste:"+listEcue.size());
		return listEcue;
	}
	public void setListEcue(List<Ecue> listEcue) {
		this.listEcue = listEcue;
	}
	public Ecue getSelectedEcue() {
		return selectedEcue;
	}
	public void setSelectedEcue(Ecue selectedEcue) {
		this.selectedEcue = selectedEcue;
	}
	public String getCodeUe() {
		return codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
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
