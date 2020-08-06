package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Livre;


public class LivreMapper implements RowMapper<Livre>{

	@Override
	public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livre livre = new Livre();
		
		livre.setIdlivre(rs.getInt("idlivre"));
		livre.setTitre(rs.getString("titre"));
		livre.setDescritption(rs.getString("description"));
		livre.setIsbn(rs.getString("isbn"));
		livre.setCode(rs.getString("code"));
		return livre;
		
	}
}
