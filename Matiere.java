package Ecole;

public class Matiere {
	// Attributs
	private String m_nom = "";
	private int m_coef =1;
	private float m_note = 10f;
	
	// Méthodes
	//Constructeurs 
	public Matiere() {}
	public Matiere(String nom) {
		m_nom = nom;
	}
	public Matiere(String nom,int coef, float note) {
		m_nom = nom;
		m_coef = coef;
		m_note = note;
	}
	// On peut rajouter un constructeur de recopie
	public Matiere(Matiere m) {
		m_nom = m.m_nom;
		m_coef = m.m_coef;
		m_note = m.m_note;
	}
	// Accesseurs
	public String getNom() {return m_nom;}
	public int getCoef() {return m_coef;}
	public float getNote() {return m_note;}
	// Mutateurs
	public void setNom(String nom) {m_nom = nom;}
	public void setCoef(int coef) {m_coef = coef;}// Ajout de contrôle sur mutateur
	public void setNote(float note) {m_note = note;}
	// Autres méthodes 
	public String afficher() {return m_nom+ ": Coef " + m_coef+ ";Note " + m_note;}
}