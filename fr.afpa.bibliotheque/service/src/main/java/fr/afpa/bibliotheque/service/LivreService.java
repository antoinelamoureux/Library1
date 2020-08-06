package fr.afpa.bibliotheque.service;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreService {
	String createLivre(Livre livre);
	String deleteLivre(Livre livre);
	List<Livre> findLivreByTitle(String titre);
	List<Livre> findAll();
}
