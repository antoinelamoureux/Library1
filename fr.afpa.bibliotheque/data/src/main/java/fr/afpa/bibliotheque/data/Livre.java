package fr.afpa.bibliotheque.data;
import lombok.Data;

@Data
public class Livre {
	private int idlivre;
	private String titre;
	private String descritption;
	private String isbn;
	private String code;
}
