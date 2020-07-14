import java.time.LocalDate

public class Embauche extends Employe{
	private double salaire;
	private LocalDate dateEmb;
	
	public double getSalaire(){
		return salaire;
	}

	public void setSalaire(String a){
		this.salaire = a;
	}

	public LocalDate getDateEmb(){
		return dateEmb;
	}

	public void setDateEmb(int b){
		this.dateEmb = b;
	}
	
	@Override 
	public String affiche(){
		return super.affiche+" Salaire:"+this.salaire+" "+"Date:"+this.dateEmb;
	}

}