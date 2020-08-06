/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.business.TestBusiness;
import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.ihm.config.MainConfig;
import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class BibliothequeMain {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("------------------------------------------"
				+"------------------------------------------"
				+"-------------Bibliotheque-----------------"
				+"------------------------------------------"
				+"------------------------------------------");
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
	
		TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
		test.sayHello();
		
		LivreBusiness livre =  (LivreBusiness) ctx.getBean("livreBusinessImpl");
		
		log.info("Livre ajouté: ");
		Livre newLivre = new Livre();
		newLivre.setCode("9780201370");
		newLivre.setDescritption("ffdgfdgfdg");
		newLivre.setIsbn("588587285");
		newLivre.setTitre("Nouveau Livre");
		
		System.out.println(livre.createLivre(newLivre));
		
		log.info("Livre supprimé: ");
		Livre rmLivre = new Livre();
		rmLivre.setTitre("Gatsby le magnifique");
		
		System.out.println(livre.deleteLivre(rmLivre));
		
		log.info("Afficher tous les livres: ");
		List<Livre> allLivres = livre.findAll();
		
		for (Livre allLivre : allLivres) {
		System.out.println(allLivre.toString());
		}
		
		log.info("Titre du livre recherché: ");
		Scanner sc = new Scanner(System.in);
		String searchTitre = sc.nextLine();
		
		List<Livre> searchLivres = livre.findLivreByTitle(searchTitre);
		
		for (Livre searchLivre : searchLivres) {
		System.out.println(searchLivre.toString());
		}
		
		((AbstractApplicationContext) ctx).close();
	}
}
