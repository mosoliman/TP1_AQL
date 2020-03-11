package TP1;

public class CV {
//test commit
	String nom;
	String prenom;
	String formation;
	int experience;
	String[] competences;
	String attentes;

	public void affiche() {
		String comp = "";
		for (int i = 0; i < competences.length; i++) {
			comp += competences[i];
			comp += " ";
		}

		System.out.println("\n" + "Nom : " + this.nom + "\n" + "Prenom : " + this.prenom + "\n" + "Formation : "
				+ this.formation + "\n" + "Anneés d'experience : " + this.experience + "\n" + "Compétences : " + comp
				+ "\n" + "Attentes : " + this.attentes + "\n" + "---------------------------");
	}

	public CV(String Nom, String Prenom, String Formation, int Experience, String[] Competences, String Attentes) {
		this.nom = Nom;
		this.prenom = Prenom;
		this.formation = Formation;
		this.experience = Experience;
		this.competences = Competences;
		this.attentes = Attentes;
	}

	public static void main(String[] args) {

		String[] compMo = { "C++", "JAVA", "HTML", "CSS" };
		String[] compKa = { "C#", "Java", "javascript", "PHP" };

		System.out.println("Bienvenue chez Barette!");

		CV cvMoSol = new CV("Soliman", "Mohammad", "Programmeur", 3, compMo, "Bon cours");
		cvMoSol.affiche();

		CV cvKaAoun = new CV("Aoun", "Karl", "Programming", 4, compKa, "Aucune");
		cvKaAoun.affiche();
	}
}
