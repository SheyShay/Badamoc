package controllers;

public class articles {

	int idArticle;
    String nameArticle, descriptionArticle, familleArticle, typeArticle;
    int prixAchatArticle, prixVenteArticle, quantiteArticle;
    
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getNameArticle() {
		return nameArticle;
	}

	public void setNameArticle(String nameArticle) {
		this.nameArticle = nameArticle;
	}

	public String getDescriptionArticle() {
		return descriptionArticle;
	}

	public void setDescriptionArticle(String descriptionArticle) {
		this.descriptionArticle = descriptionArticle;
	}

	public String getFamilleArticle() {
		return familleArticle;
	}

	public void setFamilleArticle(String familleArticle) {
		this.familleArticle = familleArticle;
	}

	public String getTypeArticle() {
		return typeArticle;
	}

	public void setTypeArticle(String typeArticle) {
		this.typeArticle = typeArticle;
	}

	public int getPrixAchatArticle() {
		return prixAchatArticle;
	}

	public void setPrixAchatArticle(int prixAchatArticle) {
		this.prixAchatArticle = prixAchatArticle;
	}

	public int getPrixVenteArticle() {
		return prixVenteArticle;
	}

	public void setPrixVenteArticle(int prixVenteArticle) {
		this.prixVenteArticle = prixVenteArticle;
	}

	public int getQuantiteArticle() {
		return quantiteArticle;
	}

	public void setQuantiteArticle(int quantiteArticle) {
		this.quantiteArticle = quantiteArticle;
	}

	public articles(int idArticle, String nameArticle, String descriptionArticle, String familleArticle,
			String typeArticle, int prixAchatArticle, int prixVenteArticle, int quantiteArticle) {
		this.idArticle = idArticle;
		this.nameArticle = nameArticle;
		this.descriptionArticle = descriptionArticle;
		this.familleArticle = familleArticle;
		this.typeArticle = typeArticle;
		this.prixAchatArticle = prixAchatArticle;
		this.prixVenteArticle = prixVenteArticle;
		this.quantiteArticle = quantiteArticle;
	}
    
	
    
}
