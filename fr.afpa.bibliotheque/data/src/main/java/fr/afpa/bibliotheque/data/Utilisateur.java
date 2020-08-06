package fr.afpa.bibliotheque.data;
import java.sql.Date;

import lombok.Data;

@Data
public class Utilisateur {
	private int idutilisateur;
	private String nom;
	private String prenom;
	private Date datedenaissance;
	private String role;
	private String pseudo;
	private int motdepasse;
}
