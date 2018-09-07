package Modelo;

public class Mundo {
	
	Persistencia bd;
	
	public Mundo()
	{
		bd = new Persistencia();
	}

	public Persistencia getBd() {
		return bd;
	}

	public void setBd(Persistencia bd) {
		this.bd = bd;
	}
	
	
}
