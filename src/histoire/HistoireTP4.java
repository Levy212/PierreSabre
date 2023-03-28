package histoire;
import personnages.Humain;
import personnages.Commercant;
public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.parler(prof.direBonjour());
//		prof.parler(prof.acheter("une boisson", 12));
//		prof.parler(prof.boire());
//		prof.parler(prof.acheter("un jeu", 2));
//		prof.parler(prof.acheter("un kimono", 50));
		Commercant marco = new Commercant("Marco", "thé", 20);
		marco.parler(marco.direBonjour());
		marco.parler("J'ai tout perdu! le monde est trop injuste...");
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.parler(marco.boire());

	}

}
