package com.upb.model;
// Generated 14 sept. 2022 � 17:02:16 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Filiere generated by hbm2java
 */
@Entity
@Table(name = "filiere", catalog = "gestion_reclamation")
public class Filiere implements java.io.Serializable {

	private int idFiliere;
	private String nomFiliere;
	private Set<Etudiant> etudiants = new HashSet<Etudiant>(0);

	public Filiere() {
	}

	public Filiere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	public Filiere(int idFiliere, String nomFiliere, Set<Etudiant> etudiants) {
		this.idFiliere = idFiliere;
		this.nomFiliere = nomFiliere;
		this.etudiants = etudiants;
	}

	@Id
	@GenericGenerator(name="lekerand" , strategy="increment")
	@GeneratedValue(generator="lekerand")
	@Column(name = "ID_FILIERE", unique = true, nullable = false)
	public int getIdFiliere() {
		return this.idFiliere;
	}

	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	@Column(name = "NOM_FILIERE", length = 100)
	public String getNomFiliere() {
		return this.nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filiere")
	public Set<Etudiant> getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
