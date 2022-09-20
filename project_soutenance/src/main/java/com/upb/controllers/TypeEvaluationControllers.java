package com.upb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.TypeEvaluation;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class TypeEvaluationControllers {
	
	@Autowired
	Iservice service;
	private TypeEvaluation typeEvaluation = new TypeEvaluation();
	private List<TypeEvaluation> listTypeEvaluation = new ArrayList<>();
	private TypeEvaluation selectedTypeEvaluation = new TypeEvaluation();
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	private CommandButton btnSupprimer = new CommandButton();
	
	
	public void enregistrer() {
		service.addObject(typeEvaluation);
	}
	
	public void selectionnerLigne() {
		setTypeEvaluation(selectedTypeEvaluation);
		this.btnEnregistrer.setDisabled(true);
	}
	
	public TypeEvaluation getTypeEvaluation() {
		return typeEvaluation;
	}
	public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
		this.typeEvaluation = typeEvaluation;
	}
	
	@SuppressWarnings("unchecked")
	public List<TypeEvaluation> getListTypeEvaluation() {
		listTypeEvaluation = service.getObjects("TypeEvaluation");
		System.out.println("================Taille de la liste:" +listTypeEvaluation.size());
		return listTypeEvaluation;
	}
	public void setListTypeEvaluation(List<TypeEvaluation> listTypeEvaluation) {
		this.listTypeEvaluation = listTypeEvaluation;
	}
	public TypeEvaluation getSelectedTypeEvaluation() {
		return selectedTypeEvaluation;
	}
	public void setSelectedTypeEvaluation(TypeEvaluation selectedTypeEvaluation) {
		this.selectedTypeEvaluation = selectedTypeEvaluation;
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
