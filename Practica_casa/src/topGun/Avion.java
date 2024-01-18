package topGun;

public class Avion {
	
	//ATRIBUTOS
	
	private int idAvion = 0;
	private String modAvion;
	private int capAvion = 0;
	private Piloto piloto;
	
	public void mostrarPiloto() {
		System.out.print("Numero avion: "+ idAvion + " Modelo: " + modAvion+  
				" Capacidad: " + capAvion + " Piloto: "+ piloto);
	}

	//CONSTRUCTOR
	
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	//GETTERS Y SETTERS
	
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	
	
	
	
	
	
}
