package daw;

public abstract class Mamifero extends Animal implements InterfazExamen {

	protected String nombre_madre;
	protected boolean tienePelo;
	
	public Mamifero(String nombre, int edad, int talla, String nombre_madre) {
		super(nombre, edad);
		this.talla = talla;
		this.nombre_madre = nombre_madre;
		this.precio_base += 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", nombre_madre= " + this.nombre_madre + ", tiene_pelo= " + this.tienePelo;
	}

	public String getNombre_madre() {
		return nombre_madre;
	}

	public void setNombre_madre(String nombre_madre) {
		this.nombre_madre = nombre_madre;
	}

	public boolean isTienePelo() {
		return tienePelo;
	}
	
	
	
}
