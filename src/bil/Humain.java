package bil;

import java.util.List;

public class Humain {
	String nom;
	String prenom;	
	Integer age;	
	Integer numeroSocial;
	List<String> autresPrenomList;
	
	public Humain() {
			}

	public Humain(String nom, String prenom, Integer age,int i, List<String> listPren) {
		this.nom = nom;
		this.prenom = prenom;		
		this.age = age;		
		this.numeroSocial = i;
		this.autresPrenomList = listPren;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNumeroSocial() {
		return numeroSocial;
	}

	public void setNumeroSocial(Integer numeroSocial) {
		this.numeroSocial = numeroSocial;
	}
	

	public List<String> getAutresPrenomList() {
		return autresPrenomList;
	}

	public void setAutresPrenomList(List<String> autresPrenomList) {
		this.autresPrenomList = autresPrenomList;
	}

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numeroSocial=" + numeroSocial
				+ ", autresPrenomList=" + autresPrenomList + "]";
	}

}
