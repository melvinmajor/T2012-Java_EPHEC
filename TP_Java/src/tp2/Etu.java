package tp2;

import javax.swing.JOptionPane;

public class Etu {
  private String nom;
  private String prenom;
  private int matricule;
  public Etu() {
    this.nom = JOptionPane.showInputDialog("Entrez le nom");
    this.prenom = JOptionPane.showInputDialog("Entrez le prénom");
    this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule"));
  }
  public Etu(String nom, String prenom, int matricule) {
    this.nom = nom;
    this.prenom = prenom;
    this.matricule = matricule;
  }
  public Etu (String nom, String prenom, String matricule) {
    this.nom = nom;
    this.prenom = prenom;
    this.matricule = Integer.parseInt(matricule);
  }
  public Etu(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
    this.matricule = Integer.parseInt(JOptionPane.showInputDialog("Entrez le matricule"));
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public String getNom() {
    return this.nom; //this pas du tout obligatoire dans ce get car aucune autre instance nom présent dedans).
  }
  public String getPrenom() {
	return prenom;
  }
  public void setPrenom(String prenom) {
	this.prenom = prenom;
  }
  public int getMatricule() {
	return matricule;
  }
  public void setMatricule(int matricule) {
	this.matricule = matricule;
  }
}