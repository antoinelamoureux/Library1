package fr.afpa.bibliotheque.repository;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreRepository {
	String createLivre(Livre livre);
	String deleteLivre(Livre livre);
	List<Livre> findLivreByTitle(String titre);
	List<Livre> findAll();
}