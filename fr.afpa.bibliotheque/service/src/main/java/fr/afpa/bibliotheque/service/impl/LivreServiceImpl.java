package fr.afpa.bibliotheque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;
import fr.afpa.bibliotheque.service.LivreService;

@Service
public class LivreServiceImpl implements LivreService {
	
	@Autowired
	LivreRepository repoLivre;

	@Override
	public String createLivre(Livre livre) {
		return repoLivre.createLivre(livre);
	}
	
	@Override
	public String deleteLivre(Livre livre) {
		return repoLivre. deleteLivre(livre);
	}
	
	@Override
	public List<Livre> findLivreByTitle(String titre) {
		return repoLivre.findLivreByTitle(titre);
	}
	
	@Override
	public  List<Livre> findAll() {
		// TODO Auto-generated method stub
		return repoLivre.findAll();
	}
}
