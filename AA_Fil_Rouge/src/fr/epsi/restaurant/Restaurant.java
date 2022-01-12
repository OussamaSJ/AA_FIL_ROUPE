package fr.epsi.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private List<Serveur>serveurs;
	private List<Table> tables;
	private List<I_Commande> tachesCuisine;
	
	
	
	public Restaurant(List<Serveur>P_serveur, List<Table> P_tables) {
		this.serveurs = P_serveur;
		this.tables = P_tables;
	}

	
	public List<Serveur>getServeurs()
	{
		return serveurs;
	}

	public List<I_Commande> getTaches(){
		return tachesCuisine;
	}
	

	public List<Table> tablesDisponible()
	{
		List<Table> tablesDisponible = new ArrayList<Table>();
		for(Table table : tables)
		{
			if(table.isEstLibre())
			{
				tablesDisponible.add(table);
			}
		}
		return tablesDisponible;
	}

	
	public void demarerService()
	{
		
	}
	
	

	
	
	
	
	

}
