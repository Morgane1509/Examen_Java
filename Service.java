
public class Service implements IService{
	private int id;
	private String libelle;

	public String getLibelle(){
		return libelle;
	}

	public void setLibelle(String a){
		this.libelle = a;
	}

	public int getId(){
		return id;
	}

	public void setId(int b){
		this.id = b;
	}
	
	@Override
	public String affiche(){
		return "Id:"+this.id+" "+" Libellé"+this.libelle;
	}

	public Boolean compare(int id){
	
	}

	public Boolean compare(String libelle){

	}

	public String Service(id,libelle){

	}


}