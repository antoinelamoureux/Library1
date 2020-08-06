package fr.afpa.bibliotheque.business;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreBusiness {
	String createLivre(Livre livre);
	String deleteLivre(Livre livre);
	List<Livre> findLivreByTitle(String titre);
	List<Livre> findAll();
}
