
public abstract class Employe implements IService{
	protected int id;
	protected String nomComplet;

	public String getNomComplet(){
		return nomComplet;
	}

	public void setNomComplet(String a){
		this.nomComplet = a;
	}

	public int getId(){
		return id;
	}

	public void setId(int b){
		this.id = b;
	}
	
	@Override
	public String affiche(){
		return "Id:"+this.id+" "+" Nom et Prénom"+this.nomComplet;
	}
	
	public Boolean isEmbauche(){
		
	}

	public Boolean isJournalier(){
		
	}

}