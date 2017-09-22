
public class Cargo {
	
	public int id;
	public String descrip;
	public double sueldo;

	public Cargo(int id, String descrip, double sueldo){
		this.id=id;
		this.descrip = descrip;
		this.sueldo= sueldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSalario(double sueldo) {
		this.sueldo = sueldo;
	}

}