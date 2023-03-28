package histoire;
import personnages.Humain;
public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.parler(prof.direBonjour());
		prof.parler(prof.acheter("une boisson", 12));
		prof.parler(prof.boire());
		prof.parler(prof.acheter("un jeu", 2));
		prof.parler(prof.acheter("un kimono", 50));

	}

}
