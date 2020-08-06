package fr.afpa.bibliotheque.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;
import fr.afpa.bibliotheque.repository.mapper.LivreMapper;
import lombok.extern.log4j.Log4j;

@Log4j
@Repository
public class LivreRepositoryImpl implements LivreRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String createLivre(Livre livre) {
	try {
		String query = "INSERT INTO LIVRE(code, description, isbn, titre) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(query, livre.getCode(), livre.getDescritption(), livre.getIsbn(), livre.getTitre());
		return livre.toString();
	} catch (DuplicateKeyException e) {
		// TODO Auto-generated catch block
		log.error(e);
		return "error";
	}
	}

	@Override
	public String deleteLivre(Livre livre) {
		try {
			String query = "DELETE FROM LIVRE WHERE LIVRE.TITRE = ?";
			jdbcTemplate.update(query, livre.getTitre());
			return livre.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e);
			return "error";
		}
	}
	
	@Override
	public List<Livre> findLivreByTitle(String titre) {
			String query = "SELECT * FROM LIVRE WHERE LIVRE.TITRE = ?";
			return jdbcTemplate.query(query, new Object[]{titre}, new LivreMapper());
}
	@Override
	public List<Livre> findAll() {
			String query = "SELECT * FROM LIVRE";
			return jdbcTemplate.query(query, new LivreMapper());
}
}