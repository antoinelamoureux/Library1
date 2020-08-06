
package fr.afpa.bibliotheque.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.service.LivreService;


@Component
public class LivreBusinessImpl implements LivreBusiness{
	
	@Autowired
	LivreService serviceLivre;

	@Override
	public String createLivre(Livre livre) {
		return serviceLivre.createLivre(livre);
	}

	@Override
	public String deleteLivre(Livre livre) {
		// TODO Auto-generated method stub
		return serviceLivre.deleteLivre(livre);
	}
	
	@Override
	public  List<Livre> findLivreByTitle(String titre) {
		// TODO Auto-generated method stub
		return serviceLivre.findLivreByTitle(titre);
	}
	
	@Override
	public  List<Livre> findAll() {
		// TODO Auto-generated method stub
		return serviceLivre.findAll();
	}

}