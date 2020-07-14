import java.time.LocalDate

public class Journalier extends Employe{
	private Local.Date duree;
	private double forfait;

	public LocalDate getDuree(){
		return duree;
	}

	public void setDuree(String a){
		this.duree = a;
	}

	public double getForfait(){
		return forfait;
	}

	public void setForfait(int b){
		this.forfait = b;
	}

	@Override 
	public String affiche(){
		return super.affiche+" Durée:"+this.duree+" "+"Forfait:"+this.forfait;
	}
}