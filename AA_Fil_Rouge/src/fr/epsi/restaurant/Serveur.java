package fr.epsi.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	
	private final List<I_Commande> commandesPrise = new ArrayList<I_Commande>();
	
	private String nom;
	private double salaire;
	
	
	
	public Serveur(String nom, double salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public void addCommande(CommandeNourriture commandeNourriture)
	{
		this.commandesPrise.add(commandeNourriture);
	}

	public List<I_Commande> getCommandesPrise() {
		return commandesPrise;
	}
	
	
	
	
	

}
