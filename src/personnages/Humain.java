package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public String direBonjour() {
		return "Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson;
	}
	
	public String boire() {
		return "Mmmm, un bon verre de "+boisson+" ! GLOUPS !";
	}
	public String acheter(String bien, int prix) {
		if(argent<prix) {
			return "Je n'ai plus que "+prix+"sous en poche. Je ne peux même pas m'offrir "+bien+" à "+argent+" sous";
		}
		else {
			perdreArgent(prix);
			return "j'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous";
		}
	}
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	public void parler(String texte) {
		System.out.println("("+nom+") -" + texte);
	}

}
