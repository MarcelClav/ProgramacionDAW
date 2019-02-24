package daw;

public abstract class Reptil extends Animal implements InterfazExamen {

	protected int num_patas;
	
	public Reptil(String nombre, int edad, int num_patas) {
		super(nombre, edad);
		this.num_patas = num_patas;
	}
	
	public String toString() {
		return super.toString() + ",num_patas= " + this.num_patas;
	}

	public int getNum_patas() {
		return num_patas;
	}
	
}
