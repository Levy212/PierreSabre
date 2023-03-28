package personnages;


public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent) {
		// TODO Auto-generated constructor stub
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		int moula = getArgent();
		perdreArgent(getArgent());
		return moula;
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous! Je te remercie .");
	}
}
